import java.util.Scanner;

public class AdditionOfDigits {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
	
		System.out.print("Enter a number between 0 and 1000:   ");
		int number = scan.nextInt();
		
		int separate = (number % 10) + ((number/10) % 10) + ((number/100) % 10) + ((number/1000) % 10);
			
		System.out.printf("The sum of the digits is: %d%n", separate);
		
	
	
	}
	
	
}
