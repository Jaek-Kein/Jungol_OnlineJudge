package q613;
import java.util.Scanner;

class Info {
String Name;
String School;
int Grade;
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Info info;
		info = new Info();
		info.Name = sc.next();
		info.School = sc.next();
		info.Grade = sc.nextInt();
		
		System.out.println("Name : " + info.Name);
		System.out.println("School : " + info.School);
		System.out.println("Grade : " + info.Grade);
		sc.close();
	}

}
