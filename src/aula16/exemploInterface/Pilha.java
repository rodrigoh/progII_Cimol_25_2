package aula16.exemploInterface;

public class Pilha implements Estrutura {

  private String[] elementos;
  private int tamanho;

  public Pilha(int capacidade){
    elementos = new String[capacidade];
    tamanho = 0;
  }

  public int tamanho(){
    return tamanho;
  }

  @Override
  public void adiciona(String elemento) {
    elementos[tamanho] = elemento;
    tamanho++;
  }

  @Override
  public void remove() {
    tamanho--;
  }

  @Override
  public String exibe() {
    String retorno = "[";
    if(tamanho>0){
      for(int i=0;i<tamanho-1;i++){
        retorno+=elementos[i]+", ";
      }
      retorno+=elementos[tamanho-1];
    }
    return retorno+"]";
  }
}
