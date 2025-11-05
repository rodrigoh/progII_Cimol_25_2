package aula14.exemplosAcesso.controller;

import aula14.exemplosAcesso.model.Pessoa;

public class Cadastro {
  public static void main(String[] args) {
    Pessoa p1 = new Pessoa();
    //O atributo nome pode ser acessado por ser público na classe Pessoa
    p1.nome = "Jonas";
    //Sobrenome não pode ser acessado por estar definido como protegido na classe Pessoa
    //p1.sobrenome = "Silva";
    //Aqui o atributo altura não possui modificador
    //p1.altura = 180;
    //Aqui o atributo e-mail é privado
    //p1.mail = "jonas@terra.com.br";
  }
}
