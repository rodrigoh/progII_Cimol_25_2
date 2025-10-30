package aula13.exemploAlunoDois;

import java.util.Scanner;

public class Cadastro {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Aluno[] lista = new Aluno[10];
    int contAluno = 0;
    char opc;
    do{
      System.out.println("Selecione uma opção do menu");
      System.out.println("c - cadastrar um novo aluno");
      System.out.println("l - listar todos os alunos");
      System.out.println("p - pesquisar um aluno");
      System.out.println("a - listar alunos aprovados");
      System.out.println("m - listar os alunos acima da média da turma");
      System.out.println("s - sair");
      opc = ler.next().toLowerCase().charAt(0);
      if(opc=='c') {
        if (contAluno < lista.length) {
          System.out.println("Cadastrando o " + (contAluno + 1) + "° aluno");
          System.out.print("Qual o nome do aluno: ");
          String nome = ler.next();
          System.out.print("Qual a primeira nota do " + nome + ": ");
          float n1 = ler.nextFloat();
          System.out.print("Qual a segunda nota do " + nome + ": ");
          float n2 = ler.nextFloat();
          System.out.print("Qual a terceira nota do " + nome + ": ");
          float n3 = ler.nextFloat();
          //Criando uma instância dentro da posição contAluno da lista
          lista[contAluno] = new Aluno(nome);
          lista[contAluno].notaUm = n1;
          lista[contAluno].notaDois = n2;
          lista[contAluno].notaTres = n3;
          contAluno++;
        } else {
          System.out.println("Lista cheia");
        }
      }
      else if(opc=='l'){
        for (int i = 0; i < contAluno; i++) {
          System.out.println((i+1)+"° aluno");
          System.out.println("Nome: "+lista[i].nome);
          System.out.printf("N1: %.2f\n",lista[i].notaUm);
          System.out.printf("N2: %.2f\n",lista[i].notaDois);
          System.out.printf("N3: %.2f\n",lista[i].notaTres);
          System.out.printf("Média: %.2f\n",lista[i].calculaMedia());
          System.out.println("Aluno está "+lista[i].retornaStatus());
        }
      }
      else if(opc=='p'){
        System.out.print("Qual nome do aluno: ");
        String pesquisa = ler.next();
        int posicao = -1;
        //Busca na lista
        for (int i=0;i<contAluno;i++){
          if(pesquisa.equalsIgnoreCase(lista[i].nome))
            posicao = i;
        }
        if(posicao>=0){
          System.out.println("Nome: "+lista[posicao].nome);
          System.out.printf("N1: %.2f\n",lista[posicao].notaUm);
          System.out.printf("N2: %.2f\n",lista[posicao].notaDois);
          System.out.printf("N3: %.2f\n",lista[posicao].notaTres);
          System.out.printf("Média: %.2f\n",lista[posicao].calculaMedia());
          System.out.println("Aluno está "+lista[posicao].retornaStatus());
        }
        else{
          System.out.println("Aluno "+pesquisa+" não encontrado");
        }
      }
      else if(opc=='a'){
        System.out.println("em construção...");
      }
      else if(opc=='m'){
        System.out.println("em construção...");
      }
    }
    while(opc!='s');

  }
}