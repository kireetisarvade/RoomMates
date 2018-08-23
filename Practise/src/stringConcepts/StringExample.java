package stringConcepts;

import java.util.Scanner;

public class StringExample
	{
		public void string(StringExample stringexample,Scanner sc)
		{
		   System.out.println("enter the string:");
		   String string=sc.next();	
		   String string1=string.concat(string);
		   System.out.println(string1);
		}
		public void stringBuilder(StringExample stringexample,Scanner sc)
		{
			System.out.println("enter the string:");
			String stringbuf=sc.next();
			StringBuffer stringbuffer = new StringBuffer(stringbuf);
			System.out.println("after string buffer operations \n *********************");
			//stringbuffer.append(stringbuffer);
			//System.out.println(stringbuffer+"\n");
			//stringbuffer.insert(0, stringbuffer);
			//System.out.println(stringbuffer);
			stringbuffer.delete(2,3);
			System.out.println(stringbuffer);
			stringbuffer.reverse();
			System.out.println(stringbuffer);
			

		}
		public void stringBuffer(StringExample stringexample,Scanner sc)
		{
			
			
			
			
			
		}
		public static void main(String[] args) 
		{
			
				StringExample stringexample= new StringExample();
				Scanner sc = new Scanner(System.in);
				int ch=sc.nextInt();
				do
				{
					System.out.println(" SELECT THE OPTIONS \n *********************************************************** \n "
							+ "1)String Example \n 2)String Builder  \n"+ ""
							+  "3)String Builder \n");
				ch= sc.nextInt();
						
				switch(ch)
				{
				case 1: stringexample.string(stringexample,sc);
				break;
				case 2: stringexample.stringBuilder(stringexample,sc);
				break;
				case 3:stringexample.stringBuffer(stringexample,sc); 
				break;
				case 4:
				default:System.out.println("invalid option");
				break;
	            }
				}
				while (ch!=4);
					sc.close();
				}
		}
	

					
				
				
		



