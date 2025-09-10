package aula05.exercicios;

import java.util.Scanner;

/**
 * Crie um programa em que o usuário informa o nome de um mês (ex: janeiro) e o
 * programa exibe o número correspondente a esse mesmo mês (ex: 1);
 */
public class Ex01IF {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.print("Digite um mês: ");

    String mes = ler.next().toLowerCase();
    if(mes.equals("janeiro"))
      System.out.println("O mês é 1");
    else if(mes.equals("fevereiro"))
      System.out.println("O mês é 2");
    else if(mes.equals("março"))
      System.out.println("O mês é 3");
    else if(mes.equals("abril"))
      System.out.println("O mês é 4");
    else if(mes.equals("maio"))
      System.out.println("O mês é 5");
    else if(mes.equals("junho"))
      System.out.println("O mês é 6");
    else if(mes.equals("julho"))
      System.out.println("O mês é 7");
    else if(mes.equals("agosto"))
      System.out.println("O mês é 8");
    else if(mes.equals("setembro"))
      System.out.println("O mês é 9");
    else if(mes.equals("outubro"))
      System.out.println("O mês é 10");
    else if(mes.equals("novembro"))
      System.out.println("O mês é 11");
    else if(mes.equals("dezembro"))
      System.out.println("O mês é 12");
    else
      System.out.println("A palavra "+mes+" não corresponde a nenhum mês");
  }
}
