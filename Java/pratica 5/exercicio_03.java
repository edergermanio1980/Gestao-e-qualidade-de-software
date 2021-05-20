
import java.util.Scanner; // 1. importando a classe Scanner

public class exercicio_03 {

  public static void main(String[] args) {
    int i, limInferior, limSuperior;
    String resposta;

    Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner

    System.out.printf("Informe o Limite Inferior: ");
    limInferior = ler.nextInt(); // 3. entrada de dados (lendo um valor double)

    System.out.printf("Informe o Limite Superior: ");
    limSuperior = ler.nextInt(); // 3. entrada de dados (lendo um valor double)

    System.out.printf("\nResultados:\n");
    for(i = limInferior; i<= limSuperior; i++){
        
        System.out.printf("\n" + i);
    }

  }

}