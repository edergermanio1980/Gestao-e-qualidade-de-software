import java.util.Scanner; // 1. importando a classe Scanner

public class exercicio_02_01_02 {

  public static void main(String[] args) {
    String resp = null, sexo = null;
    Boolean repetir = true;
    
    double celcius, fahrenheit;
    Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner

    do{
        System.out.printf("Informe o valor em graus célcius: ");
        celcius = ler.nextDouble(); // 3. entrada de dados (lendo um valor double)
        fahrenheit = (celcius * 1.8) + 32;
    
        System.out.printf("\nResultados:\n");
        System.out.printf("A temperatura em Fahrenheit é igual: %f", fahrenheit);
    
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
