package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import equacao.Equacao;
import equacao.EquacaoSegundoGrau;

class EquacaoTest {

	private Equacao equacao;


	    @Test
	    void calcularEquacaoTest() {
	    equacao = new Equacao(0, 0, 0);
		String response = equacao.calcularEquacao();
		assertEquals(response, "Igualdade confirmada 0 = 0 ");

		equacao = new Equacao(0, 0, 8);
		response = equacao.calcularEquacao();
		assertEquals(response, "Coeficientes informados incorretamentes");

		equacao = new Equacao(0, 2, -8);
		response = equacao.calcularEquacao();
		assertEquals(response, "Esta � uma equação do primerio grau: x = 4,00");

		equacao = new Equacao(10, -4, 12);
		response = equacao.calcularEquacao();
		assertEquals(response, "Esta e uma equação do segundo grau."
				+ " A equação nao possui raizes reais (delta < 0): (delta = -464,00)");

		equacao = new Equacao(4, -4, 1);
		response = equacao.calcularEquacao();
		assertEquals(response,
				"Esta e uma equação do segundo grau." + " A equacao possui duas raizes reais iguais: x = 0,50");

		equacao = new Equacao(1, 6, 7);
		response = equacao.calcularEquacao();
		assertEquals(response, "Esta e uma equação do segundo grau."
				+ " Esta equação possui duas raizes reais diferentes: delta = 8,00, x1 = -1,59, x2 = -4,41");

	}

}
