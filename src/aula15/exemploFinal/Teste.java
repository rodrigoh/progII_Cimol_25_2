package aula15.exemploFinal;

public class Teste {
  public static void main(String[] args) {
    System.out.println(Calculadora.PI);
    //O atributo definido como final, não pode ser acessado diretamente da classe
    //System.out.println(Calculadora.numero);
    Calculadora c1 = new Calculadora();
    //Não podemos alterar o valor de um atributo final
    //c1.numero = 60;
    System.out.println(c1.numero);
  }
}
