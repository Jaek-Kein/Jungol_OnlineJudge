package q1303;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int a = 1;
        Scanner scan = new Scanner(System.in);
        int y = scan.nextInt();
        int x = scan.nextInt();
        for (int i = 0; i < y ; i++){
            for (int j = 0; j < x ; j++){
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }
}