package gitTest;

public class PalindromeORNot {

	public static void main(String[] args) {

		String str = "MANAM";

		String newStr = "";

		int strLength = str.length();

		for (int i = strLength - 1; i >= 0; i--)

		{
			newStr = newStr + str.charAt(i);
		}
		System.out.println("OLD STRING:" + str);
		System.out.println("Reversed STRING:" + newStr);

		// Validate 2 strings
		if (str.toLowerCase().equals(newStr.toLowerCase())) {
			System.out.println("Given String is Palindrome");
		} else {
			System.out.println("Given String is not a Palindrome");
		}

	}

}
