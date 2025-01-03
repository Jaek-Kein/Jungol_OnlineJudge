package q599;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String a = sc.nextLine();
			String b = a.replaceAll("[^0-9]", "");
			int c = Integer.parseInt(b);
			System.out.print("ASCII code =? ");
			if (c < 33 || c > 127) break;
			System.out.println((char)c);
		}
	}
}
