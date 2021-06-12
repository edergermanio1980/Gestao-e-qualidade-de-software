
package refatoracao;

public class Refatoracao03 {

	public static void main(String[] args) {
		double vetor1[] = { 90, 88, 78, 76 };
		double vetor2[] = { 865, 564, 43, 12 };

		double resultadosoma;
		double resultadosoma1;

		Soma soma = new Soma();
		Media media = new Media();

		resultadosoma = soma.somaNumVetor(vetor1);
		resultadosoma1 = soma.somaNumVetor(vetor2);

		System.out.println(soma.somaNumVetor(vetor1));
		System.out.println(soma.somaNumVetor(vetor2));

		System.out.println(media.calcularMedia(resultadosoma));
		System.out.println(media.calcularMedia(resultadosoma1));

	}

}
