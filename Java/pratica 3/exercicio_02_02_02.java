import java.util.Scanner; // 1. importando a classe Scanner

public class exercicio_02_02_02 {

  public static void main(String[] args) {
    String resp = null, sexo = null;
    Boolean repetir = true;
    
    double nota_1, nota_2, nota_3, media;
    Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner

    do {
        // 3. entrada de dados (lendo um valor double)
        System.out.printf("Informe a nota 1: ");
        nota_1 = ler.nextDouble();
    
        System.out.printf("Informe a nota 2: ");
        nota_2 = ler.nextDouble();
    
        System.out.printf("Informe a nota 3: ");
        nota_3 = ler.nextDouble();
    
        media = (nota_1 + nota_2 + nota_3) / 3;
        System.out.printf("\n MÉDIA: " + media);
        if (media >=0 && media < 3)
            System.out.printf("\n RESULTADO: REPROVADO");
        else if (media >=3 && media < 7)
            System.out.printf("\n RESULTADO: EXAME");
        else if (media >=7)
            System.out.printf("\n RESULTADO: APROVADO");
    
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
