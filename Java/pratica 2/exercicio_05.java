/* 
Em linguagem de programação Java, implemente um algoritmo que,
informados três valores X,Ye Z, verifiquee informe se eles podem,ou não, seros comprimentos dos lados de um triângulo. 
Em um triangulo, cada lado é menor que a soma dos outros dois lados
*/

import java.util.Scanner; // 1. importando a classe Scanner

public class exercicio_05 {

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

    if (lado_1 == (lado_2 + lado_3))
        if (lado_2 < (lado_1 + lado_3))
            if (lado_3 == (lado_1 + lado_2))
                System.out.printf("\n Triangulo válido");
            else 
                System.out.printf("\n Triangulo inválido");
        else
        System.out.printf("\n Triangulo inválido");
    else
        System.out.printf("\n Triangulo inválido");
  }

}