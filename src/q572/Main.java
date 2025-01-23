package q572;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.printf("%.2f", calc(scan.nextInt()));
    }
    public static double calc(int rad){
        double space;
        space = rad * rad * 3.14;
        return space;
    }
}

