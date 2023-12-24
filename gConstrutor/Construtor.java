package gConstrutor;

/*
 * O construtor é um método especial de uma classe que é chamado quando um objeto é instanciado a partir dela,
 * ele pode ser usado para inicializar os atributos ou até executar alguma lógica no momento em que a
 * o objeto é instânciado.
 */

public class Construtor {

  private int numero;

  /*
   * O método construtor precisa ter exatamente o nome da classe e não possui retorno, sendo sempre "void".
   * Podemos ter mais de um construtor em uma única classe, podendo "escolher" qual vamos utilizar no
   * momento de instacianciar um objeto.
   * Toda classe possui um construtor mesmo que não seja definido explicitamente na classe. Quando um objeto for
   * instanciado a partir da classe, o java criará automaticamente um construtor vazio e sem parametro por baixo
   * dos panos, porém a partir do momento em que definimos um construtor, deixamos de ter acesso a esse construtor
   * automático.
   */

  public Construtor(int numero) {
    this.numero = numero;
    System.out.println("construtor com 1 parametro criado");
  }

  public Construtor(int numero, String texto) {
    this.numero = numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getNumero() {
    return numero;
  }  
}
