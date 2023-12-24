package aPrimeirosPassos;

/*
* public = Tipo de acesso da classe
* HelloWorld = Nome da minha classe
*/ 
public class HelloWorld {

  // Todo conteúdo deverá ser inserido aqui dentro

  /*
   * public = Restrição de acesso
   * static = Indica que o método pode ser chamado sem que o um objeto seja instanciado a partir dessa classe
   * void = Tipo de retorno do método
   * main = Nome do método
   * String[] args = Indica que o método pode receber uma lista argumentos do tipo String 
   * 
   * Todo código que for executado, precisa estar dentro do método main mesmo que indiretamente, para poder
   * ser reconhecido pelo compilador
   */
  public static void main(String[] args) {
    // Instrução para escrever algo no console.
    // sysout = atalho para instrução abaixo no vscode
    System.out.println("Hello World!");
  }
}
// Fora do escopo classe