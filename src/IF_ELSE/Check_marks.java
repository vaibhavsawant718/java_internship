package IF_ELSE;

public class Check_marks 
{
	public static void main(String[] args) 
	{
		int marks=83;
		if(marks<60)
		{
			System.out.println("Fail");
		}
		else if(marks>=60 && marks<70)
		{
			System.out.println("Grade C");
		}else if(marks>=70 && marks<80)
		{
			System.out.println("Grade B");
		}else if(marks>=80 && marks<90)
		{
			System.out.println("Grade A");
		}else if(marks>=90 && marks<100)
		{
			System.out.println("Grade A+");
		}else
		{
			System.out.println("plz Enter Correct Marks");
		}
		
	}
}
