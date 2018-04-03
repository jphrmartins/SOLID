package br.org.fundatec.srp;

import br.org.fundatec.srp.calculadora.Calculadora;
import br.org.fundatec.srp.leitora.LeitoraValores;

public class AppAfter {
	public static void main(String[] args) {
		LeitoraValores leitora = new LeitoraValores();
		Calculadora calculadora = new Calculadora();
		int result = calculadora.somar(leitora.lerValores());
		System.out.println("O resultado da soma é: " + result);
	}
}
