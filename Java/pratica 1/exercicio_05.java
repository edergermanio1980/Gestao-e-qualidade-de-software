/* 
Em linguagem de programação Java, escreva um algoritmo quereceba o raio, calcule e apresente:
a.O comprimento de uma esfera: C = 2 * π* R.
b. A área de uma esfera: A = π * R2
c.O volume de uma esfera: V = ¾ *π* R3.
*/

import java.util.Scanner; // 1. importando a classe Scanner

public class exercicio_05 {

  public static void main(String[] args) {
    double raio, comprimento, area, volume;

    Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner


    System.out.printf("Informe o raio da esfera: ");
    raio = ler.nextDouble(); // 3. entrada de dados (lendo um valor double)

    comprimento = 2 * Math.PI * raio;
    area = Math.PI * Math.pow(raio, 3);
    volume = (double) 3 / 4 * Math.PI * Math.pow(raio, 3);

    System.out.printf("\n Resultados:\n");
    System.out.printf("\n Comprimento: %f", comprimento);
    System.out.printf("\n Area: %f", area);
    System.out.printf("\n Volume: %f", volume);

  }

}