package aula12.exercicios;

import java.util.Scanner;

/**
 * Crie um método que receba três valores, 'a', 'b' e 'c', que são os coeficientes de uma equação do
 * segundo grau e retorne o valor do delta, que é dado por 'b² - 4ac' função que verifica se existem
 * raízes reais.
 * Criar outra função calculaX, para calcular os resultados da equação
 * Usando as 2 funções acima, crie um aplicativo que calcula as raízes de uma equação do 2o grau:
 * ax² + bx + c=0
 * Para ela existir, o coeficiente 'a' deve ser diferente de zero.
 * Caso o delta seja maior ou igual a zero, as raízes serão reais. Caso o delta seja negativo, as
 * reais serão complexas, apenas informe que não existem raízes racionais
 */
public class Exercicio01 {
  //b²-4*a*c
  public static float calculaDelta(float a, float b, float c){
    return b*b-4*a*c;
  }
  //(-b ± √d)/(2*a)
  public static float calculaX(float a, float b, float d, char opc){
    float x;
    if(opc=='+')
      x = (float) (-b+Math.sqrt(d))/(2*a);
    else
      x = (float) (-b-Math.sqrt(d))/(2*a);
    return x;
  }

  public static float leFloat(String mensagem){
    System.out.print(mensagem+": ");
    return new Scanner(System.in).nextFloat();
  }

  public static void main(String[] args) {
    System.out.println("Dada a equação ax² + b + c = 0 informe:");
    float a = leFloat("a");
    float b = leFloat("b");
    float c = leFloat("c");
    float d = calculaDelta(a,b,c);
    if(d>=0){
      float x1 = calculaX(a,b,d,'+');
      float x2 = calculaX(a,b,d,'-');
      System.out.println("As raízes da equação são");
      System.out.printf("x1: %.2f\n",x1);
      System.out.printf("x2: %.2f\n",x2);
    }
    else{
      System.out.println("A equação não possui raízes no conjunto dos reais");
    }
  }

}
