package lojaveiculo;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import Veiculo;

public class Main {

	private Scanner l;
	private boolean execute;
	private List<Veiculo> dados;

	public static void main(String[] args) {
		new Main();
	}

	private Main() {
		l = new Scanner(System.in);
		execute = true;
		dados = new ArrayList<Veiculo>();

		System.out.println("BEM VINDO AO CADASTRO DE VEÍCULOS");

		while (execute) {
			String opcao = menu();

			if (opcao.equalsIgnoreCase("n")) {
				cadastrar();
			} else if (opcao.equalsIgnoreCase("l")) {
				listarCadastros();
			} else if (opcao.equalsIgnoreCase("x")) {
				execute = false;
			} else {
				System.out.println("\nOpção Inválida seu noob !!! \n");
			}
		}
	}

	private String menu() {
		System.out.println("Selecione a opção:");
		System.out.println("N - Novo cadastro");
		System.out.println("L - Listar cadastros");
		System.out.println("X - Sair");
		return l.nextLine();
	}

	private void cadastrar() {
		boolean cadastrando = true;

		while (cadastrando) {
			System.out.println("Cadastro de Veículos");
			Veiculo d = new Veiculo();
			d.setPlaca(textInput("Placa:"));
			d.setChassi(textInput("Chassi: "));

			String cadastrar = textInput("Adicionar cadastro (S/N) ?");
			if (cadastrar.equalsIgnoreCase("s")) {
				System.out.println("Cadastro adicionado !!!");
				dados.add(d);
			} else if (cadastrar.equalsIgnoreCase("n")){
				System.out.println("Cadastro ignorado !!!");
			} else {
				System.out.println("\nOpção inválida seu noob, vou ignorar o cadastro só pra você ter que digitar denovo !!! \n");
			}

			String continua = textInput("Continuar cadastrando (S/N) ?");
			if (continua.equalsIgnoreCase("N")) {
				cadastrando = false;
			} else if (continua.equalsIgnoreCase("s")){
				// se for s sai do if e volta para o inicio do while
			} else {
				System.out.println("\nOpção inválida seu noob, eu vou sair só porque você não colabora !!! \n");
				cadastrando = false;
			}
		}
	}

	private void listarCadastros() {
		if (dados.size() == 0) {
			System.out.println("\nNão existem cadastros !!!\n");
		} else {
			System.out.println("\nLista de Cadastros\n");
			for (int i = 0; i < dados.size(); i++) {
				Veiculo d = dados.get(i);
				System.out.println("Cadastro número: " + i);
				System.out.println("\tPlaca: " + d.getPlaca());
				System.out.println("\tChassi: " + d.getChassi());
			}
			System.out.println("\nFim da lista\n");
		}
	}

	private String textInput(String label) {
		System.out.println(label);
		return l.nextLine();
	}
}