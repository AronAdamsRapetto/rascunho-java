package bPessoaClasses;

public class Pessoa {
  /*
   * Toda Classe é um molde para a instância de um objeto, sendo o objeto uma resprentação de uma entidade
   * da vida real. Uma classe possui atributos(carateristicase informações) e/ou métodos(Ações que podem ser tomadas).
   * A declaração de atributos e métodos é feita de seguinte forma:
   * <tipo nomeDoAtributo>
   * <tipoDeRetorno nomeDoMétodo() {}>
   */
  
  // Declaração de atributos

  String nome;
  int idade;
  String cpf;
  
  
  // Declaração de métodos
  
  // void = método sem retorno
  void imprimirDadosDaPessoa() {
    System.out.println("O nome da pessoa é " + nome + " a idade é " + idade + " e o documento é " + cpf);
  }

  // int indice = representa o tipo e o nome do argumento recebido no método
  String retornarDadosDaPessoa(int indice) {
    return "O nome da pessoa é " + nome + " a idade é " + idade + " e o documento é " + cpf + " e o indice é " + indice;
  }
}
