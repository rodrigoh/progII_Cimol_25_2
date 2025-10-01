package aula07.exercicios;

import java.util.Scanner;

/**
 * Ler um vetor que contenha as notas de uma turma de 10 alunos. Calcular a média da turma e
 * contar quantos alunos obtiveram nota acima desta média calculada. Escrever a média da turma
 * e o resultado da contagem.
 */
public class Ex07 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    //Vetor de 10 notas
    float[] notas = new float[10];
    //Somador para as notas
    float soma = 0;
    //Lendo o vetor do teclado
    for (int i = 0; i < notas.length; i++) {
      System.out.print("Notas["+i+"]: ");
      notas[i] = ler.nextFloat();
      soma+=notas[i];
    }
    //Calcular a média da turma
    float media = soma/ notas.length;
    //Contando quantos alunos estão acima da média da turma
    int cont = 0;
    for (int i = 0; i < notas.length; i++) {
      if(notas[i]>media)
        cont++;
    }
    //Mostrar os resultados
    System.out.printf("A média da turma é %.2f e estão acima dela %d alunos\n",media, cont);
  }
}
