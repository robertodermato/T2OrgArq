public class Problema3v4 {
    public static void main(String[] args) {
        String frase = "era. uma vez uma menera eraera que era muito bonita.";
        String palavraBuscada = "era";

        int indexFrase=0;
        int indexPalavraBuscada=0;
        int contador=0;

        //vai percorrendo a frase
        while (indexFrase<frase.length()){

            //se for início de uma palavra e o primeiro caracter da palavra está na próxima palavra da frase
            if (palavraBuscada.charAt(indexPalavraBuscada)==frase.charAt(indexFrase)){

                //vai percorrendo a palavra buscada para ver se está certo
                while(indexPalavraBuscada<palavraBuscada.length()){

                    if (palavraBuscada.charAt(indexPalavraBuscada)==frase.charAt(indexFrase)){
                        indexPalavraBuscada++;
                        indexFrase++;
                    }
                    else break;
                }

                //se achou uma palavra precisa checar se o que vem depois é espaço vazio
                if (indexPalavraBuscada==palavraBuscada.length()){
                    contador++;
                }

                indexPalavraBuscada=0;
            }

            //não é início de palavra ou o caracter não é igual
            else{
                indexFrase++;
            }

        }

        System.out.println("Palavras: " + contador);
    }
}
