package aula12.exercicios;

import java.util.Random;

public class JogaDado {

  public static int dado(){
    Random aleatorio = new Random();
    return aleatorio.nextInt(6);
  }

  public static void main(String[] args) {
    int[] lancamentos= new int[6];
    int maxLancamentos = 1000_000;
    //Lançando o dados maxLancamentos vezes
    for (int i = 0; i < maxLancamentos; i++) {
      int sorteio = dado();
      lancamentos[sorteio]++;
    }
    //Calcular e mostrar os resultados
    for(int i=0;i<6;i++){
      float percentual = lancamentos[i]/(float) maxLancamentos * 100;
      System.out.printf("A face %d do dado saiu %d x o que representa %.2f %%\n",i+1,lancamentos[i],percentual);
    }

  }


}
