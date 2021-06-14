import java.util.Scanner;

/**
 * exercicioUNA
 */
public class exericio_01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1;
        int num2;
        try{
        System.out.println("Digite o primeiro número");
        num1 = entrada.nextInt();
        System.out.println("Digite o segundo número");
        num2 = entrada.nextInt();
        int divisao = num1/num2;
        System.out.println("A divisão entre esses dois números é: " + divisao);
    } catch(ArithmeticException erro) {
        System.out.println("Nenhum número pode ser divido por 0, tente novamente");
    }

    }
}