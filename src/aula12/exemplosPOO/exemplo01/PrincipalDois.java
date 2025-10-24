package aula12.exemplosPOO.exemplo01;

import java.util.Scanner;

public class PrincipalDois {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    //NomeObjeto nomeInstancia = new NomeObjeto()
    Carro carroUm = new Carro();
    carroUm.marca = "vw";
    carroUm.modelo = "fusca";
    carroUm.anoFabricacao = 1980;
    carroUm.cor = "azul";
    carroUm.km = 85989;
    carroUm.capacidadeTanque = 50;
    carroUm.velocidadeMaxima = 115;
    //Chamando métodos
    System.out.print("Quantos litros deseja abastecer: ");
    float litros = ler.nextFloat();
    if(carroUm.abastecer(litros)){
      System.out.println("Carro abastecido, agora tem "+carroUm.quantidadeCombustivel+" litros");
    }
    else{
      System.out.println(carroUm.modelo+" já está com o tanque cheio, ou a quantidade é muito grande");
    }
  }
}
