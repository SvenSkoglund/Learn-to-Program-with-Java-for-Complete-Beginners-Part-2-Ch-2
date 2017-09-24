/* Modify your solution to Question 1 so that if zero is entered, it prints a message saying so.
 */

package Labs;

public class NumSignZero 
{
	public static void main (String [] Args)
	{ 
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		int num = 0;
		
		System.out.print("Please enter a number: ");
		num = scanner.nextInt();
		scanner.close();
		
		if (num > 0)
			System.out.print("Your number is positive");
		else if ( num == 0)
			System.out.print("Your number equals zero");
		else
			System.out.print("Your number is negative");
	}
}