package fExcecoes;

import dPessoaHerancaEPolimorfismo.Pessoa;

public class Excecoes {
  /*
   * Checked exceptions = São as exceções que de alguma forma o java vai exigir que sejam tratatas, são exceções
   * que são possiveis de prever e não irão gerar um erro inesperado.
   * 
   * Unchecked exceptions = São exceções que o compilador não consegue prever em tempo de compilação e que irão
   * dar erro, como quando tempos um erro em tempo de execução. Ex: Divisão por zero, tentar acessar um indice
   * que não existe no array, etc.
   */

  public static void main(String[] args) {
    //Checked Exception

    // COMENTAR PARA SER POSSIVEL VAR A UNCHECKED EXCEPTION
    try {
      validarNumero();
    } catch(Exception e) {
      System.out.println("Houston temos um problema!");
      // faz um print exatamente de qual erro ocorreu, dando mais detalhes do erro.
      e.printStackTrace();
    }


    // Unchecked Exception

    // Isto resultará em um erro chamado: NullPointerException
    Pessoa p = null;
      p.getCpf();
  }

  /*
  * static = Significa que o meu método pode ser chamado sem a necessidade de instanciar a classe
  *
  * throws Exception = Transfere a responsabilidade de tratar o erro para a camada acima, ou seja,
  * quem está chamando o método.
  */
  public static void validarNumero() throws Exception {
    int numero = 10;

    if (numero < 100) {
      // Comando usado para lançar exceções
      throw new Exception("O número é menor que 100");
  }    
  }
}
