import java.util.Scanner;

public class Constructors {
	
	int x,a,b;
	int y;
	
	Constructors()
	{
		this(45,56);
		x=10;
		y=20;
		
	}
	Constructors(int x,int y)
	{
		//this();
		this.x=x;
		this.y=y;
		System.out.println("x::"+x);
		System.out.println("y::"+y);
		
	}

	public static void main(String[] args) {
		Constructors cont= new Constructors();
		/*Scanner sc = new Scanner(System.in);
		System.out.println("enter x value:");
		int x=sc.nextInt();
		System.out.println("enter y value");
		int y= sc.nextInt();
		Constructors cont1= new Constructors(x,y);*/
		System.out.println("x::::"+cont.x);
		System.out.println("y::::"+cont.y);
	}

}
