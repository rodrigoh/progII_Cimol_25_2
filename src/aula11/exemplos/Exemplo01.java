package aula11.exemplos;

import java.util.Scanner;

public class Exemplo01 {

  //Método para somar dois número
  public static int soma(int n1, int n2){
    int soma = n1+n2;
    return soma;
  }

  public static String soma(String nome, String sobrenome){
    return nome+" "+sobrenome;
  }

  public static int soma(int[] vetor){
    int soma = 0;
    for(int i:vetor){
      soma+=i;
    }
    return soma;
  }

  public static void somaDois(int n1, int n2){
    System.out.println(n1+"+"+n2+"="+(n1+n2));
  }

  public static int leNumero(String mensagem){
    Scanner ler = new Scanner(System.in);
    System.out.print(mensagem+": ");
    return ler.nextInt();
  }

  public static void main(String[] args) {
    int a = leNumero("Digite um valor para a");
    int b = leNumero("Digite um valor para b");
    int resultado = soma(a,b);
    somaDois(a,b);
    System.out.println(resultado);
  }
}
