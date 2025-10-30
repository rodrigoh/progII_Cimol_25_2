package aula13.exemploAluno;

import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Aluno a1 = new Aluno();
    System.out.print("Qual o nome do aluno: ");
    a1.nome = ler.next();
    System.out.print("Qual a primeira nota do "+a1.nome+": ");
    a1.notaUm = ler.nextFloat();
    System.out.print("Qual a segunda nota do "+a1.nome+": ");
    a1.notaDois = ler.nextFloat();
    System.out.print("Qual a terceira nota do "+a1.nome+": ");
    a1.notaTres = ler.nextFloat();
    String notaFormatada = String.format("%.2f",a1.calculaMedia());
    System.out.println("A média do aluno "+a1.nome+" é "+notaFormatada);
    System.out.println("Com essa média ele está "+a1.retornaStatus());
  }
}
