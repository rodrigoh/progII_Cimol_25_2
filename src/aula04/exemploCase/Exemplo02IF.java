package aula04.exemploCase;

import java.util.Scanner;

public class Exemplo02IF {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe um dia de 'a' - 'e': ");
        //toLowerCase() converte a String para minúsculo
        //toUpperCase() converte a String para maiúsculo
        char opc = ler.next().toLowerCase().charAt(0);

        if(opc=='a'){
            System.out.println("A opção selecionada foi a");
        }
        else if(opc=='b'){
            System.out.println("A opção selecionada foi b");
            System.out.println("Esta é a opção correta");
        }
        else if(opc=='c'){
            System.out.println("Opção selecionada foi c");
        }
        else if(opc=='d'){
            System.out.println("opção selecionada foi d");
        }
        else if(opc=='e'){
            System.out.println("Opção selecionada foi e");
        }
        else{
            System.out.println("A letra selecionada, não corresponde a nenhuma opção");
        }

    }
}
