package IF_ELSE;

public class Nested_if_statment 
{
	public static void main(String[] args) 
	{
		int age=26;
		int weight=71;
		if(age>20)
		{
			if(weight>=80)
			{
				System.out.println("You are Eligible for the Blood Donate");
			}
			else {
				System.out.println("Not Eligible");
			}
		}
		else {
			System.out.println("Age Should Be Less");
		}
	}
}
