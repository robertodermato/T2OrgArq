public class Problema3v3 {

    public static void main(String args[]) {

        String frase = "eu gosto de banana. Você que bananas coma banana";
        String palavra = "banana";

        int contador = 0;
        int indexPalavra = 0;
        int indexFrase = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.length() < indexFrase && palavra.charAt(indexPalavra)==frase.charAt(indexFrase)) {
                indexPalavra++;
                indexFrase++;
            }
            else {
                indexPalavra = 0;
                indexFrase++;
            }

            if (indexPalavra==palavra.length()){
                if (frase.charAt(indexFrase)==' ' || frase.charAt(indexFrase)=='.' || frase.charAt(indexFrase)==',') {
                    contador++;
                    System.out.println("oi");
                    indexPalavra = 0;
                }
                else
                    indexPalavra=0;
            }

        }

        System.out.println("\nPalavras encontradas: " + contador);

    }
}

