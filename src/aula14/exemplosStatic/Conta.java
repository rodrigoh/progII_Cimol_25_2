package aula14.exemplosStatic;

import java.util.Random;

public class Conta {
  String titular;
  String identificador;
  String senha;
  float saldo;
  static String nomeBanco;

  Conta(String titular, String senha){
    this.titular = titular;
    this.senha = senha;
    geraIdentificador();
  }

  void depositar(float valor){
    saldo+=valor;
  }

  boolean sacar(float valor){
    if(saldo>=valor){
      saldo-=valor;
      return true;
    }
    return false;
  }

  String verificaSaldo(){
    return String.format("Seu saldo atual é de R$%.2f",saldo);
  }

  void geraIdentificador(){
    Random aleatorio = new Random();
    identificador = "";
    for (int i = 0; i < 4; i++) {
      identificador+= (char) aleatorio.nextInt(65,90);
    }
    identificador+=aleatorio.nextInt(10000,99999);
  }

  boolean validaAcesso(String identificador, String senha){
    return this.identificador.equals(identificador) && this.senha.equals(senha);
  }

}
