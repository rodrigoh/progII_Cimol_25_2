package aula06.exemplos;

import java.util.Scanner;

public class Exemplo01 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    //como era no C int vetor[10];
    //tipo[] nome = new tipo[capacidade]
    //vetor de 10 elementos com indices de 0 a 9
    int[] vetor = new int[10];
    //Lendo dados para o vetor
    for (int i = 0; i < 10; i++) {
      System.out.print("Digite um valor para vetor["+i+"]: ");
      vetor[i] = ler.nextInt();
    }
    //Mostrar o vetor na tela
    int i=0;
    System.out.println("Dados no vetor...");
    while(i<10){
      System.out.print(vetor[i]+" ");
      i++;
//      i+=1;
//      i = i + 1;
    }
  }
}
