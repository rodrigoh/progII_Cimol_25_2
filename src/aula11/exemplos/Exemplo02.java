package aula11.exemplos;

import java.util.Random;

/**
 * Faça um programa para gerar automaticamente números entre 1 e 99 de uma cartela de bingo.
 * Sabendo que cada cartela deverá conter 5 linhas de 5 números, gere estes dados de modo a não
 * ter números repetidos dentro das cartelas. O programa deve exibir na tela a cartela gerada.
 */
public class Exemplo02 {

  public static String mostraCartela(int[][] matriz){
    String retorno = "Sua cartela:\n";
    for(int[] linha: matriz){
      for(int coluna: linha){
        retorno += String.format("%02d ",coluna);
      }
      retorno+="\n";
    }
    return retorno;
  }

  public static boolean verificaNovo(int[][] matriz, int numero){
    boolean novo = true;
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        if(numero==matriz[l][c])
          novo = false;
      }
    }
    return novo;
  }


  public static void main(String[] args) {
    Random aleatorio = new Random();
    int[][] cartela = new int[5][5];
    for (int l = 0; l < cartela.length; l++) {
      for (int c = 0; c < cartela[l].length;) {
        //Gerei um número aleatório
        int numero = aleatorio.nextInt(1,100);
        //Verificando se o número não existe na matriz
        boolean novo = verificaNovo(cartela, numero);

        //Verificando e adicionando na cartela
        if(novo){
          cartela[l][c] = numero;
          c++;
        }
      }
    }
    System.out.println(mostraCartela(cartela));

  }
}
