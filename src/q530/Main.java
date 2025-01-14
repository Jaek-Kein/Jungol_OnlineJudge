package q530;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n<20) {
            System.out.println((20-n) + " years later");
        } else {
            System.out.println("adult");
        }
    }
}