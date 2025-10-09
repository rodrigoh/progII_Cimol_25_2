package aula11.exercicios;

import java.util.Random;

/**
 * Gerar uma matriz quadrada aleatoriamente de 10x10 e imprimir a
 * diagonal desta matriz
 */
public class Ex04 {
  public static void main(String[] args) {
    Random aleatorio = new Random();
    int[][] matriz = new int[10][10];
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        matriz[l][c] = aleatorio.nextInt(1,200);
        System.out.printf("%03d ",matriz[l][c]);
      }
      System.out.println();
    }
    System.out.println("Diagonal principal da matriz:");
    for (int i = 0; i < matriz.length; i++) {
      System.out.print(matriz[i][i]+" ");
    }
  }
}
