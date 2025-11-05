package aula14.exemplosStatic;

public class Principal {
  public static void main(String[] args) {
    int soma = Calculadora.soma(5,6);
    System.out.println(soma);
    System.out.println(Calculadora.soma("Jonas", "Silva"));
//    String.format();
//    Integer.parseInt();
  }
}
