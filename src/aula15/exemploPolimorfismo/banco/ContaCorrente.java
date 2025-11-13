package aula15.exemploPolimorfismo.banco;

public class ContaCorrente extends Conta {

  private float limite;


  public ContaCorrente(String titular, String senha, float limiteInicial) {
    super(titular, senha);
    limite = limiteInicial;
  }

  @Override
  public boolean sacar(float valor){
    if(saldo+limite>=valor){
      saldo-=valor;
      return true;
    }
    return false;
  }

  @Override
  public String verificaSaldo(){
    String retorno = String.format("Seu saldo atual é de R$%.2f",saldo);
    if(saldo<0){
      retorno+=String.format("\nSeu limite disponível é de R$%.2f",limite+saldo);
    }
    else{
      retorno+=String.format("\nSeu limite disponível é de R$%.2f",limite);
    }
    return retorno;
  }
}
