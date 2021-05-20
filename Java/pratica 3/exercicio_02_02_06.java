import java.util.Scanner; // 1. importando a classe Scanner

public class exercicio_02_02_05 {

  public static void main(String[] args) {
    String resp = null, sexo = null;
    Boolean repetir = true;

    double a, b, c, delta;
    Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner

    do {
        // 3. entrada de dados (lendo um valor double)
        System.out.printf("Informe o 1 coeficiente: ");
        a = ler.nextDouble();
    
        System.out.printf("Informe o 2 coeficiente: ");
        b = ler.nextDouble();
    
        System.out.printf("Informe o 3 coeficiente: ");
        c = ler.nextDouble();
    
        if (a == 0){
            if (b == 0){
                if (c == 0){
                    System.out.printf("\nIgualdade Confirmada.");
                } else{
                    System.out.printf("\nCoeficientes informados incorretamente");
            
                }
            }
            else{
                System.out.printf("\nEsta é uma equação de 1 grau.");
                System.out.printf("\nRaiz quadrada: " + (-c / b));
            }
        }
        else {
            System.out.printf("\nEsta é uma equação de 2 grau.");
            delta = Math.pow(b, 2) - 4 * a * c;
    
            if (delta < 0){
                System.out.printf("\nEsta equação nao possui raizes reais pois \ndelta < 0");
            }
            else if (delta == 0 ) {
                System.out.printf("\nEsta equação possui 2 raizes reais iguais pois \ndelta = 0 \nx' = x '' = " + (-b / (2 * a)));
            } 
            else {
                System.out.printf("\nEsta equação possui 2 raizes reais diferentes pois \ndelta: " + delta + 
                                    " \nx': " + ((-b  + Math.sqrt(delta)) / 2 * a) +
                                    "\nx'': " + ((-b  - Math.sqrt(delta)) / 2 * a));
            }
        }
            
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
