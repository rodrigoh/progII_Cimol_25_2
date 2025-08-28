package aula04.exemploCase;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe um dia de 'a' - 'e': ");
        char opc = ler.next().toLowerCase().charAt(0);
        switch (opc){
            case 'a'-> System.out.println("A opção selecionada foi a");
            case 'b'->{
                System.out.println("A opção selecionada foi b");
                System.out.println("Esta é a opção correta");
            }
            case 'c'-> System.out.println("Opção selecionada foi c");
            case 'd'-> System.out.println("opção selecionada foi d");
            case 'e'-> System.out.println("Opção selecionada foi e");
            default -> System.out.println("A letra selecionada, não corresponde a nenhuma opção");
        }

    }
}
