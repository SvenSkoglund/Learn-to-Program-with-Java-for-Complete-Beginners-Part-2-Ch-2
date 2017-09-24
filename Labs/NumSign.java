/* Write a program that accepts a number as input and prints a message stating whether the number is
positive or negative. */

package Labs;

public class NumSign 
{
	public static void main (String [] Args)
	{ 
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		int num = 0;
		
		System.out.print("Please enter a number: ");
		num = scanner.nextInt();
		scanner.close();
		
		if (num >= 0)
			System.out.print("Your number is positive");
		else
			System.out.print("Your number is negative");
	}
}