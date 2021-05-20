/* 
Em linguagem de programação Java, escreva um algoritmo quedeterminea situação de peso de um indivíduo
determinada através do IMC (Índice de MassaCorpórea). O IMC é definido como a relação entre o peso (em kg) e o quadrado da Altura (em m) do indivíduo: 
IMC= PESO/ALTURA2. 
A situação do peso é indicada na tabela ao lado:
IMC abaixo de 20 - Abaixo do Peso
IMC de 20 até 25 - Normal
IMC de 25 até 30 - Sobrepeso
IMC de 30 até 40 - Obesidade
IMC acima de 40  - ObesidadeMórbida
*/


import java.util.Scanner; // 1. importando a classe Scanner

public class exercicio_03 {

  public static void main(String[] args) {
    double peso, altura, imc;

    Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner
 
    // 3. entrada de dados (lendo um valor double)
    System.out.printf("Informe o peso: ");
    peso = ler.nextDouble();

    System.out.printf("Informe a altura: ");
    altura = ler.nextDouble();

    imc = peso / Math.pow(altura, 2);

    System.out.printf("\n imc: " + imc);

    if (imc < 20)
        System.out.printf("\n Abaixo do Peso");
    else if (imc >= 20 && imc < 25)
        System.out.printf("\n Normal");
    else if (imc >= 25 && imc < 30)
        System.out.printf("\n Sobrepeso");
    else if (imc >= 30 && imc < 40)
        System.out.printf("\n Obesidade");
    else
        System.out.printf("\n Obesidade Mórbida");
    }

}