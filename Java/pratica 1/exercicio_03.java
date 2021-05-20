/* 
Em linguagem de programação Java, escreva um algoritmo que receba o valor do salário mínimo e o 
valor do salário de um funcionário. O algoritmo deve calcular e 
apresentar a quantidade de salários mínimos que esse funcionário recebe
*/

import java.util.Scanner; // 1. importando a classe Scanner

public class exercicio_03 {

  public static void main(String[] args) {
    double salarioMinimo, salarioFuncionário, quantidade;

    Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner


    System.out.printf("Informe o valor do salário do funcionário: ");
    salarioFuncionário = ler.nextDouble(); // 3. entrada de dados (lendo um valor double)

    System.out.printf("Informe o valor do salário mínimo: ");
    salarioMinimo = ler.nextDouble(); // 3. entrada de dados (lendo um valor double)

    quantidade = (salarioFuncionário / salarioMinimo);

    System.out.printf("\nResultados:\n");
    System.out.printf("Quantidade: %f", quantidade);

  }

}