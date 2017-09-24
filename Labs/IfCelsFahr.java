/* Write a program that accepts a number and a letter as input. The number is a temperature, and the
letter is an "F" or a "C" representing Fahrenheit or Celsius: */
 
 package Labs;

public class IfCelsFahr 
{
	public static void main (String [] Args)
	{ 
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		float temp = 0.0f;
		float conv = 0.0f;
		char fc = 'f';
		
		System.out.println();
		System.out.print("Please enter the temperature: ");
		temp = scanner.nextFloat();
		
		System.out.println();
		System.out.print("Please enter C for Celsius or F for Fahrenheit: ");
		fc = scanner.next().charAt(0);
		System.out.println();
		
		
		scanner.close();
		
		if ((fc == 'F') || (fc == 'f'))
		{
			conv = ((temp - 32) / ( 1.8f ));
			System.out.print( temp + " degrees Farenheit equals " 
			+ conv + " degrees Celcius");
			
		}
		else if (( fc == 'C') || ( fc == 'c'))
		{
			conv = (temp * ( 1.8f ) + 32);
			System.out.print( temp + " degrees Celsius equals " 
			+ conv + " degrees Farenheit");
		}
		else
			System.out.print("**Invalid Entry**");
	}
}