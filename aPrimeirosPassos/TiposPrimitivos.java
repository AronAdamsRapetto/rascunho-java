package aPrimeirosPassos;
public class TiposPrimitivos {
  public static void main(String[] args) {
    /*
     * Números (int, double, float, long)
     * Texto (String)
     * Booleano (boolean)
     * MAIS...
     */
    int dadoDoTipoInt = 10;
    double dadoDoTipoDouble = 3.14;
    float dadoDoTipoFloat = 3.14f;
    long dadoDoTipoLong = 1234567891234567891L;
    String dadoDoTipoString = "Colocar o meu texto";
    boolean dadoDoTipoBoolean = true;

    // Apenas para a IDE parar de reclamar da variavel não estar sendo usada
    if (dadoDoTipoBoolean);
    if (dadoDoTipoString == "");
    if (dadoDoTipoFloat == 2);
    if (dadoDoTipoLong == 1000000000000L);
    if (dadoDoTipoDouble == 3.1);
    if (dadoDoTipoInt == 2);
  }
}
