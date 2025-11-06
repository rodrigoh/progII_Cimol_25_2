package aula14.exemploHeranca;

public class Engenheiro extends Funcionario{
  private String crea;

  public Engenheiro(String nome, String matricula){
    super(nome,matricula);
  }

  public String getCrea() {
    return crea;
  }

  public void setCrea(String crea) {
    this.crea = crea;
  }
}
