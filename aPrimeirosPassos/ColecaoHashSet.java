package aPrimeirosPassos;
import java.util.HashSet;
import java.util.Set;

public class ColecaoHashSet {
  /*
  * HashSet não possui ordenação, portanto não tem index.
  * HashSet possui um comportamento de elemento único, portanto eles podem ser inseridos em duplicidade 
  * mas serão uninificados dentro da coleção
  */
  public static void main(String[] args) {
    // Declaração de um HashSet
    Set<Integer> numeros = new HashSet<>();


    // Inserção de valores
    numeros.add(10);
    numeros.add(11);
    numeros.add(12);
    numeros.add(13);
    numeros.add(13);

    // Pega o número de elementos da coleção
    System.out.println(numeros.size());

    // Remove elementos
    numeros.remove(12);

    // Percorre coleção 
    for (Integer elemento : numeros) {
      System.out.println(elemento);
    }

    // Verifica se elemento está presente na coleção (Retorna um booleano)
    System.out.println(numeros.contains(14));
  }
}
