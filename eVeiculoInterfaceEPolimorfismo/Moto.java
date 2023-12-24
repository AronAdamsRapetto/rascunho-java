package eVeiculoInterfaceEPolimorfismo;

/*
 * Uma classe 'implementa' uma interface, diferente de quando uma classe 'extende' outra aplicando o
 * conceito de herança.
 * Na classe deve conter todos os métodos e/ou atributos definidos na interface.
 * A implementação de uma interface é outro exemplo de polimorfismo, pois sobreescreve os métodos da interface.
 */

public class Moto implements Veiculo {

  /*
   * @Override = É um marcador usado para indicar que esse método é uma sobreescrita de um método de outra classe
   * ou implementação de uma interface, usá-lo permite que em tempo de compilação o java verifique se há um método
   * correspondete, caso não haja, um erro é emitido, ele ajuda também em outros fatores como legibilidade e
   * manutenção de código.
   */
  @Override
  public void acelerar() {
    System.out.println("Acelerando a moto!");
  }

  @Override
  public void frear() {
    System.out.println("Freando a moto!");
  }  
}
