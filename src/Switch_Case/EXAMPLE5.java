package Switch_Case;
//Java Program to demonstrate the use of Wrapper class  
//in switch statement  
public class EXAMPLE5 {
	public static void main(String[] args) 
	{
		int age=18;
		switch(age)
		{
		case(16):System.out.println("Under 18");
		break;
		case(18):System.out.println("Eligible for Vote");
		break;
		case(65):System.out.println("Cinear Citizine");
		break;
		default:System.out.println("Enter correct age");
		}
	}
}
