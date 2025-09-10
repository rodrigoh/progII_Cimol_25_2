package aula06.exemplos;

import java.util.Random;

public class Exemplo03 {
  public static void main(String[] args) {
    Random aleatoria = new Random();
    //Gerando um número inteiro aleatório (sem limite)
    //int numero = aleatoria.nextInt();
    //Gerando número aleatório (de 0 a 99)
    //int numero = aleatoria.nextInt(100);
    //Gerando número aleatório (de 50 a 99)
    int numero = aleatoria.nextInt(50, 100);
    System.out.println("O número gerado foi "+numero);
    float numeroReal = aleatoria.nextFloat(20);
    System.out.println("O número real gerado foi "+numeroReal);
    System.out.printf("O número real gerado foi %.2f\n",numeroReal);
    //Gerando booleans aleatórios
    boolean valor = aleatoria.nextBoolean();
    System.out.println("Agora saiu "+valor);
    System.out.println("Cara ou coroa "+(valor?"cara":"coroa"));
  }
}
