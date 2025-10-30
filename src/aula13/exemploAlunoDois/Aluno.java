package aula13.exemploAlunoDois;

public class Aluno {
  String nome;
  float notaUm;
  float notaDois;
  float notaTres;
  float media;

  Aluno(){

  }

  Aluno(String nome){
    this.nome = nome;
  }

  Aluno(String nome, float n1, float n2, float n3){
    this.nome = nome;
    notaUm = n1;
    notaDois = n2;
    notaTres = n3;
  }

  float calculaMedia(){
    media = (notaUm+notaDois+notaTres)/3;
    return media;
  }

  String retornaStatus(){
    if(media>=8)
      return "aprovado";
    else if(media>3)
      return "em recuperação";
    else
      return "reprovado";
  }



}
