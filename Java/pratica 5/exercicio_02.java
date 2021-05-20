
import java.util.Scanner; // 1. importando a classe Scanner

public class exercicio_02 {

  public static void main(String[] args) {
    int i = 0, soma = 0;

    for(i = 7; i <= 20; i++){
        soma += i;
    }
    System.out.printf("\nSoma: " + soma);
  }

}