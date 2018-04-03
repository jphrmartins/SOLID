package br.org.fundatec.ocp.before;

import br.org.fundatec.ocp.Localizacao;

public /*abstract*/ class Pessoa {
	
	private Localizacao localizacao;
	protected double massa;

	public Pessoa(Localizacao localizacao, double massa) {
		this.localizacao = localizacao;
		this.massa = massa;
	}

	public double getPeso() {
		if(localizacao == Localizacao.ESPACO) {
			return 0.0;
		} else if(localizacao == Localizacao.MARTE) {
			return massa * 3.7;
		} else {
			return massa * 9.8;
		}
	}
	
	@Override
	public String toString() {
		return localizacao.name() + " Peso: " + getPeso() + " Newtons"; 
	}
//gravidade jupter == 24.8
}
