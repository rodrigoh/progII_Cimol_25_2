package aula06.exemplos;

import java.util.Random;

public class Exemplo04 {
  public static void main(String[] args) {
    Random aletorio = new Random();
    int[] vetor = new int[10];
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = aletorio.nextInt(50);
      System.out.print(vetor[i]+" ");
    }
  }
}
