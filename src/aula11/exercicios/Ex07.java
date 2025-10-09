package aula11.exercicios;

import java.util.Random;
import java.util.Scanner;

/**
 * Leia uma matriz 5 x 5. Leia também um valor X. O programa deverá fazer uma
 * busca desse valor na matriz e, ao final, escrever a localização (linha e coluna)
 * ou uma mensagem de “não encontrado”.
 */
public class Ex07 {
  public static void main(String[] args) {
    Random aleatorio = new Random();
    Scanner ler = new Scanner(System.in);
    int[][] matriz = new int[5][5];
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        matriz[l][c] = aleatorio.nextInt(1,50);
        System.out.printf("%02d ",matriz[l][c]);
      }
      System.out.println();
    }
    System.out.print("Qual valor devo pesquisar na matriz: ");
    int valorX = ler.nextInt();
    int linha = -1;
    int coluna = -1;
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        if (matriz[l][c] == valorX) {
          linha = l;
          coluna = c;
        }
      }
    }
    if(linha>=0){
      System.out.println("O valor "+valorX+" existe na matriz, nas posições linha = "+linha+" e coluna = "+coluna);
    }
    else{
      System.out.println("O valor "+valorX+" não existe na matriz");
    }
  }
}
