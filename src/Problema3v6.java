public class Problema3v6 {
    public static void main(String[] args) {

        int index_palavra = 0;
        int index_frase = 0;
        int contador = 0;
        int teste_de_igualdade;

        String palavra = "banana";
        String frase = "banana é bom. Coma sbanana sbanana";

        for (index_frase = 0; index_frase < frase.length(); index_frase++) {

            if (index_frase==0 || (frase.charAt(index_frase+1)==' ')) {



                teste_de_igualdade = frase.charAt(index_frase) - palavra.charAt(index_palavra);
                //letra é igual
                if (teste_de_igualdade == 0) {
                    index_palavra++;
                    //chegou no fim da palavra, ou seja achou uma palavra
                    if (index_palavra == palavra.length()) {

                        //ASCII A=65 Z=90 a=97 z=122
                        if (index_frase + 1 == frase.length() || frase.charAt(index_frase + 1) < 65 ||
                                frase.charAt(index_frase + 1) > 122 || (frase.charAt(index_frase + 1) > 90
                                && frase.charAt(index_frase + 1) < 97)) {
                            contador++;
                            index_palavra = 0;
                        }
                    }
                }
            }
        }
        System.out.println(contador);
    }

}
