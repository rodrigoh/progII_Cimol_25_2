package aula14.exemploEncapsulamento;

public class Pessoa {
  private String nome;
  private String sobrenome;
  private int altura;
  private String mail;


  //No conceito de encapsulamento temos um acesso indireto aos atributos
  //Criamos um método GET para pegar o valor do atributo
  public String getMail(){
    return mail;
  }
  //Criamos um método para definir o valor do atributo.
  public void setMail(String mail){
    this.mail = mail;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSobrenome() {
    return sobrenome;
  }

  public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
  }

  public int getAltura() {
    return altura;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }
}
