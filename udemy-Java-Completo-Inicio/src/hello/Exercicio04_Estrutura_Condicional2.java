package hello;

import java.util.Scanner;

public class Exercicio04_Estrutura_Condicional2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int x, y, z = 0;

		System.out.print("Digite a hora inicial:");

		x = teclado.nextInt();

		System.out.print("Digite a hora final:");

		y = teclado.nextInt();

		if (x > y) {

			z = (24 - x) + y;

		} else if (x == y) {
			
			z = 24;
			
		} else {
			
			z = y - x;
			
		}

		System.out.println("O jogo começou às " + x + " horas");
		System.out.println("Terminou às " + y + " horas");
		System.out.println("Tendo durando " + z + " horas");

	}

}
