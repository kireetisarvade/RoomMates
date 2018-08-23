package exceptionHandling;

import java.util.Scanner;

class MyExceptions extends Exception
{
	String message;
	
	public MyExceptions()
	{
	message=" Exception Occured";
	}
	public MyExceptions(String message)
	{
		this.message=message;
	}
	public String getMessage()
	{
		return message;		
    }
}
public class UserdefinedEx 
{
	 static void check(int num1,int num2) throws MyExceptions
	 {
		 if ((num1/num2)!=0)
      {
			 
      }
	 } 
	 public static void main(String[] args) 
	 {  
		 Scanner sc= new Scanner(System.in);
		 System.out.println("enter the number :");
		 int num1=sc.nextInt();
		 System.out.println("enter the number :");
		 int num2=sc.nextInt();	
		 /*
		 System.out.println("enter the array size: ");
		 int num3= sc.nextInt();
		 */
		 
		 try {
			check(num1,num2);
	 } catch (MyExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
}
