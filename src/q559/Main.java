package q559;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] list = {0.0, 85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        double avg = (list[a] + list[b]);
        System.out.printf("%.1f", avg);
    }
}