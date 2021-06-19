import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();

        while(true) {
            System.out.println("Estamos falando de uma pessoa real?");
            System.out.println("Pessoa Física: 'S' \nPessoa Jurídica: 'N'");

            String option = new Scanner(System.in).nextLine();
            option = option.toLowerCase();

            if(option.equals("s")) {
                System.out.println("Serão quantas pessoas?");
                int amount = new Scanner(System.in).nextInt();
                cadastro.cadastrarFisico(amount);
                break;
            }else if(option.equals("n")){
                System.out.println("Serão quantas empresas?");
                int amount = new Scanner(System.in).nextInt();
                cadastro.cadastrarJuridico(amount);
                break;
            }else{

                System.out.println("Não entendi, poderia repetir?");
            }
        }
    }
}

class Cadastro {

    static PessoaJuridica pessoaJuridica;
    static PessoaFisica pessoaFisica;


    public static void cadastrarFisico(int limite) {

        String[] cadpessoaFisica = new String[limite];
        int[] cpf = new int[limite];

        for (int i = 0; i < cadpessoaFisica.length; i++) {

            System.out.println("Escreva o nome da " + (i + 1) + "º Pessoa.");
            cadpessoaFisica[i] = new Scanner(System.in).nextLine();

            System.out.println("E seu Cpf");
            cpf[i] = new Scanner(System.in).nextInt();
        }

        pessoaFisica = new PessoaFisica(cadpessoaFisica, cpf);

        print(limite, cadpessoaFisica, cpf);
    }

    public static void cadastrarJuridico(int limite) {


        String[] cadpessoaJuridica = new String[limite];
        int[] cnpj = new int[limite];

        for (int i = 0; i < cadpessoaJuridica.length; i++) {

            System.out.println("Escreva a " + (i + 1) + "º Empresa.");
            cadpessoaJuridica[i] = new Scanner(System.in).nextLine();

            System.out.println("E seu Cnpj");
            cnpj[i] = new Scanner(System.in).nextInt();
        }

        pessoaJuridica = new PessoaJuridica(cadpessoaJuridica, cnpj);

        print(limite, cadpessoaJuridica, cnpj);
    }


    public static void print(int amount, String[] pessoa, int[] cadpessoa) {

            for (int i = 0; i < amount; i++) {
                System.out.println("Nome: " + pessoa[i]);
                System.out.println("Registro Numérico: " + cadpessoa[i]);
        }
    }
}
