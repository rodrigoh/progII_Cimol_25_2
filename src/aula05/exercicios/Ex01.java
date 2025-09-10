package aula05.exercicios;

import java.util.Scanner;

/**
 * Crie um programa em que o usuário informa o nome de um mês (ex: janeiro) e o
 * programa exibe o número correspondente a esse mesmo mês (ex: 1);
 */
public class Ex01 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.print("Digite um mês: ");

    String mes = ler.next().toLowerCase();
    switch (mes){
      case "janeiro"-> System.out.println("O mês é 1");
      case "fevereiro"-> System.out.println("O mês é 2");
      case "março"-> System.out.println("O mês é 3");
      case "abril"-> System.out.println("O mês é 4");
      case "maio"-> System.out.println("O mês é 5");
      case "junho"-> System.out.println("O mês é 6");
      case "julho"-> System.out.println("O mês é 7");
      case "agosto"-> System.out.println("O mês é 8");
      case "setembro"-> System.out.println("O mês é 9");
      case "outubro"-> System.out.println("O mês é 10");
      case "novembro"-> System.out.println("O mês é 11");
      case "dezembro"-> System.out.println("O mês é 12");
      default -> System.out.println("A palavra "+mes+" não corresponde a nenhum mês");
    }
  }
}
