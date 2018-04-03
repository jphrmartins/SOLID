package br.org.fundatec.srp;

import java.util.Scanner;

public class AppBefore {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre com dois número para realizar a soma");
		System.out.print("Num1: ");
		int numero1 = scanner.nextInt();
		System.out.print("Num2: ");
		int numero2 = scanner.nextInt();
		scanner.close();
		int result = numero1 + numero2;
		System.out.println("O resultado da soma é: " + result);
	}
}
