package aula05.exercicios;

import java.util.Scanner;

/**Escreva um algoritmo que leia 4 valores i, a, b, c escrever os valores
 * lidos e em seguida
 Se i = 1 escrever os três valores em ordem crescente
 Se i = 2 escrever os três valores em ordem decrescente
 Se i = 3 Escrever o dobro dos três números
 **/
 public class Ex13 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Escolha entre:");
    System.out.println("1 - para ordem crescente");
    System.out.println("2 - para ordem decrescente");
    System.out.println("3 - para o dobro dos valores");
    int i = ler.nextInt();
    System.out.print("a: ");
    int a = ler.nextInt();
    System.out.print("b: ");
    int b = ler.nextInt();
    System.out.print("c: ");
    int c = ler.nextInt();
    switch (i){
      case 1->{
        //A, B, C
        //A, C, B
        //B, A, C
        //B, C, A
        //C, A, B
        //C, B, A
        if (a < b && b < c)
          System.out.printf("%d, %d, %d\n", a, b, c);
        else if (a < c && a < b)
          System.out.printf("%d, %d, %d\n", a, c, b);
        else if (b < a && a < c)
          System.out.printf("%d, %d, %d\n", b, a, c);
        else if (b < c && c < a)
          System.out.printf("%d, %d, %d\n", b, c, a);
        else if (c < a && a < b)
          System.out.printf("%d, %d, %d\n", c, a, b);
        else if (c < b && b < a)
          System.out.printf("%d, %d, %d\n", c, b, a);
      }
      case 2->{
        if(a>b && b>c)
          System.out.printf("%d, %d, %d\n",a,b,c);
        else if(a>c && a>b)
          System.out.printf("%d, %d, %d\n",a,c,b);
        else if(b>a && a>c)
          System.out.printf("%d, %d, %d\n",b,a,c);
        else if(b>c && c>a)
          System.out.printf("%d, %d, %d\n",b,c,a);
        else if(c>a && a>b)
          System.out.printf("%d, %d, %d\n",c,a,b);
        else if(c>b && b>a)
          System.out.printf("%d, %d, %d\n",c,b,a);
      }
      case 3-> System.out.printf("%d, %d, %d\n",a*2,b*2,c*2);
      default-> System.out.println("Opção inválida");
    }
  }
}
