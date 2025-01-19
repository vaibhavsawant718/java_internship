package Switch_Case;
import java.util.Scanner;
public class EXAMPLE6 
{

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Select An Option");
		System.out.println("1:Print a Message");
		System.out.println("2:Perform a calculation");
		System.out.println("3.Exit");
		
		int choice=scanner.nextInt();
		switch(choice)
		{
		case 1:
		{
			System.out.println("You Selected a Print Message");
			System.out.println("Enter The Message");
			scanner.nextLine();
			String Message=scanner.nextLine();
			System.out.println("Message :"+Message);
			break;
		}
		case 2:
		{
			System.out.println("You Selected Perform a calculation");
			System.out.println("Enter the value");
			int num1=scanner.nextInt();
			int num2=scanner.nextInt();
			int num3=num1*num2;
			System.out.println(num3);
			break;
		}
		case 3:
		{
			System.out.println("You Selected Exit Option");
			break;
			
		}
		default:System.out.println("Plz Select Correct Option");
		}
		scanner.close();
		
	}
	
}
