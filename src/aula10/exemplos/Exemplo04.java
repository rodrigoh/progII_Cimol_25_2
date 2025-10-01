package aula10.exemplos;

import java.util.Random;

public class Exemplo04 {
  public static void main(String[] args) {
    Random aleatorio = new Random();
    //Declarar uma matriz quadrada
    int[][] matriz = new int[5][5];
    //Gerando e imprimindo a matriz
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        matriz[l][c] = aleatorio.nextInt(1,50);
        System.out.printf("%02d ",matriz[l][c]);
      }
      System.out.println();
    }
    System.out.println("Achando a diagonal principal da matriz");
    for (int i = 0; i < matriz.length; i++) {
      System.out.printf("%02d ", matriz[i][i]);
    }
    System.out.println("\nAchando a diagonal secundária");
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        if(l + c == matriz.length-1)
          System.out.printf("%02d ",matriz[l][c]);
      }
    }
  }
}
