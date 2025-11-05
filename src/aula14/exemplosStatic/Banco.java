package aula14.exemplosStatic;

public class Banco {
  public static void main(String[] args) {
    Conta c1 = new Conta("Jonas","123456");
    Conta c2 = new Conta("Ana","123456");
    c1.nomeBanco = "Banco novo";
    System.out.println("Nome banco c1 "+c1.nomeBanco);
    System.out.println("Nome banco c2 "+c2.nomeBanco);
    Conta.nomeBanco = "Teste";
    System.out.println("Nome banco c1 "+c1.nomeBanco);
    System.out.println("Nome banco c2 "+c2.nomeBanco);
//    System.out.println("Conta criada obteve o id "+c1.identificador);
//    c1.depositar(100);
//    System.out.println(c1.verificaSaldo());
//    if(c1.sacar(50)){
//      System.out.println("Saque realizado");
//      System.out.println(c1.verificaSaldo());
//    }
//    else{
//      System.out.println("Seu dinheiro acabou!");
//    }
  }
}
