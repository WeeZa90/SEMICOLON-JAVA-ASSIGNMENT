import java.util.Scanner
public class BodyMassIdex {

	public static void main(String[] args);
	
	Scanner man = new Scanner(system.in)
	
	System.out.println("enter your weight in pound");
	
	double weight = man.nextDouble();
	
	System.out.print("enter your height in inches");
		
		double height = man.nextDouble();
		double bodyMassIndex = (weight * 0.45359237)/ (height * 0.0254) * (height * 0.0254);
	
	System.out.printf("BMI is %f%n" bodyMassIndex);
	
	}
}
