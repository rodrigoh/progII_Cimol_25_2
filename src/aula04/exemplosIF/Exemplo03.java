package aula04.exemplosIF;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String senhaValida = "a1234";
        System.out.print("Digite sua senha: ");
        String senha = ler.next();
        //Para comparar objetos temos que usar o método equals e não ==
        if(senha.equals(senhaValida)){
            System.out.println("Bem vindo admin");
        }
        else{
            System.out.println("Senha incorreta");
        }
    }
}
