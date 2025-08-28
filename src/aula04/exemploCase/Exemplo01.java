package aula04.exemploCase;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe um dia de 1 a 7: ");
        int dia = ler.nextInt();
        switch (dia){
            case 1:
                System.out.println("É domingo");
                System.out.println("É fim de semana");
                break;
            case 2:
                System.out.println("Segunda feira");
                break;
            case 3:
                System.out.println("Terça feira");
                break;
            case 4:
                System.out.println("Quarta feira");
                break;
            case 5:
                System.out.println("Quinta feira");
                break;
            case 6:
                System.out.println("Sexta feira");
                break;
            case 7:
                System.out.println("Sábado");
                System.out.println("É fim de semana");
                break;
            default:
                System.out.println("O número "+dia+" não corresponde a nenhum dia da semana");
        }
    }
}
