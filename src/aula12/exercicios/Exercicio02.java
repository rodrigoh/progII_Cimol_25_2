package aula12.exercicios;

import java.util.Scanner;

public class Exercicio02 {

  public static int achaMenor(int n1, int n2, int n3){
    if(n1<n2 && n1<n3)
      return n1;
    else if(n2<n1 && n2<n3)
      return n2;
    else
      return n3;
  }

  public static int achaMenor(int[] numeros){
    if(numeros[0]<numeros[1] && numeros[0]<numeros[2])
      return numeros[0];
    else if(numeros[1]<numeros[0] && numeros[1]<numeros[2])
      return numeros[1];
    else
      return numeros[2];
  }

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int[] vetor = new int[3];
    System.out.print("Digite um número para n1: ");
    int n1 = ler.nextInt();
    vetor[0] = n1;
    System.out.print("Digite um número para n2: ");
    int n2 = ler.nextInt();
    vetor[1] = n2;
    System.out.print("Digite um número para n3: ");
    int n3 = ler.nextInt();
    vetor[2] = n3;

    //Chamando as funções
    int menor = achaMenor(n1,n2,n3);
    System.out.println("O menor número encontrado foi "+menor);
    menor = achaMenor(vetor);
    System.out.println("O menor número encontrado foi "+menor);


  }
}
