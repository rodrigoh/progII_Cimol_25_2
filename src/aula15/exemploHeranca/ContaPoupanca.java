package aula15.exemploHeranca;

public class ContaPoupanca extends Conta{

  public ContaPoupanca(String titular, String senha, float depositoInicial){
    super(titular, senha);
    depositar(depositoInicial);
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
