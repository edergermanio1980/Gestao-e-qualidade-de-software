/* 
Em linguagem de programação Java, escreva um algoritmo quereceba uma temperatura em Celsius, 
calcule e mostre essa temperatura em Fahrenheit. OBS: F = (C*1,8) + 32.
*/

import java.util.Scanner; // 1. importando a classe Scanner

public class exercicio_02 {

  public static void main(String[] args) {
    double celcius, fahrenheit;

    Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner


    System.out.printf("Informe o valor em graus célcius: ");
    celcius = ler.nextDouble(); // 3. entrada de dados (lendo um valor double)
    fahrenheit = (celcius * 1.8) + 32;

    System.out.printf("\nResultados:\n");
    System.out.printf("A temperatura em Fahrenheit é igual: %f", fahrenheit);

  }

}