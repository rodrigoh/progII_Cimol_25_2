package aula15.tratamentoExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo02 {

  public static int leNumero() {
    Scanner ler = new Scanner(System.in);
    boolean valido;
    int numero = 0;
    do {
      try {
        System.out.print("Digite um número: ");
        numero = ler.nextInt();
        valido = true;
      } catch (InputMismatchException e) {
        //ler = new Scanner(System.in);
        ler.next();
        valido = false;
        System.out.println("O valor precisa ser um número");
      }
    }
    while (!valido);
    return numero;
  }

  public static void main(String[] args) {
    int valor = leNumero();
  }
}
