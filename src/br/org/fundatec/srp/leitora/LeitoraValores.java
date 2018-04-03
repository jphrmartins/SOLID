package br.org.fundatec.srp.leitora;

import java.util.Scanner;

public class LeitoraValores {
	private Scanner SCANNER = new Scanner(System.in);

	public int[] lerValores() {
		int[] valores = new int[2];
		System.out.println("Insira 2 valores para realizar a soma");
		System.out.print("Num 1: ");
		valores[0] = SCANNER.nextInt();
		System.out.print("Num 2: ");
		valores[1] = SCANNER.nextInt();
		return valores;
	}

}
