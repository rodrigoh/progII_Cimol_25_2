package aula06.exemplos;

public class Exemplo02 {
  public static void main(String[] args) {
    int[] vetor = {1,2,3,4,5,6,7,8,9,10};
    char[] letras = {'a','b','c','d'};
    String[] nomes = {"Ana Silva", "Jonas Souza", "Beatriz Montenegro", "João Correa", "Raissa Fernandez"};
    System.out.println("O tamanho do vetor é "+vetor.length);
    System.out.println("O tamanho do vetor letras é "+letras.length);
    System.out.println("O tamanho do vetor nomes é "+nomes.length);
    //Mostrando o vetor de números
    //em c tamanho = sizeof(vetor)/sizeof(int)
    System.out.println("Dados no vetor");
    for (int i = 0; i < vetor.length; i++) {
      System.out.print(vetor[i]+" ");
    }
    //Usando o for simplificado
    System.out.println("\nDados no vetor nomes:");
    for(String nome : nomes){
      System.out.println(nome);
    }
    System.out.println("\nDados em vetor:");
    for(int n : vetor){
      System.out.print(n+" ");
    }

  }
}
