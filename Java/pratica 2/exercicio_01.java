/* 
Em linguagem de programação Java, escreva um algoritmo que leia os três lados de um triângulo e imprima o tipo de triângulo:
a.Equilátero: os três lados são iguais.
b.Isósceles: 2 lados são iguais.
c.Escaleno: 3 lados diferentes.
*/

import java.util.Scanner; // 1. importando a classe Scanner

public class exercicio_01 {

  public static void main(String[] args) {
    double lado_1, lado_2, lado_3;

    Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner
 
    // 3. entrada de dados (lendo um valor double)
    System.out.printf("Informe o lado 1: ");
    lado_1 = ler.nextDouble();

    System.out.printf("Informe o lado 2: ");
    lado_2 = ler.nextDouble();

    System.out.printf("Informe o lado 3: ");
    lado_3 = ler.nextDouble();

    if (lado_1 == lado_2 && lado_2 == lado_3)
        System.out.printf("\n Triangulo equilátero");
    else if (lado_1 == lado_2 || lado_1 == lado_3 || lado_2 == lado_3)
        System.out.printf("\n Triangulo isósceles");
    else
        System.out.printf("\n Triangulo escaleno");

  }

}