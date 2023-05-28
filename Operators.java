public class Operators{

	public static void main(String[] args){
	
	double numberOne = 20.00;
	double numberTwo = 80.00;
	
	double addAndMultiply = (numberOne + numberTwo) * 100.00;
	double divide = addAndMultiply % 40.00;
	System.out.print("The value total is: " + addAndMuiltiply);
	boolean remainder = divide == 0 ? true : false;
	
	System.out.println(remainder);
	
	if (remainder != true){
		System.out.println("Got some Remainder");
	}
	
	}


}
