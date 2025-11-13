package aula15.exemploFinal;

public class Calculadora {
  //Quando definimos uma variável como final, ela precisa ter um valor atribuído até o final do construtor
  public final int numero;

  //Para criar uma constante, temos que definir como
  //public para ter acesso global
  //static para estar disponível sem criar instância
  //final para não ter seu valor alterado
  public static final double E = 2.718281828459045;
  public static final double PI = 3.141592653589793;

  public Calculadora(){
    numero = 10;
  }
}
