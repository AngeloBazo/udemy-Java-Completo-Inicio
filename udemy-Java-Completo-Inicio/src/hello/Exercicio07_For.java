package hello;

import java.util.Scanner;

public class Exercicio07_For {

	public static void main(String[] args) {

		int n, nAoQuadrado, nAoCubo;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um nº inteiro positivo:");

		n = sc.nextInt();

		System.out.println();

		for (int i = 1; i <= n; i++) {

			System.out.println(i + " " + (int) Math.pow(i, 2) + " " + (int)Math.pow(i, 3));
			
		}

	}

}
