package aPrimeirosPassos;
import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDadosLista {
  public static void main(String[] args) {
    /*
     * Definição de um List
     * Na definição de tipos da interface de estruturas, não é aceito tipos primitivos, apenas objetos.
     */
    List<String> nomes = new ArrayList<>();
    nomes.add("Lola");
    nomes.add("Nega");
    nomes.add("Luli");
    nomes.add("Aron");

    // Pega valor pelo index
    System.out.println(nomes.get(3));

    // Percorre Lista com for - each
    for (String nome : nomes) {
      System.out.println("O nome é " + nome);  
    }

    // Percorre lista e faz um sysout de cada valor
    nomes.forEach(System.out::println);

    /*
     * Percorre a lista fazendo um sysout customizado para cada valor.
     * O método forEach poder ser escrito também em instrução maiores do que uma linha abrindo "{}" após o "->".
     */
    nomes.forEach(nome -> System.out.println("O nome que apareceu foi é " + nome));
  }
}
