package aula14.exemploHeranca;

public class Principal {
  public static void main(String[] args) {
    Motorista m1 = new Motorista("Jonas Silva", "a1234", "234238477234");
    //m1.setNome("Jonas Silva");
    m1.setMail("jonas@terra.com.br");
    //m1.setMatricula("a1234");
    //m1.setCnh("234238477234");
    Engenheiro e1 = new Engenheiro("Ana Souza", "a1235");
    //e1.setNome("Ana Souza");
    e1.setMail("ana@engenharia.com");
    //e1.setMatricula("a1235");
    e1.setCrea("RS124389");
  }
}
