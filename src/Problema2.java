//  Problema 2: Implemente um programa que conta o numero de palavras
//  armazenadas em uma string e apresenta o total no terminal.

public class Problema2 {
    public static void main(String[] args) {
        int index = 0;

        String frase = "coma banana pois banana faz bem";
        int contador =1;
        for (int i=0; i<frase.length(); i++){
            if (frase.charAt(i)-32==0) contador++;
        }

        System.out.println(contador);

    }
}
