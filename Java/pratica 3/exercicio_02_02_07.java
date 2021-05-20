import java.util.Scanner; // 1. importando a classe Scanner

public class exercicio_02_02_07 {

  public static void main(String[] args) {
    String resp = null, sexo = null;
    Boolean repetir = true;

    int codigo_produto; 
    String nome_produto, valor_produto;
    Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner

    do {
        // 3. entrada de dados (lendo um valor double)
        System.out.printf("Informe o código do produto: ");
        codigo_produto = ler.nextInt();
    
        switch(codigo_produto) {
            case 1:
                nome_produto = "Sapato";
                valor_produto = "R$ 99,99";
                break;
            case 2:
                nome_produto = "Bolsa";
                valor_produto = "R$ 103,89";
                break;
            case 3:
                nome_produto = "Camisa";
                valor_produto = "R$ 49,98";
                break;
            case 4:
                nome_produto = "Calça";
                valor_produto = "R$ 89,72";
                break;
            case 5:
                nome_produto = "Blusa";
                valor_produto = "R$ 97,35";
                break;
            default:
                nome_produto = "Não encontado";
                valor_produto = "R$ 0,00";
            break;
          }
    
        System.out.printf("\nCódigo do Produto: " + codigo_produto);
        System.out.printf("\nNome do produto: " + nome_produto);
        System.out.printf("\nValor do produto: " + valor_produto);
            
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
