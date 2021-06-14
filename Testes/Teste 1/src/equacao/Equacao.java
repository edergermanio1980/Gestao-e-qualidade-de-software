package equacao;

public class Equacao {

	double a, b, c;
	
	public Equacao() {
		
	}

	public Equacao(double a, double b, double c) {
		this.b = b;
		this.c = c;
	}

	public String calcularEquacao() {
		String resultado = "";
		if (this.a == 0)
			if (this.b == 0)
				if (this.c == 0)
					resultado = ("Igualdade confirmada 0 = 0 ");
				else
					resultado = ("Coeficientes informados incorretamentes");
			else
				resultado = this.equacaoPrimeiroGrau();
		else
			resultado = this.equacaoSegundoGrau();

		return resultado;

	}

	private String equacaoPrimeiroGrau() {
		EquacaoPrimeiroGrau equacao = new EquacaoPrimeiroGrau(this.b, this.c);
		return String.format("Esta ç uma equação do primerio grau: x = %.2f", equacao.getX());
	}

	private String equacaoSegundoGrau() {
        EquacaoSegundoGrau equacao = new EquacaoSegundoGrau(this.a, this.b, this.c);
		String resultado = String.format("Esta e uma equação do segundo grau. ");

		if (equacao.getDelta() < 0)
			resultado += String.format("A equação nao possui raizes reais (delta < 0): (delta = %.2f)", equacao.getDelta());
		else if (equacao.getDelta() == 00)
			resultado += String.format("A equacao possui duas raizes reais iguais: x = %.2f", equacao.getX());
		else
			resultado += String.format(
					"Esta equação possui duas raizes reais diferentes: delta = %.2f, x1 = %.2f, x2 = %.2f",
					equacao.getDelta(), equacao.getX1(), equacao.getX2());

		return resultado;

	}


}
