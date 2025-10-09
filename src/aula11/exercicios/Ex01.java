package aula11.exercicios;

import java.util.Scanner;

/**
 * Ler 6 números inteiros para preencher uma matriz D 2x3, ou seja, com 2 linhas e 3 colunas
 * (considere que não serão informados valores duplicados). A seguir, ler um número inteiro X
 * e escrever uma mensagem indicando se o valor de X existe ou não na matriz D.
 */
public class Ex01 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    //Ler 6 números inteiros para preencher uma matriz D 2x3
    int[][] matrizD = new int[2][3];
    for (int l = 0; l < matrizD.length; l++) {
      for (int c = 0; c < matrizD[l].length; c++) {
        System.out.printf("matrizD[%d][%d]: ",l,c);
        matrizD[l][c] = ler.nextInt();
      }
    }
    //Ler um número inteiro X
    System.out.print("Qual número devo pesquisar na matriz: ");
    int valorX = ler.nextInt();

    //Escrever uma mensagem indicando se o valor de X existe ou não na matriz D
    boolean achei = false;
    for (int l = 0; l < matrizD.length; l++) {
      for(int c=0;c<matrizD[l].length;c++){
        if(matrizD[l][c]==valorX)
          achei=true;
      }
    }
    if(achei)
      System.out.println("O valor "+valorX+" existe na matriz");
    else
      System.out.println("O valor "+valorX+" não existe na matriz");
  }
}
