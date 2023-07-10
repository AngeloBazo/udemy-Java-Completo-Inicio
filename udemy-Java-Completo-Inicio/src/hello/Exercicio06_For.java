package hello;

import java.util.Scanner;

public class Exercicio06_For {

	public static void main(String[] args) {

		int n;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um nº inteiro positivo:");

		n = sc.nextInt();

		System.out.println();

		for (int i = 1; i <= n; i++) {

			if ((n % i) == 0) {

				System.out.println(i);

			}

		}

	}
}
