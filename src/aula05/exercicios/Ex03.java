package aula05.exercicios;

import java.util.Scanner;

/**
 * Usando o comando de seleção condicional simples “IF”, faça um programa que
 * leia uma senha de 8 caracteres inteiros e verifique se a senha informada
 * equivale a senha predefinida no programa. Se for válida informe na tela
 * "Acesso Autorizado. Caso a senha não estiver correta informe "Acesso negado".
 */
public class Ex03 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.print("Qual sua senha: ");
    String senha = ler.next();
    if(senha.equals("00345678")){
      System.out.println("Bem vindo");
    }
    else{
      System.out.println("Acesso negado");
    }
  }
}
