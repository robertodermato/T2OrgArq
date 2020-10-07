// Problema 3: Escreva um programa que determina o numero de vezes que
// uma palavra ocorre em uma frase. Para isso, defina dois strings, onde um
// contem diversas palavras e outro uma unica palavra.

public class Problema3 {
    public static void main(String[] args) {
        String frase = "era uma vez uma menera era era que era muito bonita.";
        String palavraBuscada = "era";

        int indexFrase=0;
        int indexPalavraBuscada=0;
        int contador=0;
        int ehInicioPalavra=1;

        //vai percorrendo a frase
        while (indexFrase<frase.length()){

            //se achar um espaço significa o próximo caracter é início de uma palavra
            if (frase.charAt(indexFrase)==' '){
                ehInicioPalavra=1;
                indexFrase++;
            }

            //se for início de uma palavra e o primeiro caracter da palavra está na próxima palavra da frase
            if (ehInicioPalavra==1 && palavraBuscada.charAt(indexPalavraBuscada)==frase.charAt(indexFrase)){

                //vai percorrendo a palavra buscada para ver se está certo
                while(indexPalavraBuscada<palavraBuscada.length()){

                    if (palavraBuscada.charAt(indexPalavraBuscada)==frase.charAt(indexFrase)){
                        indexPalavraBuscada++;
                        indexFrase++;
                        ehInicioPalavra=0;
                    }
                    else break;
                }

                //se achou uma palavra precisa checar se o que vem depois é espaço vazio
                if (indexPalavraBuscada==palavraBuscada.length() && frase.charAt(indexFrase)==' '){
                    contador++;
                }

                indexPalavraBuscada=0;
            }

            //não é início de palavra ou o caracter não é igual
            else{
                indexFrase++;
                ehInicioPalavra=0;
            }

        }

        System.out.println("Palavras: " + contador);
    }
}
