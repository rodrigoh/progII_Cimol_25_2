package aula15.tratamentoExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo01 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    try {
      System.out.print("Digite um número: ");
      int n1 = ler.nextInt();

      System.out.print("Digite outro número: ");
      int n2 = ler.nextInt();

      int resposta = n1 / n2;
      System.out.println(n1 + "/" + n2 + "=" + resposta);
    }
    catch (ArithmeticException erro){
      System.out.println("Não é possível dividir por zero");
    }
    catch (InputMismatchException erro){
      System.out.println("Os valores de n1 e n2 precisam ser números");
    }
    finally {
      System.out.println("Sempre sou executado...");
    }

    System.out.println("Continuando o código...");
  }
}
