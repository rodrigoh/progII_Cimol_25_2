package aula14.exemplosAcesso.model;

public class Cadastro {
  public static void main(String[] args) {
    Pessoa p1 = new Pessoa();
    p1.nome = "Jonas";
    p1.sobrenome = "Silva";
    p1.altura = 180;
    //Aqui o atributo e-mail é privado
    //p1.mail = "jonas@terra.com.br";
  }
}
