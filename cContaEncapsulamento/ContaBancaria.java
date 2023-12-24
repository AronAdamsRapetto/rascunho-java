package cContaEncapsulamento;

public class ContaBancaria {
  /*
   * Por padrão os atributos e métodos são definidos como public, ou seja os valores podem ser manipulados e
   * acessados por qualquer um fora da classe.
   * Para evitar esse comportamento e respeitar o principio de encapsulamento definimos os atributos como private.
   * 
   * Para permitir que certos atributos privados sejam manipulados e acessados de fora da classe
   * usamos os Getters e Setters.
   * 
   * Para que o objeto seja instanciado com valores já definidos para os atributos, usamos o método contrutor.
   * O método construtor possui o mesmo nome da classe.
   */

  private String numero;
  private String titular;
  private double saldo;

  // CONSTRUTOR
  public ContaBancaria() {
    this.saldo = 0.0;
  }

  // GETTERS e SETTERS

  public void setNumero(String numero) {
    /*
     * this informa que estou querendo o atributo que pertence a esta classe, assim evita-se conflito ou confusão
     * com os parametros do próprio método ou outros escopos.
     */ 
    this.numero = numero;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public String getNumero() {
    return numero;
  }

  public String getTitular() {
    return titular;
  }

  public double getSaldo() {
    return saldo;
  }

  // MÉTODOS

  public void depositar(double valor) {
    if (valor > 0) {
      saldo = saldo + valor;
      System.out.println("Depósito de R$ " + valor + ". Saldo atual R$ " + saldo);
    } else {
      System.out.println("O valor de depósito é inválido.");
    }
  }

  public void sacar(double valor) {
    if (valor <= saldo && valor > 0) {
      saldo = saldo - valor;
      System.out.println("Saque de R$ " + valor + ". Saldo atual R$ " + saldo);
    } else {
      System.out.println("O valor de depósito é inválido.");
    }
  }
}
