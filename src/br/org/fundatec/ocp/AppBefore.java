package br.org.fundatec.ocp;

import br.org.fundatec.ocp.before.Pessoa;

public class AppBefore {
	public static void main(String[] args) {
		Pessoa civil = new Pessoa(Localizacao.TERRA, 80);
		Pessoa astronauta = new Pessoa(Localizacao.ESPACO, 80);
		Pessoa marciano = new Pessoa(Localizacao.MARTE, 80);
		
		System.out.println(astronauta);
		System.out.println(civil);
		System.out.println(marciano);
	}
}
