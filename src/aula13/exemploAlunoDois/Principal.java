package aula13.exemploAlunoDois;

import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.print("Qual o nome do aluno: ");
    String nome = ler.next();
    Aluno a1 = new Aluno(nome);
    System.out.print("Qual a primeira nota do "+a1.nome+": ");
    a1.notaUm = ler.nextFloat();
    System.out.print("Qual a segunda nota do "+a1.nome+": ");
    a1.notaDois = ler.nextFloat();
    System.out.print("Qual a terceira nota do "+a1.nome+": ");
    a1.notaTres = ler.nextFloat();
    String notaFormatada = String.format("%.2f",a1.calculaMedia());
    System.out.println("A média do aluno "+a1.nome+" é "+notaFormatada);
    System.out.println("Com essa média ele está "+a1.retornaStatus());
    //Construindo alunos de diferentes formas
    Aluno a2 = new Aluno();
    Aluno a3 = new Aluno("Jonas");
    Aluno a4 = new Aluno("José", 8,9,10);

  }
}
