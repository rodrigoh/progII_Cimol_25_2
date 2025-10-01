package aula07.exercicios;

import java.util.Random;
import java.util.Scanner;

/**
 * Ler um vetor de 10 elementos inteiros. Após isto, imprimir na tela os 10 valores lidos e
 * o usuário poderá escolher um destes valores para ser excluído do vetor. Ler o valor escolhido
 * e eliminá-lo do vetor. No momento da exclusão todos os valores posteriores ao valor escolhido
 * deverão ser reorganizados (movidos uma posição para esquerda) a fim de que o vetor resultante
 * não fique com um espaço em branco. Imprimir o novo vetor.
 */
public class Ex11 {
  public static void main(String[] args) {
    Random aleatorio = new Random();
    Scanner ler = new Scanner(System.in);
    int[] vetor = new int[10];
    System.out.println("Dados no vetor:");
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = aleatorio.nextInt(1,100);
      System.out.print(vetor[i]+" ");
    }
    System.out.println("\nDos números acima qual deseja remover: ");
    int remove = ler.nextInt();
    //Pesquisar o número na lista
    int p = -1;
    for (int i = 0; i < vetor.length && p==-1; i++) {
      if(remove==vetor[i])
        p = i;
    }
    //Remover o elemento
    if(p>=0){
      for(int i = p;i<vetor.length-1;i++){
        vetor[i] = vetor[i+1];
      }
      System.out.println("Dados no vetor:");
      for (int i = 0; i < vetor.length-1; i++) {
        System.out.print(vetor[i]+" ");
      }
    }
    else{
      System.out.println("O "+remove+" não existe na lista");
    }
  }
}
