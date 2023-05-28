import java.util.Scanner;

public class Arithmetic {

	public static void main (String[] args){
	
		Scanner keyboardScan = new Scanner(System.in);
		
		System.out.print("Enter a number:  ");
		int firstNumber = keyboardScan.nextInt();
		
		System.out.print("Enter another number:  ");
		int secondNumber = keyboardScan.nextInt();
		
		int firstNumberSquare;
		int secondNumberSquare;
		
		firstNumberSquare = firstNumber * firstNumber;
		secondNumberSquare = secondNumber * secondNumber;
		
		int sumOfSquare = secondNumberSquare + firstNumberSquare;
		int differenceOfSquare = firstNumberSquare - secondNumberSquare;
		
		System.out.printf("The first number squared is: %d%nThe second number squared is: %d. %n", firstNumberSquare, secondNumberSquare ); 
		System.out.printf("The sum of the square of the numbers is: %d.%nThe different of the Square is: %d%n", sumOfSquare, differenceOfSquare);
		
		
		
	}
	
}

