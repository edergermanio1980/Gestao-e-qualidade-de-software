import java.util.Scanner; // 1. importando a classe Scanner

public class exercicio_02 {

  public static void main(String[] args) {
    int canal = 0,
    totalPessoas = 0,
    pessoasCanal4 = 0,
    pessoasCanal5 = 0,
    pessoasCanal7 = 0,
    pessoasCanal12 = 0;
    String resposta;

    Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner

    System.out.printf("Informe o canal [4, 5, 7, 12]: ");
    resposta = ler.next();
    canal = Integer.parseInt(resposta);

    while( canal != 0 ){
        switch(canal){
            case 4:
                System.out.printf("Informe o numero de pessoas assistindo ao canal 4: ");
                resposta = ler.next();
                pessoasCanal4 += Integer.parseInt(resposta);
                totalPessoas += Integer.parseInt(resposta);
                break;
            case 5:
                System.out.printf("Informe o numero de pessoas assistindo ao canal 5: ");
                resposta = ler.next();
                pessoasCanal5 += Integer.parseInt(resposta);
                totalPessoas += Integer.parseInt(resposta);
                break;
            case 7:
                System.out.printf("Informe o numero de pessoas assistindo ao canal 7: ");
                resposta = ler.next();
                pessoasCanal7 += Integer.parseInt(resposta);
                totalPessoas += Integer.parseInt(resposta);
                break;
            case 12:
                System.out.printf("Informe o numero de pessoas assistindo ao canal 12: ");
                resposta = ler.next();
                pessoasCanal12 += Integer.parseInt(resposta);
                totalPessoas += Integer.parseInt(resposta);
                break;
        }
        System.out.printf("Informe o canal [4, 5, 7, 12]: ");
        resposta = ler.next();
        canal = Integer.parseInt(resposta);

    }

    System.out.printf("\nResultados:\n");
    System.out.printf("\nTotal Pessoas no Canal %3d: Total de Pessoas: %3d - Representando: %9.2f%%",4, pessoasCanal4, ((double)  pessoasCanal4 / (totalPessoas)) * 100);
    System.out.printf("\nTotal Pessoas no Canal %3d: Total de Pessoas: %3d - Representando: %9.2f%%",5, pessoasCanal5, ((double)  pessoasCanal5 / (totalPessoas)) * 100);
    System.out.printf("\nTotal Pessoas no Canal %3d: Total de Pessoas: %3d - Representando: %9.2f%%",7, pessoasCanal7, ((double)  pessoasCanal7 / (totalPessoas)) * 100);
    System.out.printf("\nTotal Pessoas no Canal %3d: Total de Pessoas: %3d - Representando: %9.2f%%",12, pessoasCanal12, ((double)  pessoasCanal12 / (totalPessoas)) * 100);

  }

}