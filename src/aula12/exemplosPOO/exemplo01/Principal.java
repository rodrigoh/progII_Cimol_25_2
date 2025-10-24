package aula12.exemplosPOO.exemplo01;

public class Principal {
  public static void main(String[] args) {
    //NomeObjeto nomeInstancia = new NomeObjeto()
    Carro carroUm = new Carro();
    carroUm.marca = "vw";
    carroUm.modelo = "fusca";
    carroUm.anoFabricacao = 1980;
    carroUm.cor = "azul";
    carroUm.km = 85989;
    //System.out.println("Modelo "+carroUm.modelo);
    Carro carroDois = new Carro();
    carroDois.marca = "Fiat";
    carroDois.modelo = "500";
    carroDois.anoFabricacao = 1965;
    carroDois.km = 95333;
    String retorno = carroDois.devolveDados();
    System.out.println(retorno);
  }
}
