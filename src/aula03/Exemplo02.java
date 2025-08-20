package aula03;

import java.util.Scanner;

public class Exemplo02 {
	public static void main(String[] args) {
		//Lendo variáveis do teclado
		Scanner ler = new Scanner(System.in);

		//Ler um número inteiro
		System.out.print("Digite um número: ");
		int numero = ler.nextInt();
		System.out.println("O número digitado foi "+numero);
		System.out.printf("O número digitado foi %d\n",numero);
		//Lendo um float do teclado
		System.out.print("Digite um número real: ");
		float valor = ler.nextFloat();
		System.out.printf("O número real digitado foi %.2f\n",valor);
		//Lendo Strings do teclado
		System.out.print("Digite seu nome: ");
		String nome = ler.next();
		System.out.println("Bem vindo "+nome);
		//Caso tenha problemas com o buffer do teclado (estiver pulando a leitura)
		ler = new Scanner(System.in);
		//Lendo uma frase completa...
		System.out.print("Digite uma frase: ");
		String frase = ler.nextLine();
		System.out.println("A frase é "+frase);



	}
}
