package aula13.exemploAluno;

public class Aluno {
  String nome;
  float notaUm;
  float notaDois;
  float notaTres;
  float media;

  float calculaMedia(){
    media = (notaUm+notaDois+notaTres)/3;
    return media;
  }

//  String retornaStatus(){
//    String status = "reprovado";
//    if(media>=8)
//      status = "aprovado";
//    else if(media>3)
//      status = "recuperação";
//    return status;
//  }

  String retornaStatus(){
    if(media>=8)
      return "aprovado";
    else if(media>3)
      return "em recuperação";
    else
      return "reprovado";
  }



}
