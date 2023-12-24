package cContaEncapsulamento;

public class TesteContaBancaria {
  public static void main(String[] args) {
    ContaBancaria contaBancaria1 = new ContaBancaria();

    /*
     * Agora para definir o valor dos atributos é preciso usar um Setter e para capturá-lo um Getter.
     * O atributo saldo não possui um setter, seu valor é incializado como 0.0 com o construtor e
     * alterado a partir dos métodos depositar() e sacar().
     */ 
    contaBancaria1.setNumero("1234");
    contaBancaria1.setTitular("José");

    System.out.println("Número da conta: " + contaBancaria1.getNumero());
    System.out.println("Titular da conta: " + contaBancaria1.getTitular());
    System.out.println("Saldo da conta: " + contaBancaria1.getSaldo());

    contaBancaria1.depositar(150);
    contaBancaria1.sacar(100);
  }
}
