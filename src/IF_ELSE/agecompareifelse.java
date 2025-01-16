package IF_ELSE;
//logical operator 
public class agecompareifelse {

	public static void main(String[] args) {
		int age=150;
		//age must valid for vote is 18to80
		if(age>18 && age<80)
		{
			System.out.println("valid for vote....");
		}
		else if(age>0 && age <17)
		{
			System.out.println("Invalid for vote....");
		}
		else
		{
			System.out.println("Person dose not Exist");
		}
		
		
	}
}
