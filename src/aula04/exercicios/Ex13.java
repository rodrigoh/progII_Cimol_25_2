package aula04.exercicios;

import java.util.Scanner;

/**
 * Um motorista de táxi deseja calcular o rendimento de seu carro na praça.
 * Sabendo-se que o preço do combustível é de R$ 6,15, escreva um programa para
 * ler: a marcação do odômetro (Km) no início do dia, a marcação (Km) no final do
 * dia, o número de litros de combustível gasto e o valor total (R$) recebido dos
 * passageiros. Calcular e escrever: a média do consumo em Km/L e o lucro (líquido)
 * do dia.
 */

public class Ex13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Qual a km no início do dia: ");
        int kmInicial = ler.nextInt();
        System.out.print("Qual a km no final do dia: ");
        int kmFinal = ler.nextInt();
        System.out.print("Qual o preço do litro do combustível R$");
        float valorLitro = ler.nextFloat();
        System.out.print("Quantos litros foram usados: ");
        float quantLitros = ler.nextFloat();
        System.out.print("Qual o valor total recebido R$");
        float receita = ler.nextFloat();

        int distanciaTotal = kmFinal-kmInicial;
        float autonomia = distanciaTotal/quantLitros;

        float gasto = quantLitros*valorLitro;
        //float gasto = quantLitros*(float) 6.15;
        float lucro = receita-gasto;
        System.out.printf("Você percorreu %d km\n",distanciaTotal);
        System.out.printf("Seu veículo está percorrendo %.2fkm/l\n",autonomia);
        System.out.printf("Seu lucro é de R$%.2f\n",lucro);
    }
}
