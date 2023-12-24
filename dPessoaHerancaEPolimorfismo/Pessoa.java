package dPessoaHerancaEPolimorfismo;

public class Pessoa {
  private String nome;
  private int idade;
  private String cpf;

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public int getIdade() {
    return idade;
  }

  public String getNome() {
    return nome;
  }

  public String imprimirDadosDaPessoa() {
    return "O nome da pessoa é " + nome + " a idade é " + idade + " e o documento é " + cpf;
  }
}
