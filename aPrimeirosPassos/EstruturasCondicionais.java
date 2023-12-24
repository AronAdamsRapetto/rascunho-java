package aPrimeirosPassos;
public class EstruturasCondicionais {
  public static void main(String[] args) {
    // Operadores lógicos: &&(AND), ||(OR), !(NOT), ^(XOR), MAIS...

    int valor1 = 10;
    int valor2 = 15;
    String diaDaSemana = "Sábado";

    // If - else
    
    if (valor1 == 10) {
      System.out.println("Entrou no if");
    } else if(valor1 > 10 && valor1 < 20) {
      System.out.println("Entrou no else if");
    } else {
      System.out.println("Entrou no else");
    }

    // Switch

    switch (valor2) {
      case 5:
        System.out.println("valor é igual a 5");
        break;
      case 10:
        System.out.println("valor é igual a 10");
        break;
      case 15:
        System.out.println("valor é igual a 15");
        break;
      default:
        System.out.println("valor é diferente de todas as opções");
        break;
    }

    /*
     * O Switch expressivo foi introduzido no java oferecendo uma sintaxe mais concisa e flexivel
     * Não é necessário o uso do break, o resultado pode ser atribuido diretamente a uma variável e cada caso
     * pode corresponder a multiplos valores
     */

    String tipoDoDia =  switch (diaDaSemana) {
      case "Segunda", "Terça", "Quarta", "Quinta", "Sexta" -> "Dia útil";
      case "Sábado", "Domingo" -> "Final de semana";
      default -> "Dia inválido";
    };

    System.out.println(tipoDoDia);


    // Operador ternário

    String ternario = valor1 > 10 ? "Condição verdadeira" : "Condição falsa";

    System.out.println(ternario);
  }
}
