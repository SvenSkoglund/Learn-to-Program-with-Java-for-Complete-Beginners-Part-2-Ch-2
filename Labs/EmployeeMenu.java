/*Starting here we introduce a program that you build a piece at a time, adding capabilities to the
program after each chapter as you learn more techniques of computer programming. You may not
have time to work on the project this week, in which case you can use it as a post-class project to
practice what you've learned after this class is over.

Write a program that displays a menu on the screen:

Read the option number, then display a message:*/
 
 package Labs;

public class EmployeeMenu
{
	public static void main (String [] Args)
	{ 
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		

		int op = 0;
		
		System.out.println();
		System.out.println("      Employee File           ");
		System.out.println("      _____________            ");
		System.out.println("Option   Description           ");
		System.out.println("______   ___________           ");
		System.out.println("0        Exit                  ");
		System.out.println("1        Enter a new employee  ");
		System.out.println("2        View existing employee");
		System.out.println("3        Delete an employee    ");
		System.out.println("4        List all employees    ");
		System.out.println();
		System.out.print("Please choose an Option: ");
		
		op = scanner.nextInt();
		System.out.println();
		
		
		switch (op)
		{
			case 0:
			System.out.println("You chose option 0 - Exit");
			break;
			
			case 1:
			System.out.println("You chose option 1 - Enter a new employee");
			break;
			
			case 2:
			System.out.println("You chose option 2 - View an existing employee");
			break;
			
			case 3:
			System.out.println("You chose option 3 - Delete an employee");
			break;

			case 4:
			System.out.println("You chose option 4 - List all employees");
			break;
			
			default:
			System.out.println("!! Invalid Entry !! \u0007");
		}
		scanner.close();
		
	}
}