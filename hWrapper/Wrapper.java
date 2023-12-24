package hWrapper;

public class Wrapper {

  public static void main(String[] args) {
    int tipoInt = 1;
    float tipoFloat = 1f;
    boolean tipoBoolean = false;
    
    // Isso dá erro
    // if(tipoInt == null);
    if(tipoInt == 1);
    if(tipoFloat == 1);
    if(tipoBoolean);

    /*
     * Os Wrapper Classes são classes que encapsulam os tipos primitivos em objetos, cada um dos 8 tipos
     * primitivos em java possui um wrapper correspondente, elas são usadas para converter tipos primitivos em
     * objetos.
     * Os wrapper classes ao contrário dos tipos primitivos, possuem métodos úteis como parseInt(), toString(),
     * entre vários e vários outros, e aceitam valor nulo.
     * Wrapper classes também são úteis com coleções Java como ArrayList e HashMap que funcionam apenas com objetos,
     * e outros métodos que requerem objetos como parâmetro.
     * 
     * Deve-se pensar quando e como utilizar os wrappers e os tipos primitivos, pois por se tratarem de
     * objetos com métodos, os wrappers ocupam mais espaço na memória prejudicando na performance da aplicação,
     * já os tipos primitivos o espaço ocupado será exatamente aquele definido no atributo.
     */

    Float tipoFloat2 = 1f;
    Boolean tipoBoolean2 = false;
    Integer tipoInteger = null;

    tipoFloat2.toString();
    tipoBoolean2.compareTo(tipoBoolean);
    if(tipoInteger == null);
  }
}
