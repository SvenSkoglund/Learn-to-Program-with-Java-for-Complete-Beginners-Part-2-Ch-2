/*Write a program that reads a single character 
of input, and uses if statements to determine whether
the character is a digit, a vowel, some other letter, 
or a non-alphanumeric character.*/
 
 package Labs;

public class CharClass
{
	public static void main (String [] Args)
	{ 
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		

		System.out.println();
		System.out.print("Please enter a single vowel, consonant, number, or symbol: ");
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
			System.out.println("You entered a symbol");
		}
	}
			

}