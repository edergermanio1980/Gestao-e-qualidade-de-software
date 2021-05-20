
import java.util.Scanner; // 1. importando a classe Scanner

public class exercicio_01 {

  public static void main(String[] args) {
    int i = 0, cont = 0;
    double num;
    Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner

    for(i = 0; i< 10; i++){
        System.out.printf("Informe o um número: ");
        num = ler.nextDouble(); // 3. entrada de dados (lendo um valor double)
            
        if (num < 0) 
            cont++;
    }
    System.out.printf("\nQuantidade de Números Negativos: " + cont);
  }

}