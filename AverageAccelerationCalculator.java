import java.util.Scanner;

public class AverageAccelerationCalculator {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
	
		System.out.print("Enter v0, v1, and t: ");
			double startingVelocity = scan.nextDouble();
			double endingVelocity = scan.nextDouble();
			double time = scan.nextDouble();
		
			double averageAcceleration = (endingVelocity - startingVelocity) / time;
		
			System.out.printf("The average acceleration  is %.4f%n", averageAcceleration);
		
	
	}
	
}
