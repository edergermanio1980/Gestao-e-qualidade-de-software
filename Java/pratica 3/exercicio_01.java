/*
Em linguagem de programação Java, escreva um algoritmoque leia e valide os seguintes dados:
a.Nota: entre 0 e 10.
b.Salário: maior que zero.
c.Sexo: m ou f.
d.Idade: entre 0 e 150.
*/

import java.util.Scanner; // 1. importando a classe Scanner

public class exercicio_01 {

  public static void main(String[] args) {
    String resp = null, sexo = null;
    double nota = 0, salario = 0;
    int idade = 0;
    Boolean repetir = true;

    Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner
    do{
        System.out.printf("Informe a nota [0 a 10]: ");
        resp = ler.next();
        if (resp == "" || resp == null) {
            System.err.println("Digite um valor válido!");
            System.exit(1);
        }

        try{
            nota = Double.parseDouble(resp);
            repetir = true;
            if (nota >=0 && nota <=10){
                repetir = false;
            }

        } catch (NumberFormatException e) {
            System.err.println("Número inválido");
            repetir = true;
        }
    } while (repetir);
    System.err.println("Nota informada: " + nota);
    
    //Salário
    do{
        System.out.printf("Informe a salário [maior que 0]: ");
        resp = ler.next();
        if (resp == "" || resp == null) {
            System.err.println("Digite um valor válido!");
            System.exit(1);
        }

        try{
            salario = Double.parseDouble(resp);
            repetir = true;
            if (salario > 0){
                repetir = false;
            }

        } catch (NumberFormatException e) {
            System.err.println("Salário inválido");
            repetir = true;
        }
    } while (repetir);
    System.err.println("Salário informado: " + salario);
    
    //Sexo
    do{
        System.out.printf("Informe o sexo [m, f]: ");
        sexo = ler.next();

        repetir = true;
        if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")){
            repetir = false;
        }

    } while (repetir);
    System.err.println("Sexo informado: " + sexo);

    //Idade
    do{
        System.out.printf("Informe a idade [0 a 150]: ");
        resp = ler.next();
        if (resp == "" || resp == null) {
            System.err.println("Digite um valor válido!");
            System.exit(1);
        }

        try{
            idade = Integer.parseInt(resp);
            repetir = true;
            if (idade >= 0 && idade <= 150){
                repetir = false;
            }

        } catch (NumberFormatException e) {
            System.err.println("Número inválido");
            repetir = true;
        }
    } while (repetir);

    System.err.println("Idade informada: " + idade);
  }
}