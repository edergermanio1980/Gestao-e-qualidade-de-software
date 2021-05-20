import java.util.Scanner; // 1. importando a classe Scanner

public class exercicio_04 {

  public static void main(String[] args) {
    int i, numero;
    double fat = 1;
    String resposta;

    Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner

    do {
        System.out.printf("Informe o numero: ");
        resposta = ler.next();
        numero = Integer.parseInt(resposta);
        if (numero < 0)
            System.out.printf("Numero inválido");

    } while (numero < 0);
    
    for(i = numero; i > 0; i--)
        fat *= i;
        
    System.out.printf(String.format("%d! = %.0f", numero, fat));

  }

}