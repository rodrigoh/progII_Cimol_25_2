package aula07.exercicios;

import java.util.Random;
import java.util.Scanner;

/**
 * Declarar um vetor números com 20 elementos, gerar valores
 * inteiros para ele aleatoriamente. Declare outros dois vetores,
 * par e impar. No vetor par armazenar todos os elementos pares
 * do vetor números. No vetor ímpar armazenar todos os elementos
 * ímpares de números. Imprima os dois vetores.
 */
public class Ex05 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Random aleatorio = new Random();
    //Declarar um vetor números com 20 elementos
    int[] numeros = new int[20];
    //gerar valores inteiros para ele aleatoriamente
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = aleatorio.nextInt(1,100);
    }

    //Declare outros dois vetores, par e impar
    int[] pares = new int[20];
    int[] impares = new int[20];
    int cp=0;
    int ci=0;
    //No vetor par armazenar todos os elementos pares do vetor números.
    //No vetor ímpar armazenar todos os elementos ímpares de números.
    for (int i = 0; i < numeros.length; i++) {
      //No vetor par armazenar todos os elementos pares do vetor números.
      if(numeros[i]%2==0){
        pares[cp] = numeros[i];
        cp++;
      }
      //No vetor ímpar armazenar todos os elementos ímpares de números.
      else{
        impares[ci] = numeros[i];
        ci++;
      }
    }
    System.out.println("Dados no vetor números: ");
    for (int i = 0; i < numeros.length; i++) {
      System.out.print(numeros[i]+" ");
    }
    //Imprima os dois vetores.
    System.out.println("\nDados no vetor pares: ");
    for (int i = 0; i < cp; i++) {
      System.out.print(pares[i]+" ");
    }
    System.out.println("\nDados no vetor impares: ");
    for (int i = 0; i < ci; i++) {
      System.out.print(impares[i]+" ");
    }
  }
}
