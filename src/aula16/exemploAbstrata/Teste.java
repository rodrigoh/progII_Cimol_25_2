package aula16.exemploAbstrata;

public class Teste {
  public static void main(String[] args) {
    Retangulo r1 = new Retangulo("Retângulo");
    r1.setBase(5);
    r1.setAltura(2);
    System.out.println("A figura "+r1.getNomeFigura());
    System.out.println("Tem área "+r1.calculaArea()+" cm²");
    System.out.println("Tem perímetro "+r1.calculaPerimetro()+" cm");
  }
}
