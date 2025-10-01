package aula10.exemplos;

public class Exemplo03 {
  public static void main(String[] args) {
    //Declarar e inicializar uma matriz
    int[][] matriz = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
    //Descobrir o tamanho da matriz de forma dinâmica
    System.out.println("A matriz tem "+matriz.length+" linhas");
    System.out.println("A matriz tem "+matriz[0].length+" colunas");
    //Usando o for simplificado para iterar uma matriz...
    for(int[] linha : matriz){
      for(int c:linha){
        System.out.printf("%02d ",c);
      }
      System.out.println();
    }
  }
}
