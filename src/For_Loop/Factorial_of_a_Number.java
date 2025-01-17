package For_Loop;

public class Factorial_of_a_Number 
{
	public static void main(String[] args) {
		 int number=3;
		 int factorial=1;
		 for(int i=1 ; i<=number;i++)
		 {
			 factorial*=i;
		 }
		 System.out.println(" Factorial of  "+number+" is "+factorial);
	}
}
