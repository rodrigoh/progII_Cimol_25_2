package aula14.exemplosAcesso.model;

public class Pessoa {
  public String nome;
  protected String sobrenome;
  int altura;
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


}
