package bPessoaClasses;

public class TesteDePessoa {
  public static void main(String[] args) {
    /*
     * Todo objeto é uma instância de uma classe, permitindo que usemos os atributos e
     * métodos definidos na classe a partir deste objeto.
     * Para instanciar uma classe usamos a seguinte sintaxe:
     * <tipo nomeDoObjeto = new NomeDaClasse()> 
     */

    Pessoa pessoa1 = new Pessoa();
    
    // Os atributos e métodos podem ser acessados usando a notação de '.'
    
    pessoa1.cpf = "33322211100";
    pessoa1.nome = "João";
    pessoa1.idade = 26;

    
    // System.out.println(pessoa1.nome);
    // System.out.println(pessoa1.idade);
    // System.out.println(pessoa1.cpf);

    pessoa1.imprimirDadosDaPessoa();
    System.out.println("RETORNAR DADOS DA PESSOA" + pessoa1.retornarDadosDaPessoa(1));

    // Diversos objetos podem ser instanciados a partir de uma mesma classe.

    Pessoa pessoa2 = new Pessoa();
    pessoa2.cpf = "44455566600";
    pessoa2.nome = "Maria";
    pessoa2.idade = 47;

    // System.out.println(pessoa2.nome);
    // System.out.println(pessoa2.idade);
    // System.out.println(pessoa2.cpf);

    pessoa2.imprimirDadosDaPessoa();
    System.out.println("RETORNAR DADOS DA PESSOA" + pessoa2.retornarDadosDaPessoa(2));
  }
}
