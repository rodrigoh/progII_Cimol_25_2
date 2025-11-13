package aula15.exemploPolimorfismo.banco;

import java.util.Random;

public class Conta {
  private String titular;
  private String identificador;
  protected float saldo;
  private String senha;

  public Conta(String titular, String senha){
    this.titular = titular;
    this.senha = senha;
    identificador = geraIdentificador();
    saldo = 0;
  }

  private String geraIdentificador(){
    String id = "";
    Random aleatorio = new Random();
    for (int i = 0; i < 4; i++)
      id+=(char)aleatorio.nextInt(65,90);
    id+=aleatorio.nextInt(10000,99999);
    return id;
  }

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

  public String getIdentificador() {
    return identificador;
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
    return String.format("Seu saldo é de R$%.2f",saldo);
  }
}
