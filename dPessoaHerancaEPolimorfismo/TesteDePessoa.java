package dPessoaHerancaEPolimorfismo;

public class TesteDePessoa {
  public static void main(String[] args) {
    /*
     * Na definição de tipo, tanto o 'Professor' como 'Pessoa' são aceitos, porém caso Pessoa seja definido
     * não será permitido que o objeto acesse atributos e métodos da classe Professor
     */
    Professor professor = new Professor();  
    
    professor.setCpf("99999999911");
    professor.setNome("Vida");
    professor.setIdade(999999);
    professor.setSalario(0);

    System.out.println(professor.imprimirDadosDaPessoa());


    Aluno aluno = new Aluno();

    aluno.setCpf("11111111122");
    aluno.setNome("Aron");
    aluno.setIdade(27);
    aluno.setMatricula("12121212");

    System.out.println(aluno.imprimirDadosDaPessoa());
  }
}
