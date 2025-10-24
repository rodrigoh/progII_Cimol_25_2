package aula12.exemplosPOO.exemplo01;

public class Carro {
  String marca;
  String modelo;
  String cor;
  int km;
  int anoFabricacao;
  float capacidadeTanque;
  float quantidadeCombustivel;
  float velocidadeMaxima;
  float velocidade;

  //Tanque = 50
  //tem 25
  //
  boolean abastecer(float quantidade){
    if(quantidadeCombustivel+quantidade<capacidadeTanque){
      quantidadeCombustivel+=quantidade;
      return true;
    }
    return false;

  }

  boolean andar(float novaVelocidade){
    if(novaVelocidade+velocidade<=velocidadeMaxima){
      velocidade+=novaVelocidade;
      //velocidade = velocidade + novaVelocidade;
      return true;
    }
    return false;
  }

  void parar(){
    velocidade = 0;
  }

  String devolveDados(){
    return "Modelo: "+modelo+" Marca: "+marca;
  }

}
