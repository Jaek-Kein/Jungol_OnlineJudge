package q558;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = new int[100];
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (true) {
            int input = sc.nextInt();
            if (input == 0)
                break;
            list[i++] = input;
        }

        for (int j = 1; j <= list.length; j++) {
            if (list[list.length - j] == 0)
                continue;
            System.out.print(list[list.length - j] + " ");
        }
    }
}
