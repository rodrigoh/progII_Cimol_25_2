package aula07.exercicios;

import java.util.Random;

/**
 * 3 - Gerar um vetor de números, de 10 elementos. Declarar outro vetor inverso, copiar todos os
 * elementos de números de trás para frente para o vetor inverso.
 */
public class Ex03 {
  public static void main(String[] args) {
    Random aleatorio = new Random();
    //Gerar um vetor de números, de 10 elementos
    int[] vetor = new int[10];
    System.out.println("Dados no vetor...");
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = aleatorio.nextInt(1,50);
      System.out.print(vetor[i]+" ");
    }
    //Declarar outro vetor inverso, copiar todos os
    //elementos de números de trás para frente para o vetor inverso
    //length em c tamanho = sizeof(vetor)/sizeof(int)
    int[] inverso = new int[10];
    for(int i=0, j=9;i<vetor.length;i++,j--){
      inverso[j] = vetor[i];
    }
    //alternativa
//    int j = 9;
//    for(int i=0;i<vetor.length;i++){
//      inverso[j] = vetor[i];
//      j--;
//    }
    System.out.println("\nDados no vetor inverso");
    for(int i:inverso){
      System.out.print(i+" ");
    }
//    for (int i = 0; i < vetor.length; i++) {
//      System.out.print(vetor[i]+" ");
//    }

  }
}
