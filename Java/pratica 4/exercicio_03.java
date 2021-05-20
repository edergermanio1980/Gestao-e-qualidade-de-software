import java.util.Scanner; // 1. importando a classe Scanner

public class exercicio_03 {

  public static void main(String[] args) {
    int somaFilhos = 0, contador = 0;
    double salario = 0, somaSalario = 0;
    String resposta;
    Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner


    System.out.printf("Informe o valor o salário, nota menor que zero fecha o programa: ");
    resposta = ler.next();
    salario = Double.parseDouble(resposta);

    while( salario > 0 ){
        somaSalario = somaSalario + salario;

        System.out.printf("Informe o numero de filhos: ");
        resposta = ler.next();
        somaFilhos += Integer.parseInt(resposta);
        contador++;

        System.out.printf("Informe o valor o salário, nota menor que zero fecha o programa: ");
        resposta = ler.next();
        salario = Double.parseDouble(resposta);

    }
    if (contador > 0 ) {
        System.out.printf("\nResultados:\n");
        System.out.printf("\nMédia Salarios..: %20.2f", (double) somaSalario / (double) contador);
        System.out.printf("\nMédia Filhos....: %20.2f", (double) somaFilhos / (double) contador);
    }

  }

}