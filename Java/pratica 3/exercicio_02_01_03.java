import java.util.Scanner; // 1. importando a classe Scanner

public class exercicio_02_01_03 {

  public static void main(String[] args) {
    String resp = null, sexo = null;
    Boolean repetir = true;
    
    double salarioMinimo, salarioFuncionário, quantidade;
    Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner

    do{
        System.out.printf("Informe o valor do salário do funcionário: ");
        salarioFuncionário = ler.nextDouble(); // 3. entrada de dados (lendo um valor double)
    
        System.out.printf("Informe o valor do salário mínimo: ");
        salarioMinimo = ler.nextDouble(); // 3. entrada de dados (lendo um valor double)
    
        quantidade = (salarioFuncionário / salarioMinimo);
    
        System.out.printf("\nResultados:\n");
        System.out.printf("Quantidade: %f", quantidade);
    
        //-----------------------
        System.out.printf("\nDeseja repetir o programa [s, n]: ");
        resp = ler.next();
        repetir = true;
        if (resp.equalsIgnoreCase("nao") || resp.equalsIgnoreCase("não") || resp.equalsIgnoreCase("n")){
            repetir = false;
        }
    } while (repetir);
    System.err.println("Fim do Programa");

  }
}
