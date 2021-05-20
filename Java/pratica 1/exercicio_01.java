/* 
Em linguagem de programação Java, escreva um algoritmo que calcule e apresentea área de um losango. 
As diagonais maior e menor do losango devem ser informadas pelo usuário. 
OBS:AREA = (DIAGONAL MAIOR * DIAGONAL MENOR)/2
*/

import java.util.Scanner; // 1. importando a classe Scanner

public class exercicio_01 {

  public static void main(String[] args) {
    double diagonalMaior, diagonalMenor, area;

    Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner


    System.out.printf("Informe o valor da diagonal menor: ");
    diagonalMenor = ler.nextDouble(); // 3. entrada de dados (lendo um valor double)

    System.out.printf("Informe o segundo valor: ");
    diagonalMaior = ler.nextDouble(); // 3. entrada de dados (lendo um valor double)
    area = (diagonalMaior * diagonalMenor) / 2;

    System.out.printf("\nResultados:\n");
    System.out.printf("A area calculada é igual: %f", area);

  }

}