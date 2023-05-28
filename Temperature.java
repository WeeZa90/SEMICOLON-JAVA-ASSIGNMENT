import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
	Scanner brucescan = new  Scanner(System.in);
	
	System.out.print("Enter the amount of water in kg: ");
	
	double amountOfWater = brucescan.nextDouble();

	System.out.print("Enter the initial temperature: ");
	
	double initialTemperature = brucescan.nextDouble();
	
	System.out.print("Enter the final temperature: ");
	
	double finalTemperature = brucescan.nextDouble();
	
	double energy = amountOfWater *(finalTemperature - initialTemperature)* 4184;
	
	System.out.printf("The energy needed is %.1f%n", energy);
	}
}
