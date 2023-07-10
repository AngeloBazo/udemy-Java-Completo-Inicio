package hello;

import java.util.Scanner;

public class Exercicio03_Estrutura_Condicional {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int x, y;

		System.out.print("Digite um nº inteiro, positivo ou negativo:");

		x = teclado.nextInt();

		System.out.print("Digite outro nº inteiro, positivo ou negativo:");

		y = teclado.nextInt();

		if (x == 0 || y == 0) {
			System.out.println(
					"O número zero pertence ao conjunto dos inteiros e sabemos \nque qualquer número multiplicado por zero é igual a zero, \nou seja, o número zero é múltiplo de todo número inteiro.");
		}

		else if (x % y == 0 || y % x == 0) {
			System.out.println(x + " e " + y + ": São multiplos");

		} else {
			System.out.println(x + " e " + y + ": Não são multiplos");

		}

	}

}
