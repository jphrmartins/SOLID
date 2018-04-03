package br.org.fundatec.ocp.after;

import br.org.fundatec.ocp.Localizacao;
import br.org.fundatec.ocp.before.Pessoa;

public class Astronauta extends Pessoa{

	public Astronauta(double massa) {
		super(Localizacao.ESPACO, massa);
	}
	
	@Override
	public double getPeso() {
		return this.massa * 0.0;
	}

}
