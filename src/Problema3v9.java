public class Problema3v9 {
    public static void main(String[] args) {

        int index_palavra=0;
        int index_frase=0;
        int contador=0;
        int teste_de_igualdade;
        int inicioDePalavra=1;

        String palavra = "banana";
        String frase = "banana. boa bananas";

        for (index_frase=0; index_frase<frase.length(); index_frase++) {

            //se não for letra pula para próximo caractere
            while (index_frase<frase.length() && !ehLetra(frase.charAt(index_frase))){
                if (frase.charAt(index_frase)==32) {
                    //System.out.println("espaço");
                    inicioDePalavra=1;
                    index_palavra=0;}
                index_frase++;
            }

            if (index_frase==frase.length()) break; ///foi

            teste_de_igualdade = frase.charAt(index_frase) - palavra.charAt(index_palavra);
            //letra é igual
            if (inicioDePalavra==1 && teste_de_igualdade == 0) {
                index_palavra++;
                //chegou no fim da palavra, ou seja achou uma palavra
                if (index_palavra == palavra.length()) {

                    if (index_frase+1==frase.length() || !ehLetra(frase.charAt(index_frase+1)))
                    contador = contador + 1;
                    index_palavra=0;
                }
            }
            else {
                inicioDePalavra=0;}
        }
        System.out.println(contador);
    }

    //ASCII A=65 Z=90 a=97 z=122
    public static boolean ehLetra (char c){
        if ( c < 65 || c > 122 || ( c > 90 && c < 97)) return false;
        else return true;
    }

    //ASCII espaço=32
    public static boolean ehEspaco (char c){
        if (c==32) return true;
        else return false;
    }

}