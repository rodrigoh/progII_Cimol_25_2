package aula11.exercicios;

import java.util.Random;

/**
 * Faça um programa para gerar automaticamente números entre 1 e 99 de uma cartela de bingo.
 * Sabendo que cada cartela deverá conter 5 linhas de 5 números, gere estes dados de modo a não
 * ter números repetidos dentro das cartelas. O programa deve exibir na tela a cartela gerada.
 */
public class Ex08 {
  public static void main(String[] args) {
    Random aleatorio = new Random();
    int[][] cartela = new int[5][5];
    for (int l = 0; l < cartela.length; l++) {
      for (int c = 0; c < cartela[l].length;) {
        //Gerei um número aleatório
        int numero = aleatorio.nextInt(1,100);
        //Verificando se o número não existe na matriz
        boolean novo = true;
        for (int i = 0; i < cartela.length; i++) {
          for (int j=0;j<cartela[i].length;j++){
            if(cartela[i][j]==numero)
              novo = false;
          }
        }
        //Verificando e adicionando na cartela
        if(novo){
          cartela[l][c] = numero;
          c++;
        }
      }
    }
    System.out.println("Sua cartela de bingo");
    for(int[] linha:cartela){
      for(int coluna:linha)
        System.out.printf("%02d ",coluna);
      System.out.println();
    }

  }
}
