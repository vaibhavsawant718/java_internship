package IF_ELSE;

public class MenuIfElse {

	public static void main(String[] args) {
		System.out.println("....Menu....");
		System.out.println("....AreaofCircle....");
		System.out.println("....AreaofRecatngle....");
		System.out.println("....AreaofSquare....");
		
		int choice=3, radius=5 , lenght=2 , breadth=3 , side=8;
		
		if(choice==1)
		{
			double AreaofCircle=3.14*radius*radius;
			System.out.println("The Area of Circle is :" +AreaofCircle);
		}
		else if(choice==2)
		{
			int AreaofRecatngle=lenght*breadth;
			System.out.println("The Area of Rectangle is :" +AreaofRecatngle);
		}
		else if(choice==3)
		{
			int AreaofSquare=lenght*breadth;
			System.out.println("The Area of Square is :" +AreaofSquare);
		}
		else
		{
			System.out.println("Invalid Choice");
		}
	}
}
