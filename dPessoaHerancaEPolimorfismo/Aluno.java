package dPessoaHerancaEPolimorfismo;

/*
 * De acordo com o principio de herança uma classe pode herdar atributos e métodos de outra classe, somando com
 * seus próprios atributos e métodos, para aplicar a herança escrevemos da seguinte forma:
 * <restrição class NomeDaClasseHerdeira extends NomeDaClassePai>
 */

public class Aluno extends Pessoa {
  private String matricula;

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public String getMatricula() {
    return matricula;
  }

  /*
   * Além de podermos reescrever os métodos da classes pai, podemos manter a definição do método herdado e
   * apenas adicionarmos novas funcionalidades.
   * Para adicionar funcionalidades sem mudar o comportamento do método original, escrevemos:
   * super.nomeDoMétodo()
   */
  public String imprimirDadosDaPessoa() {
    /*
     * Como o método original apenas retorna um texto, faremos um print para que o resultado seja mostrado.
     */
    System.out.println(super.imprimirDadosDaPessoa());
    return "Você é Aluno";
  }
}
