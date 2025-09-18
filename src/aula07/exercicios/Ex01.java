package aula07.exercicios;

import java.util.Scanner;

/**
 * Ler dois vetores, A e B com um número variável de conteúdo (números) (no máximo 10).
 * O programa deve solicitar antes da leitura dos vetores a quantidade de dados a serem
 * lidos (1 a 10), os dois vetores terão o mesmo número de elementos. Gerar um terceiro
 * vetor chamado Soma (de no máximo 10 elementos) que seja a soma dos dados do vetor
 * A com os do vetor B.
 */
public class Ex01 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    /*
    O programa deve solicitar antes da leitura dos vetores a quantidade de dados a serem
    lidos (1 a 10)
     */
    int tamanho;
    do {
      System.out.print("Escolha o tamanho do vetor (1 a 10): ");
      tamanho = ler.nextInt();
    }
    while (tamanho < 1 || tamanho > 10);
    /*
    Ler dois vetores, A e B com um número variável de conteúdo (números) (no máximo 10)
     */
    int[] vetorA = new int[tamanho];
    int[] vetorB = new int[tamanho];
    int[] soma = new int[tamanho];
    //Lendo dados para o vetor A
    //No nosso exemplo o vetorA.length = tamanho, ele sempre indica o tamanho do vetor
    for (int i = 0; i < vetorA.length; i++) {
      System.out.print("vetorA["+i+"]: ");
      vetorA[i] = ler.nextInt();
    }
    //Lendo dados para o vetor B
    for (int i = 0; i < vetorB.length; i++) {
      System.out.print("vetorB["+i+"]: ");
      vetorB[i] = ler.nextInt();
    }
    /*
    Gerar um terceiro
    vetor chamado Soma (de no máximo 10 elementos) que seja a soma dos dados do vetor
    A com os do vetor B
    */
    for (int i = 0; i < soma.length; i++) {
      soma[i] = vetorA[i]+vetorB[i];
      System.out.println(vetorA[i]+" + "+vetorB[i]+" = "+soma[i]);
    }
  }
}
