package aula03;

public class Exemplo01 {
	public static void main(String[] args){
		//Tipos primitivos
		int numero = 10;
		float valor = (float) 10.6;
		double valorDouble = 12.3;
		boolean flag = true;
		//Tipos objetos
		String frase = "Aula de programação II";
		String nome = new String("Jonas");
		//Integer -> int
		//Float -> float
		//Double -> double
		//Character -> char
		//Imprimindo variáveis na tela
		System.out.println("Nome = "+nome+" Número = "+numero+" Valor = "+valor);
		System.out.printf("Nome = %s Número = %d Valor = %.2f\n",nome, numero, valor);
	}
}
