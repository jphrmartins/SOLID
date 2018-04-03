package br.org.fundatec.lp;

public class Carro implements Veiculo{

	private Motor motor;
	
	public Carro(Motor motor) {
		this.motor = motor;
	}

	public Motor getMotor() {
		return motor;
	}

	@Override
	public void liga() {
		System.out.println("Vruuum");
		
	}

	@Override
	public void desliga() {
		System.out.println("tsssssss");
	}

}
