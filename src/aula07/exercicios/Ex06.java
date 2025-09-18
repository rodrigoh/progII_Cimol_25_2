package aula07.exercicios;

import java.util.Scanner;

/**
 * Ler um vetor C de 10 nomes de pessoas, após pedir que o usuário digite um nome qualquer de pessoa.
 * Escrever a mensagem ACHEI, se o nome estiver armazenado no vetor C ou NÃO ACHEI caso contrário.
 */
public class Ex06 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    //Ler um vetor C de 10 nomes de pessoas
    String[] nomes = new String[5];
    for (int i = 0; i < nomes.length; i++) {
      System.out.print("Nome da "+(i+1)+"°: ");
      nomes[i] = ler.next();
    }
    //após pedir que o usuário digite um nome qualquer de pessoa
    System.out.print("Digite um nome para pesquisar: ");
    String nome = ler.next();
    //Escrever a mensagem ACHEI, se o nome estiver armazenado no vetor C ou NÃO ACHEI caso contrário.
    boolean achei = false;
    for (int i = 0; i < nomes.length; i++) {
      if(nome.equalsIgnoreCase(nomes[i])){
        achei = true;
      }
    }
    if(achei){
      System.out.println("O nome "+nome+" está na lista");
    }
    else{
      System.out.println("O nome "+nome+" não está na lista");
    }
  }
}
