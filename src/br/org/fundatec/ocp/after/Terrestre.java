package br.org.fundatec.ocp.after;

import br.org.fundatec.ocp.Localizacao;
import br.org.fundatec.ocp.before.Pessoa;

public class Terrestre extends Pessoa{

	public Terrestre(double massa) {
		super(Localizacao.TERRA, massa);
	}

	@Override
	public double getPeso() {
		return this.massa * 9.8;
	}
}
