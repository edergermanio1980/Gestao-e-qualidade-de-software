package teste;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import refatoracao03.Media;
import refatoracao03.Soma;

class Teste03 {

	Media media = new Media();
	Soma soma = new Soma();

	double vetor1[] = { 90, 88, 78, 76 };
	double vetor2[] = { 865, 564, 43, 12 };

	double dblSoma = soma.somaNumVetor(vetor1);

	@Test
	void testSoma() {
		assertEquals(332, dblSoma);
	}

	@Test
	void testCalcMedia() {
		double dblMedia = media.calcularMedia(dblSoma);
		assertEquals(83, dblMedia);
	}

}
