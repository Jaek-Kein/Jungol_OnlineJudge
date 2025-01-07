package q598;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		char chr;
		while (true) {
			str = sc.next();
			chr = str.charAt(0);
			if ( Character.isLetter(chr)) {
				System.out.println(chr);
			} else if (Character.isDigit(chr)) {
				System.out.println((int)chr);
			} else {
				break;
			}

		}
	}
}