package aula12.exemplosPOO.exemplo02;

public class Principal {
  public static void main(String[] args) {
    Caneta c1 = new Caneta();
    c1.fabricante = "BIC";
    c1.cor = "azul";
    c1.quantidadeTinta = 50;
    for(int i=0;i<10;i++){
     c1.escrever("Imprimindo a linha "+(i+1));
    }
  }
}
