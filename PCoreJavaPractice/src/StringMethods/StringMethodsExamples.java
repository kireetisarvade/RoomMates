package StringMethods;

import java.util.Scanner;

public class StringMethodsExamples 
{
	public void charat(String str)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("ENTER THE STRING");
	String st=sc.next();
	char ch=st.charAt(4);//returns the char value at the 4th index  
	System.out.println(ch);  
	}
	public void compareTo(String str)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE FiRST STRING:");
		String s1=sc.next();
		System.out.println("ENTER THE SECOND STRING:");
		String s2=sc.next();
		System.out.println("ENTER THE THIRD STRING:");
		String s3=sc.next();
		System.out.println("ENTER THE FOURTH STRING:");
		String s4=sc.next();
		System.out.println("ENTER THE FIFTH STRING:");
		String s5=sc.next();
		
		System.out.println(s1.compareTo(s2));//0 because both are equal  
		System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"  
		System.out.println(s1.compareTo(s4));//-1 because "l" is 1 times lower than "m"  
		System.out.println(s1.compareTo(s5));//2 because "h" is 2 times greater than "f"  
		}
	public void concat(String str)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE FiRST STRING:");
		String s1=sc.next();
		s1.concat("is immutable");  
		System.out.println(s1);  
		s1=s1.concat(" is immutable so assign it explicitly");  
		System.out.println(s1);  
	}
	public void contains(String str)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE Content STRING:");
		String s=sc.next();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("ENTER THE FiRST STRING:");
		String s2=sc.next();
		Scanner sc3 = new Scanner(System.in);
		System.out.println("ENTER THE Second STRING:");
		String s3=sc.next();
		Scanner sc4 = new Scanner(System.in);
		System.out.println("ENTER THE Third STRING:");
		String s4=sc.next();
		
		System.out.println(s.trim().contains(s2));  
		System.out.println(s.contains(s3));  
		System.out.println(s.contains(s4));  
	}
	public void endsWith(String str)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE  STRING:");
		String s=sc.next();
	    String ss=s.trim();
		Scanner scr = new Scanner(System.in);
		System.out.println("ENTER THE END WITH STRING:");
		String s1=sc.next();
		Scanner scrr = new Scanner(System.in);
		System.out.println("ENTER THE END WITH STRING:");
		String s2=sc.next();
		System.out.println(ss.endsWith(s1));  
		System.out.println(ss.endsWith(s2));  
	}
	public void equals(String str)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE Content STRING:");
		String s1=sc.next();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("ENTER THE FiRST STRING:");
		String s2=sc.next();
		Scanner sc3 = new Scanner(System.in);
		System.out.println("ENTER THE Second STRING:");
		String s3=sc.next();
		Scanner sc4 = new Scanner(System.in);
		System.out.println("ENTER THE Third STRING:");
		String s4=sc.next();
	 
		System.out.println(s1.equalsIgnoreCase(s2));//true because content and case is same  
		System.out.println(s1.equals(s3));//false because case is not same  
		System.out.println(s1.equals(s4));//false because content is not same  
	}
	public void equalsIgnoreCase(String str)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE Content STRING:");
		String s1=sc.next();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("ENTER THE FiRST STRING:");
		String s2=sc.next();
		Scanner sc3 = new Scanner(System.in);
		System.out.println("ENTER THE Second STRING:");
		String s3=sc.next();
		Scanner sc4 = new Scanner(System.in);
		System.out.println("ENTER THE Third STRING:");
		String s4=sc.next();
		System.out.println(s1.equalsIgnoreCase(s2));//true because content and case both are same  
		System.out.println(s1.equalsIgnoreCase(s3));//true because case is ignored  
		System.out.println(s1.equalsIgnoreCase(s4));//false because content is not same  
	}
	public void format(String str)
	{
		System.out.println("<=====THIS METHOD IS NOT IMPLEMENTED========>");
	}
	public void getBytes(String str)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE Content STRING:");
		String s1=sc.next();
		byte[] barr=s1.getBytes();  
		for(int i=0;i<barr.length;i++){  
		System.out.println(barr[i]);  
		}
	}
	public void getChars(String str)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE  STRING:");
		String s1=sc.next();
        char[] ch = new char[10];  
	    try
	   {  
	         s1.getChars(6, 14, ch, 0);  
	         System.out.println(ch);  
	   }
	    catch(Exception ex)
	      {
	    	  System.out.println(ex);
	      }  
	}
	public void indexOf(String str)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE Content STRING:");
		String s1=sc.next();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("ENTER THE FiRST INDEX:");
		String s2=sc.next();
		Scanner sc3 = new Scanner(System.in);
		System.out.println("ENTER THE Second INDEX:");
		String s3=sc.next();
		Scanner sc4 = new Scanner(System.in);
		System.out.println("ENTER THE Third INDEX:");
		String s4=sc.next();
		
		//String s1="this is index of example";  
		//passing substring  
		int index1=s1.indexOf(s2);//returns the index of is substring  
		int index2=s1.indexOf(s3);//returns the index of index substring  
		System.out.println(index1+"  "+index2);//2 8  
		  
		//passing substring with from index  
		int index3=s1.indexOf(s2,4);//returns the index of is substring after 4th index  
		System.out.println(index3);//5 i.e. the index of another is  
		  
		//passing char value  
		int index4=s1.indexOf(s4);//returns the index of s char value  
		System.out.println(index4);//3  
	}
	public void intern(String str)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE Content STRING:");
		String s1= new String(sc.next());
		Scanner sc2 = new Scanner(System.in);
		System.out.println("ENTER THE Second INDEX:");
		String s2=sc.next();
	   
		//String s1=new String("hello");  
		//String s2="hello";  
		String s3=s1.intern();//returns string from pool, now it will be same as s2  
		System.out.println(s1==s2);//false because reference is different  
		System.out.println(s2==s3);//true because reference is same  
	}
	public void isEmpty(String str)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=sc.next(); 
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the string");
		String s2=sc.next();  
		  
		System.out.println(s1.isEmpty());  
		System.out.println(s2.isEmpty());
	}
	public void join(String str)
	{
		System.out.println("under construction");
	}
	public void lastIndexOf(String str)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=sc.next(); 
		//there are 2 's' characters in this sentence  
		int index1=s1.lastIndexOf('s');//returns last index of 's' char value  
		System.out.println(index1);//6  
	}
	public void length(String str)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=sc.next(); 
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the string");
		String s2=sc.next();    
		System.out.println("string length is: "+s1.length());//10 is the length of javatpoint string  
		System.out.println("string length is: "+s2.length());//6 is the length of python string  
	}
	public void replace(String str)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE Content STRING:");
		String s1=sc.next();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("ENTER THE FiRST INDEX:");
		String s2=sc.next();
		Scanner sc3 = new Scanner(System.in);
		System.out.println("ENTER THE Second INDEX:");
		String s3=sc.next();
		//String s1="javatpoint is a very good website";  
		String replaceString=s1.replaceAll(s2,s3);//replaces all occurrences of "a" to "e"  
		System.out.println(replaceString);  
	}
	public void replaceAll(String str)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE Content STRING:");
		String s1=sc.next();
		String replaceString=s1.replaceAll("\\s","");  
		System.out.println(replaceString); 
	}
	public void split(String str)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE Content STRING:");
		String s1=sc.next();  
		String[] words=s1.split("\\s");//splits the string based on whitespace  
		//using java foreach loop to print elements of string array  
		for(String w:words)
		{  
		System.out.println(w);  
		}
	}
	public void startsWith(String str)
	{
		
	}
	public void substring(String str)
	{
		
	}
	public void toCharArray(String str)
	{
		
	}
	public void toLowerCase(String str)
	{
		
	}
	public void toUpperCase(String str)
	{
		
	}
	public void trim(String str)
	{
		
	}
	public void valueOf(String str)
	{
		
	}
	public static void main(String[] args)
	{
		StringMethodsExamples sme = new StringMethodsExamples();
		String str = null;
		Scanner scr = new Scanner(System.in);
		System.out.println
		("\n "+" 1 CharAt method" + 
	    "\n "+" 2  String compareTo()"+ 
	    "\n "+" 3 String concat()" + 
		"\n "+" 4 String contains()"+ 
	    "\n "+" 5 String endsWith()"+ 
		"\n "+" 6 String equals()"+ 
	    "\n "+" 7 equalsIgnoreCase()"+ 
		"\n "+" 8 String format()"+ 
	    "\n "+" 9 String getBytes()"+ 
		"\n "+" 10 String getChars()"+ 
	    "\n "+" 11 String indexOf()"+ 
		"\n "+" 12 String intern()"+ 
	    "\n "+" 13 String isEmpty()"+ 
		"\n "+" 14 String join()"+ 
	    "\n "+" 15 String lastIndexOf()"+
		"\n "+" 16 String length()"+ 
	    "\n "+" 17 String replace()"+ 
		"\n "+" 18 String replaceAll()"+ 
	    "\n "+" 19 String split()"+ 
		"\n "+" 20 String startsWith()"+ 
	    "\n "+" 21 String substring()"+
		"\n "+" 22 String toCharArray()"+ 
	    "\n "+" 23 String toLowerCase()"+ 
		"\n "+" 24 String toUpperCase()"+ 
	    "\n "+" 25 String trim()"+ 
		"\n "+" 26 String valueOf()"+
	    "\n"+" **********************************"+
		"\n"+"Choose the number:");
		int i = scr.nextInt();
		switch (i)
		{
		case 1:sme.charat(str);
		break;
		case 2:sme.compareTo(str);
		break;
		case 3:sme.concat(str);
			break;
		case 4:sme.contains(str);
			break;
		case 5:sme.endsWith(str);
			break;
		case 6:sme.equals(str);
			break;
		case 7:sme.equalsIgnoreCase(str);
			break;
		case 8:sme.format(str);
			break;
		case 9:sme.getBytes(str);
		    break;
		case 10:sme.getChars(str);
			break;
		case 11:sme.indexOf(str);
			break;
		case 12:sme.intern(str);
			break;
		case 13:sme.isEmpty(str);
		break;
		case 14:sme.join(str);
			break;
		case 15:sme.lastIndexOf(str);
			break;
		case 16:sme.length(str);
			break;
		case 17:sme.replace(str);
			break;
		case 18:sme.replaceAll(str);
			break;
		case 19:sme.split(str);
			break;
		case 20:
			break;
		case 21:
			break;
		case 22:
			break;
		case 23:
			break;
		case 24:
		break;
		case 25:
			break;
		case 26:
			break;
		default:
			break;
		}	
		

	}

}
