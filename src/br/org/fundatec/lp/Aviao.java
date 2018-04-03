package br.org.fundatec.lp;

public class Aviao implements Veiculo{

	private Motor motor;

	public Aviao(Motor motor) {
		this.motor = motor;
	}

	public Motor getMotor() {
		return motor;
	}

	@Override
	public void liga() {
		System.out.println("VUUUUOOOOM");
	}

	@Override
	public void desliga() {
		System.out.println("MAYDAY MAYADAY ...---... ...---...");
	}

}
