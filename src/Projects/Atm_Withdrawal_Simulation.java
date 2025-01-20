package Projects;
import java.util.Scanner;
public class Atm_Withdrawal_Simulation 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int balance=5000;
		
		while(balance>0)
		{
			System.out.println("Current Balance : " +balance);
			System.out.println("Enter the amount to withdrawal");
			int amount=scanner.nextInt();
			if(amount<=balance)
			{
				balance-=amount;
				System.out.println("transcation Succesful");
				
			}
			else
			{
				System.out.println("Insufficent balance");
			}
		}
		System.out.println("No Funds Avilable !");
		scanner.close();
	}
}
