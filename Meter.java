import java.util.Scanner;
public class Meter{

public static void main(String[] args) {

	Scanner samscan = new Scanner(System.in);
	
	System.out.print("Enter value for feet: ");
	
	double feet = samscan.nextDouble();
	
	double meter = feet * 0.305;
	
	System.out.printf("The result is %.4f", meter);
	}
}
