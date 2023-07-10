package hello;

public class OpBitwise {

	public static void main(String[] args) {

		int n1 = 89;
		int n2 = 60;

		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);

		System.out.println(Integer.toBinaryString(n1));
		System.out.println(Integer.toBinaryString(n2));

		System.out.println(Integer.toBinaryString(n1 + n2));

	}

}
