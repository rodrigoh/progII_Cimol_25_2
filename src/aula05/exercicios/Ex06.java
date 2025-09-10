package aula05.exercicios;

import java.util.Scanner;

/**
 * Faça um programa que solicite ao usuário digitar dois valores, em seguida, exiba na tela qual
 * dos dois é o maior. OBS: o usuário poderá informar valores iguais, logo, o sistema deve dizer
 * que foram digitados valores iguais.
 */
public class Ex06 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.print("Digite um número: ");
    int n1 = ler.nextInt();
    System.out.print("Digite outro número: ");
    int n2 = ler.nextInt();
    if(n1==n2){
      System.out.println("Os valores são iguais");
    }
    else if(n2>n1){
      System.out.println(n2+" é o maior número");
    }
    else{
      System.out.println(n1+" é o maior número");
    }
  }
}
