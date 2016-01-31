import java.util.Scanner;
public class Namee {
	public static void main(String [] args) {
		System.out.println("Enter your username");
		Scanner keyboard = new Scanner(System.in);
		String username=keyboard.next();
		System.out.println("Please enter your password.");
		String password=keyboard.next();
		System.out.println("Hello "+username+" ,and your password is "+ password);
	}
}