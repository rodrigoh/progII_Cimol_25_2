package aula04.exemplosIF;

import java.util.Scanner;

public class Exemplo02Opc2 {
    //Leiam 3 notas de um aluno, calcule a média
    //Classifique em
    //Aprovado media >=8
    //Recuperação media >=3
    //Reprovado media<3
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Qual a primeira nota: ");
        float n1 = ler.nextFloat();
        System.out.print("Qual a segunda nota: ");
        float n2 = ler.nextFloat();
        System.out.print("Qual a terceira nota: ");
        float n3 = ler.nextFloat();

        float media = (n1+n2+n3)/3;

        System.out.printf("Sua média é %.2f e você está ",media);

        if(media>=8){
            System.out.println("Aprovado");
        }
        if(media<8 && media>=3){
            System.out.println("Recuperação");
        }
        if(media<3){
            System.out.println("Reprovado");
        }

    }
}
