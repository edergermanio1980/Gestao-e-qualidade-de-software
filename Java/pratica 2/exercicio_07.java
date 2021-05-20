import java.util.Scanner;

/*
Em linguagem de programação Java, escreva um algoritmo queinforme o preço dos produtos de uma loja, conforme indicado na tabela abaixo. 
O algoritmo deve receber o código do produto como entrada.
1 - Sapato - R$ 99,99
2 - Bolsa - R$ 103,89
3 - Camisa - R$ 49,98
4 - Calça - R$ 89,72
5 - Blusa - R$ 97,35
*/
public class exercicio_07 {
    
  public static void main(String[] args) {
    int codigo_produto; 
    String nome_produto, valor_produto;

    Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner
 
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



  }

}
