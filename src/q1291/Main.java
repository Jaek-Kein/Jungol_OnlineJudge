package q1291;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] range = new int[2];
		while (true) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			if (a<2 || a>9 || b<2 || b>9) System.out.println("INPUT ERROR!");
			else {
				range[0] = a; range[1] = b; break;
			}
		}
		timesTable(range);
	}
	
	public static void  timesTable(int[] n) {
		for (int i = 1 ; i < 10 ; i ++) {
			if ( n[0] < n[1]) {
				for (int j = n[0] ; j < n[1]+1 ; j++) {
					int answer = j*i;
					System.out.printf("%d * %d = %2d   ",j,i, answer);
				}	
			} else {
				for (int j = n[0] ; j > n[1]-1 ; j--) {
					int answer = j*i;
					System.out.printf("%d * %d = %2d   ",j,i, answer);
				}
			}
			System.out.print("\n");
		}
	}
}
