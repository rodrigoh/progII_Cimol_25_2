package aula07.exercicios;

import java.util.Scanner;

/*
4 - Ler um vetor A de 10 elementos inteiros e um valor X também inteiro.
Armazenar em um vetor M o resultado de cada elemento de A multiplicado pelo valor X.
Logo após, imprimir o vetor M.
 */
public class Ex04 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    //Ler um vetor A de 10 elementos inteiros
    int[] vetorA = new int[10];
    for (int i = 0; i < vetorA.length; i++) {
      System.out.printf("vetor[%d]: ",i);
      vetorA[i] = ler.nextInt();
    }
    //Ler um valor X também inteiro
    System.out.print("Digite um valor para x: ");
    int valorX = ler.nextInt();
    //Armazenar em um vetor M o resultado de cada elemento de A multiplicado pelo valor X.
    int[] vetorM = new int[10];
    for (int i = 0; i < vetorM.length; i++) {
      vetorM[i] = vetorA[i] * valorX;
    }
    //Logo após, imprimir o vetor M
    System.out.println("\nDados no vetor M: ");
    for (int i = 0; i < vetorM.length; i++) {
      System.out.print(vetorM[i]+" ");
    }
    System.out.println("\nDados no vetor M: ");
    for (int i = 0; i < vetorM.length; i++) {
      System.out.printf("%d x %d = %d\n",vetorA[i], valorX, vetorM[i]);
      //System.out.println(vetorA[i]+" x "+valorX+" = "+vetorM[i]);
    }
  }
}
