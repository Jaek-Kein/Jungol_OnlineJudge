package q555;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			String[] list = str.split(" ");
			
			for (int i = 0; i < list.length ; i++) {
				System.out.println(list[i]);
			}
			
			sc.close();
	}

}
