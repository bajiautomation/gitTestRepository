package gitTest;

public class ReverseEachWord {

	public static void main(String[] args) {

		String str1 = "MANAM BAJI BABU";
		System.out.println("Given String:" + str1);
		String[] strWords = str1.split(" ");
		System.out.println("Word Length:" + strWords.length);

		/*
		 * for (int i = 0; i < strWords.length; i++) {
		 * System.out.println(strReverse(strWords[i]));
		 * 
		 * }
		 * 
		 * 
		 * dgdsgdsgdsgsd
		 */

		for (int k = 0; k < strWords.length; k++) {
			System.out.println(strReverseOLD(strWords[k]));
		}

	}

	// ONE METHOD
	public static String strReverse(String str1) {
		StringBuffer sfr = new StringBuffer(str1);
		System.out.println();
		System.out.println(sfr);
		return sfr.reverse().toString();
	}

	// SECOND METHOD
	public static String strReverseOLD(String str1) {
		String str2 = "";
		for (int j = str1.length(); j > 0; j--) {
			str2 = str2 + str1.charAt(j - 1);
		}
		return str2;
	}

}
