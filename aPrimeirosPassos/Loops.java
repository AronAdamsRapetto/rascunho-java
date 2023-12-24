package aPrimeirosPassos;
public class Loops {
  public static void main(String[] args) {
     // While (Enquanto algo for verdadeiro, faça algo)
     int valorInicial = 0;

     while (valorInicial < 3) {
       System.out.println("O valor inicial é menor que 3");
       System.out.println(valorInicial);
       valorInicial++;
     }

     // do - while (como while, mas permite que o bloco de código seja executado pelo menos uma vez antes de validar a condição)

     do {
        System.out.println("O valor inicial é menor que 3");
        System.out.println(valorInicial);
        valorInicial++;
     } while (valorInicial < 3);
 
     // Loop For
     for(int i = 0; i < 4; i++)  {
       System.out.println("O valor do i é: " + i);
     }

     // for - each (presente nos arquivos de HashMap, HashSet e Lista)
  }
}
