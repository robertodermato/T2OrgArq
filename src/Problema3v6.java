public class Problema3v6 {
    public static void main(String[] args) {

        int index_palavra=0;
        int index_frase=0;
        int contador=0;
        int teste_de_igualdade;

        String palavra = "banana";
        String frase = "banana é bom. coma banana";

        for (int i=0; i<frase.length(); i++) {
            teste_de_igualdade = frase.charAt(index_frase) - palavra.charAt(index_palavra);

            //letra é igual
            if (teste_de_igualdade == 0) {
                index_palavra++;

                //chegou no fim da palavra, ou seja achou uma palavra
                if (index_palavra == palavra.length()) {
                    contador = contador + 1;
                    index_palavra=0;
                }
            }
            index_frase++;
        }
        System.out.println(contador);
    }
}
