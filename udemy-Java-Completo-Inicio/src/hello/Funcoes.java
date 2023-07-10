package hello;

import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numeroDigitado = 0;

		for (int i = 1; i <= 3; i++) {

			System.out.print("Digite o " + i + "º número:");

			max(numeroDigitado = sc.nextInt());

		}

		System.out.println("O maior nº digitado foi: " + max(numeroDigitado));

		System.out.println("O maior nº digitado + 10 : " + (max(numeroDigitado) + 10));

		sc.close();
	}

	public static int max(int numeroDigitado) {

		int maiorNumero = 0;

		if (numeroDigitado > maiorNumero) {

			maiorNumero = numeroDigitado;
		}

		return maiorNumero;

	}

}
