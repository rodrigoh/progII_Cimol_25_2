package aula06.exemplos;

import java.util.Scanner;

public class Exemplo05 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int[] numeros = new int[100];
    int cont=0;
    String resp;
    do{
      System.out.print("numeros["+cont+"]: ");
      numeros[cont++] = ler.nextInt();
      System.out.print("Tem mais números? (sim, não) ");
      resp = ler.next().toLowerCase();
    }
    while (resp.equals("sim"));
    //while (!resp.equals("não"));

    for (int i = 0; i < cont; i++) {
      System.out.print(numeros[i]+" ");
    }
  }
}
