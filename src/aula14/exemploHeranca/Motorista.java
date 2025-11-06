package aula14.exemploHeranca;

public class Motorista extends Funcionario{
  private String cnh;

  public Motorista(String nome, String matricula, String cnh){
    super(nome, matricula);
    this.cnh = cnh;
  }

  public String getCnh() {
    return cnh;
  }

  public void setCnh(String cnh) {
    this.cnh = cnh;
  }
}
