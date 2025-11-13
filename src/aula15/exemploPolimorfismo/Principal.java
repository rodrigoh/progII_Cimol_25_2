package aula15.exemploPolimorfismo;


public class Principal {
  public static void main(String[] args) {
//    Calculadora c1 = new Calculadora();
//    System.out.println(c1.soma(1,2,3));
//    System.out.println(c1.soma("Nome", "Sobrenome"));
//    System.out.println(c1.soma(4,5));

    Pessoa p1 = new Pessoa();
    p1.setNome("Jonas");
    p1.setSobrenome("Silva");

    Aluno a1 = new Aluno();
    a1.setNome("Ana");
    a1.setSobrenome("Souza");
    a1.setMatricula(123);

    System.out.println(p1.obterDados());
    System.out.println(a1.obterDados());

    System.out.println(p1);
  }
}
