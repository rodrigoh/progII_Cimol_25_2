package aula15.exemploHeranca;

public class Banco {
  public static void main(String[] args) {
    ContaPoupanca cp1 = new ContaPoupanca("Jonas", "123456",100);
    System.out.println(cp1.getIdentificador());
    System.out.println(cp1.verificaSaldo());
    if(cp1.sacar(100)){
      System.out.println("Saque realizado");
    }
    else{
      System.out.println("Saldo insuficiente");
    }
    System.out.println(cp1.verificaSaldo());

    //Conta corrente
    ContaCorrente cc1 = new ContaCorrente("Ana", "123456", 1000);
    System.out.println(cc1.getIdentificador());
    System.out.println(cc1.verificaSaldo());
    if(cc1.sacar(100)){
      System.out.println("Saque realizado");
    }
    else{
      System.out.println("Saldo e ou limite insuficiente");
    }
    System.out.println(cc1.verificaSaldo());
  }
}
