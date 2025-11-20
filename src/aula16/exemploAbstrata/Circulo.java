package aula16.exemploAbstrata;

public class Circulo extends Figura{

  private double raio;

  public Circulo(String nomeFigura) {
    super(nomeFigura);
  }

  @Override
  public double calculaArea() {
    return Math.PI*raio*raio;
  }

  @Override
  public double calculaPerimetro() {
    return 2*Math.PI*raio;
  }
}
