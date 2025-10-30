package aula13.exemploAlunoDois;

import java.util.Scanner;

public class CadastroMetodos {

  public static void mostraAluno(Aluno aluno){
    System.out.println("Nome: "+aluno.nome);
    System.out.printf("N1: %.2f\n",aluno.notaUm);
    System.out.printf("N2: %.2f\n",aluno.notaDois);
    System.out.printf("N3: %.2f\n",aluno.notaTres);
    System.out.printf("Média: %.2f\n",aluno.calculaMedia());
    System.out.println("Aluno está "+aluno.retornaStatus());
  }

  public static Aluno cadastra(){
    Scanner ler = new Scanner(System.in);
    System.out.print("Qual o nome do aluno: ");
    String nome = ler.next();

    System.out.print("Qual a primeira nota do " + nome + ": ");
    float n1 = ler.nextFloat();
    System.out.print("Qual a segunda nota do " + nome + ": ");
    float n2 = ler.nextFloat();
    System.out.print("Qual a terceira nota do " + nome + ": ");
    float n3 = ler.nextFloat();
    //Criando a instância de aluno
    Aluno aluno = new Aluno(nome);
    aluno.notaUm = n1;
    aluno.notaDois = n2;
    aluno.notaTres = n3;

    return aluno;
  }
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
      System.out.println("d - deletar um aluno");
      System.out.println("e - editar um aluno");
      System.out.println("s - sair");
      opc = ler.next().toLowerCase().charAt(0);
      if(opc=='c') {
        if (contAluno < lista.length) {
          System.out.println("Cadastrando o " + (contAluno + 1) + "° aluno");
          lista[contAluno] = cadastra();
          contAluno++;
        } else {
          System.out.println("Lista cheia");
        }
      }
      else if(opc=='l'){
        for (int i = 0; i < contAluno; i++) {
          System.out.println((i+1)+"° aluno");
          mostraAluno(lista[i]);
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
          mostraAluno(lista[posicao]);
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