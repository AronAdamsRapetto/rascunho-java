package gConstrutor;

public class TesteDeConstrutor {
  public static void main(String[] args) {
    Construtor construtor2 = new Construtor(0);
    Construtor construtor1 = new Construtor(0, "texto");

    construtor1.getNumero();
    construtor2.getNumero();
  }
}
