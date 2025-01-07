package q519;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 100 + sc.nextInt();
        int b = sc.nextInt()%10;
        System.out.println(a + " " + b);
    }
}