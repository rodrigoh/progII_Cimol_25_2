package aula04.exemploTernario;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um número positivo: ");
        int numero = ler.nextInt();
        //teste_lógico ? valor_verdadeiro : valor_falso
        System.out.println("O número é positivo? "+(numero>0?"Sim":"Não"));
    }
}
