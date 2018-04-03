package br.org.fundatec.ocp;

import br.org.fundatec.ocp.after.Astronauta;
import br.org.fundatec.ocp.after.Ferrari;
import br.org.fundatec.ocp.after.Terrestre;
import br.org.fundatec.ocp.before.Pessoa;

public class AppAfter {

	public static void main(String[] args) {
		Pessoa terreste = new Terrestre(80);
		Pessoa astronauta = new Astronauta(80);
		Pessoa marciano = new Ferrari(80);
		
		System.out.println(terreste);
		System.out.println(astronauta);
		System.out.println(marciano);
	}
}
