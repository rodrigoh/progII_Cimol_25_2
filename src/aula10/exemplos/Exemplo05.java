package aula10.exemplos;

import java.util.Scanner;

public class Exemplo05 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int[][] matriz = new int[2][3];
    //Lendo seis números para armazenar na matriz
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length;) {

        System.out.printf("matriz[%d][%d]: ",l,c);
        int numero = ler.nextInt();
        //Pesquisa
        boolean achei = false;
        for (int i = 0; i < matriz.length; i++) {
          for (int j = 0; j < matriz[l].length; j++) {
            if(numero==matriz[i][j])
              achei=true;
          }
        }
        if(!achei){
          matriz[l][c] = numero;
          c++;
        }
        else{
          System.out.println("Número "+numero+" já está na matriz");
        }
      }
    }
    //Leia outro valor para pesquisar na matriz
    System.out.print("Qual valor devo pesquisar na matriz: ");
    int valor = ler.nextInt();
    //Pesquisando
    boolean achei = false;
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        if(valor==matriz[l][c])
          achei = true;
      }
    }
    //Agora o teste e impressão da mensagem ocorre apenas no final, fora dos loopings
    if(achei)
      System.out.println("O valor "+valor+" está na matriz");
    else
      System.out.println("O valor "+valor+" não está matriz");

  }
}
