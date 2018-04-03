package br.org.fundatec.ocp.after;

import br.org.fundatec.ocp.Localizacao;
import br.org.fundatec.ocp.before.Pessoa;

public class Ferrari extends Pessoa{

	public Ferrari(double massa) {
		super(Localizacao.MARTE, massa);
	}

	@Override
	public double getPeso() {
		return this.massa * 3.7;
	}
}
