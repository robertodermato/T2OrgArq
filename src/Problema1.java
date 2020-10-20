//  Problema 1: Escreva um programa que percorre um vetor de 25 numeros
//  e apresenta ao nal de sua execuc~ao o menor e o maior valor encontrado, a
//  soma dos mesmos e o seu produto.

public class Problema1 {

    public static int [] vetor = {-3,-4,-5};
    public static int maior = -32768;
    public static int menor = 32767;
    public static int soma = 0;
    public static int produto = 0;

    public static void main(String[] args) {

        calculaMenor();
        calculaMaior();
        calculaSoma();
        calculaProduto();

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Produto: " + produto);
        System.out.println("Soma: " + soma);

    }

    public static void calculaMenor(){
        for (int i=0; i<vetor.length; i++){
            if (vetor[i] < menor) menor = vetor[i];}}

    public static void calculaMaior(){
        for (int i=0; i<vetor.length; i++){
            if (vetor[i] > maior) maior = vetor[i];}}

    public static void calculaSoma(){soma = menor + maior;}

    public static void calculaProduto(){
        if (maior==0 || menor==0) return;
        if (maior < 0) multiplicaNegativos();
        else multiplicaPositivos();}

    public static void multiplicaNegativos(){
        int novomaior=0;
        for (int i=maior; i<0;i++) {
            novomaior = novomaior + 1;}
        for (int i=menor; i<0; i++){
            produto = produto + novomaior;}}

    public static void multiplicaPositivos(){
        for (int i=maior; i>0; i--){
            produto = produto + menor;}}
}







