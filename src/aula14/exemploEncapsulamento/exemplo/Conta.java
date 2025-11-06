package aula14.exemploEncapsulamento.exemplo;

import java.util.Random;

public class Conta {

  private String titular;
  private String identificador;
  private String senha;
  private float saldo;

  public Conta(String titular, String senha){
    this.titular = titular;
    this.senha = senha;
    geraIdentificador();
  }
  //Como o atributo identificador deve ser somente leitura ele recebe apenas um get
  public String getIdentificador(){
    return identificador;
  }
  //Getters e Setters para os atributos leitura e escrita
  public String getTitular() {
    return titular;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public void depositar(float valor){
    saldo+=valor;
  }

  public boolean sacar(float valor){
    if(saldo>=valor){
      saldo-=valor;
      return true;
    }
    return false;
  }

  public String verificaSaldo(){
    return String.format("Seu saldo atual é de R$%.2f",saldo);
  }

  private void geraIdentificador(){
    Random aleatorio = new Random();
    identificador = "";
    for (int i = 0; i < 4; i++) {
      identificador+= (char) aleatorio.nextInt(65,90);
    }
    identificador+=aleatorio.nextInt(10000,99999);
  }

  public boolean validaAcesso(String identificador, String senha){
    return this.identificador.equals(identificador) && this.senha.equals(senha);
  }

}
