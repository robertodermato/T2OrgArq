public class P3v10 {
        public static void main(String[] args) {

            int index_palavra=0;
            int index_frase=0;
            int contador=0;
            int teste_de_igualdade;
            int inicioDePalavra=1;

            String palavra = "banana";
            String frase = "banana banana boa bananas";

            for (index_frase=0; index_frase<frase.length(); index_frase++) {
                if (index_frase==frase.length()) break;
                if (frase.charAt(index_frase)==32) {
                    inicioDePalavra=1;
                    index_palavra=0;
                    index_frase++;
                }
                teste_de_igualdade = frase.charAt(index_frase) - palavra.charAt(index_palavra);
                if (inicioDePalavra==1 && teste_de_igualdade == 0) {
                    index_palavra++;
                    if (index_palavra == palavra.length()) {
                        inicioDePalavra=0;
                        if (index_frase+1==frase.length() || frase.charAt(index_frase+1)==32)
                            contador = contador + 1;
                        index_palavra=0;
                    }
                }
                else {inicioDePalavra=0;}
            }
            System.out.println(contador);
        }


    }


