package aplicacao;

import entidades.ServicoEquacaoSegundoGrau;

public class Programa {
	public static void main(String[] args) {
		ServicoEquacaoSegundoGrau servicoEquacao = new ServicoEquacaoSegundoGrau();
		System.out.println(servicoEquacao.delta());
		System.out.println(servicoEquacao.x());
		System.out.println(servicoEquacao.x1());
		System.out.println(servicoEquacao.x2());
	}
}