package q616;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	Triangle triangle = new Triangle();
    	
    	triangle.setCoordinate(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
    	
    	triangle.printCenter();
    }

}
