package dPessoaHerancaEPolimorfismo;

/*
 * De acordo com o principio de herança uma classe pode herdar atributos e métodos de outra classe, somando com
 * seus próprios atributos e métodos, para aplicar a herança escrevemos da seguinte forma:
 * <restrição class NomeDaClasseHerdeira extends NomeDaClassePai/SuperClasse>
 */

public class Professor extends Pessoa {
  private double salario;

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }


  /*
   * O principio de polimorfismo permite que classes herdeiras possam reescrever métodos da classe pai, para aplicar
   * o polimorfismo apenas precisamos reescrever o método da classe pai de forma exatamente igual.
   */
  public String imprimirDadosDaPessoa() {
    return "Você é professor";
  }
}
