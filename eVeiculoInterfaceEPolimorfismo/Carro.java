package eVeiculoInterfaceEPolimorfismo;

public class Carro implements Veiculo {

  @Override
  public void acelerar() {
    System.out.println("Acelerando a carro!");
  }

  @Override
  public void frear() {
    System.out.println("Freando a carro!");
  }
  
}
