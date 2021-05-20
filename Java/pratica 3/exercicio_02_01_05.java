import java.util.Scanner; // 1. importando a classe Scanner

public class exercicio_02_01_05 {

  public static void main(String[] args) {
    String resp = null, sexo = null;
    Boolean repetir = true;
    
    double raio, comprimento, area, volume;
    Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner

    do {
        System.out.printf("Informe o raio da esfera: ");
        raio = ler.nextDouble(); // 3. entrada de dados (lendo um valor double)
    
        comprimento = 2 * Math.PI * raio;
        area = Math.PI * Math.pow(raio, 3);
        volume = (double) 3 / 4 * Math.PI * Math.pow(raio, 3);
    
        System.out.printf("\n Resultados:\n");
        System.out.printf("\n Comprimento: %f", comprimento);
        System.out.printf("\n Area: %f", area);
        System.out.printf("\n Volume: %f", volume);
    
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
