package aula11.exercicios;

import java.util.Scanner;

/**
 * Ler uma matriz G 3x3 e criar 2 vetores, SL e SC, de 3 elementos cada,
 * contendo respectivamente as somas das linhas e das colunas de G. Escrever
 * os vetores criados.
 */
public class Ex02 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int[][] matrizG = new int[3][3];
    int[] sl = {0, 0, 0};
    int[] sc = {0, 0 ,0};
    //Ler uma matriz G 3x3
    for (int l = 0; l < matrizG.length; l++) {
      for (int c = 0; c < matrizG[l].length; c++) {
        System.out.printf("matrizG[%d][%d]: ",l,c);
        matrizG[l][c] = ler.nextInt();
      }
    }
    //SL e SC, de 3 elementos cada, contendo respectivamente as somas das linhas e das colunas de G
    for (int i = 0; i < matrizG.length; i++) {
      for (int j = 0; j < matrizG[i].length; j++) {
//        sl[0] = matrizG[0][0]+matrizG[0][1]+matrizG[0][2]
//        sl[1] = matrizG[1][0]+matrizG[1][1]+matrizG[1][2]
//        sl[2] = matrizG[2][0]+matrizG[2][1]+matrizG[2][2]
        sl[i]+=matrizG[i][j];
//        sc[0] = matrizG[0][0]+matrizG[1][0]+matrizG[2][0];
//        sc[1] = matrizG[1][0]+matrizG[1][1]+matrizG[1][2];
        sc[i]+=matrizG[j][i];
        System.out.printf("%02d ",matrizG[i][j]);
      }
      System.out.println();
    }
    System.out.println("Dados no vetor soma linha:");
    for(int i:sl){
      System.out.print(i+" ");
    }
    System.out.println("\nDados no vetor soma coluna:");
    for(int i:sc){
      System.out.print(i+" ");
    }
  }
}
