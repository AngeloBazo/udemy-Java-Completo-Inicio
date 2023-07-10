package hello;

public class String_Ferramentas {

	public static void main(String[] args) {

		String original = "abcde FGHIJ ABC abc DEFG  ";

		System.out.println(original);

		String s01 = original.toLowerCase();
		System.out.println(s01);

		String s02 = original.toUpperCase();
		System.out.println(s02);

		String s03 = original.trim();
		System.out.println(s03);

		String s04 = original.substring(2);
		System.out.println(s04);

		String s05 = original.substring(5, 12);
		System.out.println(s05);

		String s06 = original.replace('c', 'x');
		System.out.println(s06);

		String s07 = original.replace("abcde", "ANGELO");
		System.out.println(s07);

		int s08 = original.indexOf("bc");
		System.out.println(s08);

		int s09 = original.lastIndexOf("bc");
		System.out.println(s09);

		String s = "potato apple lemon";

		String[] vect = s.split(" ");

		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];

		for (String vetor : vect) {

			System.out.println(vetor);
		}

		System.out.println(word3);
		
		
	}

}
