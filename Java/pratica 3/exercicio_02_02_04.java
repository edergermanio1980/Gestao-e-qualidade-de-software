import java.util.Scanner; // 1. importando a classe Scanner

public class exercicio_02_02_04 {

  public static void main(String[] args) {
    String resp = null, sexo = null;
    Boolean repetir = true;

    double x;
    Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner

    do {
        // 3. entrada de dados (lendo um valor double)
        System.out.printf("Informe o x: ");
        x = ler.nextDouble();

        if (x < -2)
            System.out.printf("\n f(" + x + ") = " + (2 * x + 2));
        else if (x >= -2 && x < 3)
            System.out.printf("\n f(" + x + ") = " + 3);
        else
            System.out.printf("\n f(" + x + ") = " + (-x));
            System.out.printf("\n Obesidade Mórbida");

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
