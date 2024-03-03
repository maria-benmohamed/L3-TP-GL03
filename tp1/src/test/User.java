package test;
import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		MethodsUnderTest test = new MethodsUnderTest();
		Scanner sc=new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		System.out.println(test.add(x, y));
	}

}
