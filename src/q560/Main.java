package q560;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] strlist = scan.nextLine().split(" ");
        ArrayList<Integer> intlist = new ArrayList<>();
        for (String s : strlist) {
        	intlist.add(Integer.parseInt(s));
        }
        System.out.println(Collections.min(intlist));
   }
}