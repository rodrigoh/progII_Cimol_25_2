package aula11.exercicios;

import java.util.Random;

/**
 * 5 - Gere uma matriz de 5x5 elementos. Calcule a soma dos elementos que estão
 * na diagonal principal.
 * 6 - Leia uma matriz de 5x5 elementos. Calcule a soma dos elementos que estão
 * acima da diagonal principal.
 * Leia uma matriz de 5x5 elementos. Calcule a soma dos elementos que estão
 * abaixo da diagonal principal.
 */
public class Ex06_07 {
  public static void main(String[] args) {
    Random aleatorio = new Random();
    int[][] matriz = new int[5][5];
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        matriz[l][c] = aleatorio.nextInt(1,50);
        System.out.printf("%02d ",matriz[l][c]);
      }
      System.out.println();
    }
    int somaDiagonal = 0;
    int somaAcima = 0;
    int somaAbaixo = 0;
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        if(l==c){
          somaDiagonal+=matriz[l][c];
        }
        else if(l<c){
          somaAcima+=matriz[l][c];
        }
        else{
          somaAbaixo+=matriz[l][c];
        }
      }
    }
    System.out.println("As somas dos ");
    System.out.println("Elementos acima da diagonal vale "+somaAcima);
    System.out.println("Elementos abaixo da diagonal vale "+somaAbaixo);
    System.out.println("Elementos na diagonal vale "+somaDiagonal);
  }
}
