package aula11.exercicios;

import java.util.Random;

/**
 * Dada uma matriz B, determine a linha de B que possui a maior soma de seus elementos.
 */
public class Ex09 {
  public static void main(String[] args) {
    Random aleatorio = new Random();
    int[][] matriz = new int[5][5];
    int maiorSoma=0;
    int linha=0;
    for (int l = 0; l < matriz.length; l++) {
      int soma = 0;
      for (int c = 0; c < matriz[l].length; c++) {
        matriz[l][c] = aleatorio.nextInt(1,50);
        soma+=matriz[l][c];
        System.out.printf("%02d ",matriz[l][c]);
      }
      if(l==0) {
        maiorSoma = soma;
      }
      else if(soma>maiorSoma) {
        maiorSoma = soma;
        linha = l;
      }
      System.out.println();
    }
    System.out.println("A linha que tem a maior soma é "+linha+" e a soma vale "+maiorSoma);
  }
}
