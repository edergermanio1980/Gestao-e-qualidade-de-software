import java.util.Scanner; // 1. importando a classe Scanner

public class exercicio_01 {

  public static void main(String[] args) {
    int falta = 0,
    contadorAlunosNotaMaiorIgual90 = 0,
    contadorAlunosReprovados = 0,
    contadorNotas = 0;
    double nota = 0, menorNota = 0, maiornota = 0, somaNotas = 0;
    String resposta;

    Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner

    System.out.printf("Informe o valor a nota [0 a 100]: nota menor que zero fecha o programa: ");
    resposta = ler.next();
    nota = Double.parseDouble(resposta);

    menorNota = nota;
    maiornota = nota;

    while( nota >= 0 ){
        System.out.printf("Informe o valor a numero de faltas [0 a 150]:");
        resposta = ler.next();

        falta = Integer.parseInt(resposta);

        if( nota >= 90)
            contadorAlunosNotaMaiorIgual90++;

        if( nota < 70 || falta > 20)
            contadorAlunosReprovados++;

        if( nota < menorNota)
            menorNota = nota;

        if( nota > maiornota)
            maiornota = nota;

        contadorNotas++;
        somaNotas += nota;

        System.out.printf("Informe o valor a nota [0 a 100]: nota menor que zero fecha o programa: ");
        resposta = ler.next();
        nota = Double.parseDouble(resposta);

    }

    System.out.printf("\nResultados:\n");
    System.out.printf("\nAlunos com nota superior a 90: " + contadorAlunosNotaMaiorIgual90);
    System.out.printf("\nAlunos reprovados: " + contadorAlunosReprovados);
    System.out.printf("\nMenor nota: " + menorNota);
    System.out.printf("\nMaior nota: " + maiornota);
    System.out.printf("\nMédia das notas: " + (double) somaNotas / (double) contadorNotas);

  }

}