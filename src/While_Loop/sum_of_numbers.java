package While_Loop;

public class sum_of_numbers {
	public static void main(String[] args) 
	{
		int number=1;
		int sum=0;
		while(number<=2)
		{
			sum+=number;
			number++;
		}
		System.out.println("The Sum is : "+sum);
	}
}
