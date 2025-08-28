package aula04.exemplosIF;

import java.util.Scanner;

/**
 * Operadores relacionais
 * < menor que
 * > maior que
 * <= menor ou igual a
 * >= maior ou igual a
 * == igual a
 * != diferente
 *
 * Operadores lógicos
 * && E lógico
 * || OU lógico
 * ! Não lógico
 */
public class Exemplo01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int num = ler.nextInt();

        if(num==0)
            System.out.println("O número é zero");
        else if(num>0)
            System.out.println("O número "+num+" é positivo");
        else
            System.out.println("O número "+num+" é negativo");
    }
}
