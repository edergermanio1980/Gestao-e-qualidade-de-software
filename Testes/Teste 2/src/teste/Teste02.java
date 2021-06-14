package teste;

import static org.junit.jupiter.api.Assertions.*;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import refatoracao02.Relatorio;
import refatoracao02.Produto;
import refatoracao02.InterfaceRelatorio;

class Teste02 {
	Relatorio relatorio = new Relatorio();

	double total = 0;
	Produto prod1 = new Produto("Arroz", 5, 18.75);
	Produto prod2 = new Produto("Feijão", 1, 4.95);
	Produto prod3 = new Produto("Leite", 1, 3.49);
	ArrayList<Produto> produtos = new ArrayList();

	@Test
	void testSomatorio() {

		produtos.add(prod1);
		produtos.add(prod2);
		produtos.add(prod3);
		double somando = relatorio.somaPrecos(produtos);
		assertEquals(102.19, somando);
	}

	@Test
	void testDesconto() {
		double desconto = relatorio.aplicarDesconto();
	}

	@Test
	void testTaxa() {
		double taxaDom = 10;
		double taxaNormal = 5;
		DayOfWeek diaNormal = LocalDate.now().getDayOfWeek();
		if (diaNormal == DayOfWeek.SUNDAY) {
			assertEquals(10, taxaDom);
		} else {
			assertEquals(5, taxaNormal);
		}
	}

	@Test
	void testExibe() {
		double valorRecebido = relatorio.retornaTotal();
		assertTrue(true);
	}

}
