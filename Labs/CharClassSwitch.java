/*Modify your solution so that it uses a switch statement rather than if statements. Have it
determine only whether the character input is a digit, a vowel, or something other than a digit or a
vowel.*/
 
 package Labs;

public class CharClassSwitch
{
	public static void main (String [] Args)
	{ 
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		

		System.out.println();
		System.out.print("Please enter a single vowel or number: ");
		String s = scanner.next();
		char c = s.charAt(0);
		
		
		scanner.close();
		

		switch (c)
		{
			case 'a': case 'e': case 'i': case 'o': case 'u':
			System.out.println("You entered a vowel");
			break;

			case '1': case '2': case '3': case '4': case '5':
			case '6': case '7': case '8': case '9': case '0':
			System.out.println("You entered a number");
			break;
			
			default:
			System.out.println();
			System.out.println("You entered something other than a vowel or number");
		}
	}
}