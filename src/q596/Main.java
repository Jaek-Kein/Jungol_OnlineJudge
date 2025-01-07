package q596;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int i = sc.nextInt();
        int k = str.length()-1;
        for (int j = 0; j < i ; j++) {
        	if (j>k) break;
        	System.out.print(str.charAt(k-j));
        }
    }
}