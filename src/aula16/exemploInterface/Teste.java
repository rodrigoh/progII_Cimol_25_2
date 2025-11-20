package aula16.exemploInterface;

public class Teste {
  public static void main(String[] args) {
    Pilha p1 = new Pilha(50);
    p1.adiciona("Elemento 1");
    p1.adiciona("Elemento 2");
    p1.adiciona("Elemento 3");
    p1.adiciona("Elemento 4");
    p1.adiciona("Elemento 5");
    System.out.println(p1.exibe());
    p1.remove();
    System.out.println(p1.exibe());
    System.out.println("O tamanho de p1 é "+p1.tamanho());

    //Criando uma instância de interface
    Estrutura e1 = new Pilha(50);
    e1.adiciona("interface 1");
    e1.adiciona("interface 2");
    e1.adiciona("interface 3");
    e1.adiciona("interface 4");
    e1.adiciona("interface 5");
    System.out.println(e1.exibe());
    //Métodos criados na classe Pilha, não vão estar disponíveis na instância da interface
    //Portanto, a linha abaixo não funciona
    //System.out.println("O tamanho de e1 é "+e1.tamanho());

  }
}
