package aula14.exemploHeranca;

public class Funcionario {
  private String nome;
  private String matricula;
  private String mail;

  public Funcionario(String nome, String matricula){
    this.nome = nome;
    this.matricula = matricula;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }
}
