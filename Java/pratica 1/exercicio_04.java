/* 
Em linguagem de programação Java, escreva um algoritmo quereceba osvaloresdosdois catetos de um triângulo, 
calcule e apresenteo valor da hipotenusa.OBS-Teorema de Pitágoras: a2= b2+ c2.
*/

import java.util.Scanner; // 1. importando a classe Scanner

public class exercicio_04 {

  public static void main(String[] args) {
    double catetoAdjacente, catetoOposto, hipotenusa;

    Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner


    System.out.printf("Informe o cateto Adjacente: ");
    catetoAdjacente = ler.nextDouble(); // 3. entrada de dados (lendo um valor double)

    System.out.printf("Informe o cateto Oposto: ");
    catetoOposto = ler.nextDouble(); // 3. entrada de dados (lendo um valor double)

    hipotenusa = Math.sqrt(Math.pow(catetoAdjacente, 2) + Math.pow(catetoOposto, 2));

    System.out.printf("\nResultados:\n");
    System.out.printf("Hipotenusa: %f", hipotenusa);

  }

}