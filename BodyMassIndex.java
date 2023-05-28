import java.util.Scanner;

public class BodyMassIndex{
	
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Enter your Weight (in Pounds) :  ");
	float weight = scan.nextInt();
	
	System.out.print("Enter your Height (in inches):  ");
	float height = scan.nextInt();
	
	float bodyMassIndex =  (weight * 703)/(height * height);
	System.out.println("From the National Heart Lung and Blood Institute");
	System.out.printf("Your Body Mass Index, BMI = %.2f%n", bodyMassIndex);


	System.out.println("BMI Categories:\r\n" + "Underweight =< 18.5\r\n" + "Normal weight = 18.5–24.9\r\n" + "Overweight = 25–29.9\r\n" + "Obesity = BMI of 30 or greater");
	}
}
