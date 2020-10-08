public class Problema3v2 {

    public static void main(String args[]) {

        String frase = "eu gosto de banana. Você que bananas coma banana";
        String palavra = "banana";
        String auxword = "";
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (auxword.equals(palavra)) {
                contador += 1;
            }

            auxword += frase.charAt(i);

            if (frase.charAt(i) == ' ') {
                auxword = "";
            }
        }

        System.out.println("\nPalavras encontradas: " + contador);

    }
}
