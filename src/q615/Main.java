package q615;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	Score student1 = new Score();
    	Score student2 = new Score();
    	
    	student1.name = sc.next();
    	student1.Score1 = sc.nextInt();
    	student1.Score2 = sc.nextInt();
    	
    	student2.name = sc.next();
    	student2.Score1 = sc.nextInt();
    	student2.Score2 = sc.nextInt();
    	
    	System.out.println(student1.name+ " " + student1.Score1 + " " + student1.Score2);
       	System.out.println(student2.name+ " " + student2.Score1 + " " + student2.Score2);
    	int avg1 = (student1.Score1 + student2.Score1) / 2;
    	int avg2 = (student1.Score2 + student2.Score2) / 2;
    	System.out.print("avg " + avg1 + " " + avg2);
    	
    	
    	sc.close();
    }
    
}

