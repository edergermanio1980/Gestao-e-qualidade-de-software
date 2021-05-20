/* 
Em linguagem de programação Java, implemente um algoritmo que retorne o valor da função abaixo após receber um valor qualquer de entrada:
f(x) = 2x + 2, para x < -2
f(x) = 3, para -2 <=x < 3
f(x) = -x, para x >= 3

*/

import java.util.Scanner; // 1. importando a classe Scanner

public class exercicio_04{

    public static void main(String[] args) {
        double x;

        Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner

        // 3. entrada de dados (lendo um valor double)
        System.out.printf("Informe o x: ");
        x = ler.nextDouble();

        if (x < -2)
            System.out.printf("\n f(" + x + ") = " + (2 * x + 2));
        else if (x >= -2 && x < 3)
            System.out.printf("\n f(" + x + ") = " + 3);
        else
            System.out.printf("\n f(" + x + ") = " + (-x));
    }

}