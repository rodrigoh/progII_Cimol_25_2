package aula14.exemploEncapsulamento.exemplo;

public class Banco {
  public static void main(String[] args) {
    Conta c1 = new Conta("Jonas","123456");
    System.out.println(c1.getIdentificador());
    c1.depositar(100);
    System.out.println(c1.verificaSaldo());
  }
}
