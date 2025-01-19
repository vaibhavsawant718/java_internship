package Switch_Case;

public class EXAMPLE4 
{
	public static void main(String[] args) 
	{
		
		String levelString="Expert";
		int level=0;
		switch (levelString) 
		{
		case "Beginer":level=1;
		break;
		case "Intermediate":level=2;
		break;
		case "Expert":level=3;
		break;
		case "pro":level=4;
		break;
		default:level=0;
		break;
		}
		System.out.println(level);
	}
}
