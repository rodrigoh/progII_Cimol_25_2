package aula05.exercicios;

import java.util.Scanner;

/**
 * Receba três valores fornecidos pelo usuário que representarão os lados de um
 * triângulo.
 * Classifique esse triângulo como:
 * a) Equilátero: três lados iguais.
 * b) Isósceles: dois lados iguais.
 * c) Escaleno: três lados diferentes.
 * Lembre-se de que, para formar um triângulo,
 * nenhum dos lados pode ser igual a zero, um lado não pode ser maior do que a soma
 * dos outros dois
 */
public class Ex08 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.print("l1: ");
    int a = ler.nextInt();
    System.out.print("l2: ");
    int b = ler.nextInt();
    System.out.print("l3: ");
    int c = ler.nextInt();
    if(a==0 || b==0 || c==0 || a>=b+c || b>=a+c || c>=a+b){
      System.out.printf("As medidas %d, %d e %d não formam triângulo\n",a,b,c);
    }
    else if(a==b && b==c){
      System.out.printf("As medidas %d, %d e %d formam um triângulo equilátero\n",a,b,c);
    }
    else if(a==b || b==c || a==c){
      System.out.printf("As medidas %d, %d e %d formam um triângulo isósceles\n",a,b,c);
    }
    else{
      System.out.printf("As medidas %d, %d e %d formam um triângulo escaleno\n",a,b,c);
    }
  }
}
