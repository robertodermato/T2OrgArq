public class Problema3v6 {
    public static void main(String[] args) {

        int r2=0;
        int contador=0;
        int r4;

        String palavra = "banana";
        String frase = "banana é bom. coma banana";

    for (int i=0; i<frase.length(); i++) {
        r4 = frase.charAt(i) - palavra.charAt(r2);

        //letra é igual
        if (r4 == 0) {
            r2 = r2 + 1;

            //chegou no fim da palavra, ou seja achou uma palavra
            if (r2 == palavra.length()) {
                contador = contador + 1;
                r2=0;
            }
        }
    }
        System.out.println(contador);
    }
}
