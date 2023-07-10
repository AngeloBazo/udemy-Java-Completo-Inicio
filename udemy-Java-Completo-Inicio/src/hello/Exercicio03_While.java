package hello;

import java.util.Scanner;

public class Exercicio03_While {

	public static void main(String[] args) {

		int codDigitado = 0;
		int qtdAlcool = 0;
		int qtdGasolina = 0;
		int qtdDiesel = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("1) Álcool\n2) Gasolina\n3) Diesel\n4) Fim");

		while (codDigitado != 4) {

			System.out.print("Digite o cód do combustível abastecido:");

			codDigitado = sc.nextInt();

			switch (codDigitado) {
			case 1: {
				qtdAlcool += 1;
				break;
			}
			case 2: {
				qtdGasolina += 1;
				break;
			}
			case 3: {
				qtdDiesel += 1;
				break;
			}
			case 4: {
				System.out.println("Muito obrigado!");
				break;
			}

			default:
				System.out.println("Código inexistente - digite novamente\n");

			}

		}

		System.out.println("Álcool: " + qtdAlcool);
		System.out.println("Gasolina: " + qtdGasolina);
		System.out.println("Diesel: " + qtdDiesel);
	}
}
