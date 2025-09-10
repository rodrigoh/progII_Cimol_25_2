package aula05.exercicios;

import java.util.Scanner;

/**
 * Faça um programa que leia o nome e a idade de 1 nadador e exiba na tela o nome da
 * categoria a qual este nadador pertence. A categoria dos nadadores é dada pela
 * seguinte tabela:
 *
 */
public class Ex02 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.print("Qual o nome: ");
    String nome = ler.next();
    System.out.print("Qual a idade do "+nome+": ");
    int idade = ler.nextInt();
    if(idade<5){
      System.out.println(nome+" é muito jovem");
    }
    else if(idade<=7){
      System.out.println(nome+" pertence a categoria Infantil A");
    }
    else if(idade<=10){
      System.out.println(nome+" pertence a categoria Infantil B");
    }
    else if(idade<=13){
      System.out.println(nome+" pertence a categoria Juvenil A");
    }
    else if(idade<=17){
      System.out.println(nome+" pertence a categoria Juvenil B");
    }
    else{
      System.out.println(nome+" pertence a categoria Adulto");
    }
  }
}
