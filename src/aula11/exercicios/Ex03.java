package aula11.exercicios;

import java.util.Random;
import java.util.Scanner;

/**
 * Ler uma matriz 4x4 de números inteiros, multiplicar os elementos da diagonal principal
 * por um número inteiro também lido e escrever a matriz resultante.
 */
public class Ex03 {
  public static void main(String[] args) {
    int[][] matriz = new int[4][4];
    Random aleatorio = new Random();
    Scanner ler = new Scanner(System.in);
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        matriz[l][c] = aleatorio.nextInt(1,30);
        System.out.printf("%02d ",matriz[l][c]);
      }
      System.out.println();
    }
    System.out.print("Por qual valor devo multiplicar a diagonal: ");
    int valor = ler.nextInt();
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        if(l==c)
          matriz[l][c]*=valor;
        System.out.printf("%02d ",matriz[l][c]);
      }
      System.out.println();
    }
  }
}
