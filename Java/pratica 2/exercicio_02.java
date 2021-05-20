/* 
Em linguagem de programação Java, escreva um algoritmo quereceba 3 notas no intervalo[0,10] de um aluno, calcule e apresenteuma mensagem de acordo com sua média:
>= 0 e < 3 - REPROVADO
>= 3 e < 7 - EXAME
>= 7 e <= 10 - APROVADO
*/

import java.util.Scanner; // 1. importando a classe Scanner

public class exercicio_02 {

  public static void main(String[] args) {
    double nota_1, nota_2, nota_3, media;

    Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner
 
    // 3. entrada de dados (lendo um valor double)
    System.out.printf("Informe a nota 1: ");
    nota_1 = ler.nextDouble();

    System.out.printf("Informe a nota 2: ");
    nota_2 = ler.nextDouble();

    System.out.printf("Informe a nota 3: ");
    nota_3 = ler.nextDouble();

    media = (nota_1 + nota_2 + nota_3) / 3;
    System.out.printf("\n MÉDIA: " + media);
    if (media >=0 && media < 3)
        System.out.printf("\n RESULTADO: REPROVADO");
    else if (media >=3 && media < 7)
        System.out.printf("\n RESULTADO: EXAME");
    else if (media >=7)
        System.out.printf("\n RESULTADO: APROVADO");


  }

}