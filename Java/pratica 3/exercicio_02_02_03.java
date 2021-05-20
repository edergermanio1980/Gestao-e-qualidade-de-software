import java.util.Scanner; // 1. importando a classe Scanner

public class exercicio_02_02_03 {

  public static void main(String[] args) {
    String resp = null, sexo = null;
    Boolean repetir = true;
    
    double peso, altura, imc;
    Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner

    do {
        // 3. entrada de dados (lendo um valor double)
        System.out.printf("Informe o peso: ");
        peso = ler.nextDouble();
    
        System.out.printf("Informe a altura: ");
        altura = ler.nextDouble();
    
        imc = peso / Math.pow(altura, 2);
    
        System.out.printf("\n imc: " + imc);
    
        if (imc < 20)
            System.out.printf("\n Abaixo do Peso");
        else if (imc >= 20 && imc < 25)
            System.out.printf("\n Normal");
        else if (imc >= 25 && imc < 30)
            System.out.printf("\n Sobrepeso");
        else if (imc >= 30 && imc < 40)
            System.out.printf("\n Obesidade");
        else
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
