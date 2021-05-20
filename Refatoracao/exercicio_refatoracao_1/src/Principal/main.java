package Principal;

import java.util.Scanner;

public class main {
	

	public static void main(String[] args) {
	    double a, b, c;
	 
	    a = lerNumero("Informe o 1 coeficiente: ");
	    b = lerNumero("Informe o 2 coeficiente: ");
	    c = lerNumero("Informe o 3 coeficiente: ");
	    
		CalculaCoeficiente calculo = new CalculaCoeficiente();
	    
	    calculo.setA(a);
	    calculo.setB(b);
	    calculo.setC(c);
	    
	    System.out.println(calculo.executaCalculo());

	}
	
	private static double lerNumero(String titulo) {
	    Scanner ler = new Scanner(System.in);
		double valor;
	    System.out.printf(titulo);
	    valor = ler.nextDouble();
	    return valor;
	}

}
