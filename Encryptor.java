public class Encryptor {
    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String text = "Ola meu nome e Mateus"; // OUTPUT 40.11.0.12.4.20.13.14.12.4.4.38.0.19.4.20.18

        text = text.replace(" ", "");

        for (int i = 0;i < text.length();i++) {
            char letterText = text.charAt(i);
            int positionInitial = alphabet.indexOf(letterText);
            if(i == 0){
                System.out.print(positionInitial);
            } else {
                System.out.print('.');
                System.out.print(positionInitial);
            }
        }
    }
}