import java.util.Scanner; // 1. importando a classe Scanner

public class exercicio_02_01_04 {

  public static void main(String[] args) {
    String resp = null, sexo = null;
    Boolean repetir = true;
    
    double catetoAdjacente, catetoOposto, hipotenusa;
    Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner

    do{
        System.out.printf("Informe o cateto Adjacente: ");
        catetoAdjacente = ler.nextDouble(); // 3. entrada de dados (lendo um valor double)
    
        System.out.printf("Informe o cateto Oposto: ");
        catetoOposto = ler.nextDouble(); // 3. entrada de dados (lendo um valor double)
    
        hipotenusa = Math.sqrt(Math.pow(catetoAdjacente, 2) + Math.pow(catetoOposto, 2));
    
        System.out.printf("\nResultados:\n");
        System.out.printf("Hipotenusa: %f", hipotenusa);
    
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
