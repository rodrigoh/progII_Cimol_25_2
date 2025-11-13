package aula15.exemploPolimorfismo;

public class Aluno extends Pessoa{
  private int matricula;

  public int getMatricula() {
    return matricula;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  @Override
  public String obterDados(){
    return "Nome: "+getNome()+" "+getSobrenome()+" Matrícula: "+matricula;
  }
}
