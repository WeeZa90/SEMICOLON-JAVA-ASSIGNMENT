import java.util.Scanner

public Class MinutesToYearsDays{

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the number of minutes: ");
	
	double minutes = input.nextDouble();
	double minutesPerDay = 24 * 60;
	double minutesPerYear = minutesPerDay * 365;
	double years = minutes / minutesPerYear;
	double remainingMinutes = minutes % minutesPerYear;
	double days = remainingMinutes / minutesPerDay;
	
	System.out.println(minutes + " minutes is approximately " + years + " years and" + days + " + days.");
	input.close();
		}
}
