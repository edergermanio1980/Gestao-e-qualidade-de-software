import java.util.Scanner; // 1. importando a classe Scanner

public class exercicio_02_02_05 {

  public static void main(String[] args) {
    String resp = null, sexo = null;
    Boolean repetir = true;

    double lado_1, lado_2, lado_3;
    Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner

    do {

     
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
