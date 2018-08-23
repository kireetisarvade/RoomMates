import java.util.Scanner;

public class MethodOverLoading 
{
	
	public void add(int a, int b)
	{		
		System.out.println(" :" + (a+b));
	}
	public void add(int a,int b,int c)
	{
		System.out.println("multpilication is:"+(a*b*c));
	}
	public void add(long e,long d)
	{
		System.out.println("sub is:" + (e-d));
	}
	public static void main(String[] args)
	{
		
		MethodOverLoading method = new MethodOverLoading();
		method.add(5, 8);
		method.add(2, 4, 6);
		method.add(2,10 );

	}

}
