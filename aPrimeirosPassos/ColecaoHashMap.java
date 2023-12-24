package aPrimeirosPassos;
import java.util.HashMap;
import java.util.Map;

public class ColecaoHashMap {
  public static void main(String[] args) {
    /*
     * Declaração de HashMap
     * HashMaps são uma lista de pares chave - valor.
     * Na definição de tipos da interface, não é aceito tipos primitivos, apenas objetos.
     */
    Map<String, Integer> notas = new HashMap<>();

    /*
     * Adiciona valores no HashMap
     * Chaves iguais não são permitidas, ao adicionar chaves iguais, o valor da última adição é o que irá prevalecer
     */
    notas.put("Aron", 9);
    notas.put("Lola", 10);
    notas.put("Luli", 10);
    notas.put("Nega", 10);
    notas.put("Nega", 5);

    /*
     * Pega valor através da chave
     * var trabalha por inferência de tipo (Apenas para as variaveis que ele sabe o tipo)
     */
    var nota = notas.get("Aron");
    System.out.println(nota);

    /*
     * Percorre HashMap com for - each
     * entrySet() = É uma forma de obter um conjunto de todas as entradas de chave-valor de um Map,
     * cada entrada do conjunto retornado é do tipo Map.Entry<X, Y> onde X é o tipo da chave e o Y é o tipo do
     * valor no Map, e o tipo do conjunto retornado é Set<Map.Entry<X, Y>>.
     * É especialmente útil quando precisamos iterar sobre um Map e/ou acessar e trabalhar tanto com a chave quanto
     * o valor.
     */
    for (Map.Entry<String, Integer> entry : notas.entrySet()) {
      String key = entry.getKey();
      Integer value = entry.getValue();

      System.out.println("A chave é " + key + " e o valor é " + value);
    }
  }
}