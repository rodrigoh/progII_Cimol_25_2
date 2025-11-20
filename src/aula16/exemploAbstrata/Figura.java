package aula16.exemploAbstrata;

public abstract class Figura {
  private String nomeFigura;

  public Figura(String nomeFigura){
    this.nomeFigura = nomeFigura;
  }

  public String getNomeFigura(){
    return nomeFigura;
  }

  public void setNomeFigura(String nomeFigura){
    this.nomeFigura=nomeFigura;
  }

  public abstract double calculaArea();

  public abstract double calculaPerimetro();


}
