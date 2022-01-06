package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// ArmstrongNumber
		
		int input = 153;//(1*1*1)+(5*5*5)+(3*3*3)
		int calculated = 0;
		int remainder;
		int original;
		
		original = input;
		
		while(input>0)
		{
			remainder = input % 10;
			calculated= calculated + (remainder*remainder*remainder);
			
			input = input / 10;
		}
		System.out.println(calculated);
		
		if(calculated == original)
		{System.out.println("ArmstrongNumber");}
		else
		{System.out.println("Not armstrong");}
		
	}
	

}
