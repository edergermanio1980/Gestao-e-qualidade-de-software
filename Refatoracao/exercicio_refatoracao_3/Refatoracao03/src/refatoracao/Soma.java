
package refatoracao;

public class Soma {

	private double soma;
	public double somaNumVetor(double[] vetorNum) {
		double soma = 0;
		this.setSoma(soma);
		for (int i = 0; i < 4; i++) {
			soma = soma + vetorNum[i];
		}
		return soma;
	}

	public void setSoma(double soma) {
		this.soma = soma;
	}

}
