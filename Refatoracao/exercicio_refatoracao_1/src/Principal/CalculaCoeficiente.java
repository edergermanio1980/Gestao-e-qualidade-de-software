package Principal;

public class CalculaCoeficiente {
	private double a, b, c, delta;

	public void setA(double a) {
		this.a = a;
	}

	public void setB(double b) {
		this.b = b;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	private double calculaDelta() {
		return (Math.pow(this.b, 2) - 4 * this.a * this.c); 
	}
	
	private double caclulaRaizQuadrada() {
		return (-this.c / this.b);

	}
	
	private double caclulaRaizesReaisIguais() {
		return (-this.b / (2 * this.a));

	}
	
	private double caclulaRaizesReaisDiferentes(boolean positiva) {
		if (positiva) {
			return ((-this.b  + Math.sqrt(this.delta)) / 2 * this.a);
		} else {
			return ((-this.b  - Math.sqrt(this.delta)) / 2 * this.a);
		}
	}
	
	private String calculaEquacao1Grau() {
		String retorno = null;
        if (this.b == 0){
            if (this.c == 0){
            	retorno = "\nIgualdade Confirmada.";
            } else {
                retorno = "\nCoeficientes informados incorretamente";
        
            }
        } else {
        	retorno = "\nEsta é uma equação de 1 grau." +
        				"\nRaiz quadrada: " + caclulaRaizQuadrada();
        }
        return retorno;
	}
	
	private String calculaEquacao2Grau() {
		String retorno = null;
		
    	retorno = "\nEsta é uma equação de 2 grau.";
        this.delta = calculaDelta();

        if (this.delta < 0){
        	retorno = "\nEsta equação nao possui raizes reais pois \ndelta < 0";
        } else if (this.delta == 0 ) {
        	retorno = "\nEsta equação possui 2 raizes reais iguais pois \ndelta = 0 \nx' = x '' = " + caclulaRaizesReaisIguais();
        } else {
        	retorno = "\nEsta equação possui 2 raizes reais diferentes pois \ndelta: " + this.delta + 
                                " \nx': " + caclulaRaizesReaisDiferentes(true) +
                                "\nx'': " + caclulaRaizesReaisDiferentes(false);
        }
        return retorno;
	}

	public String executaCalculo() {
	    if (this.a == 0){
	    	return calculaEquacao1Grau();
	    } else {
	    	return calculaEquacao2Grau();
	    }

	}


}
