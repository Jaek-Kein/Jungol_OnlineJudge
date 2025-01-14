package q111;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for (int i = 0 ; i < 4 ; i++){
            sum+= scan.nextInt();
        }
        System.out.println("sum " + sum);
        System.out.println("avg " + (sum / 4));
    }
}