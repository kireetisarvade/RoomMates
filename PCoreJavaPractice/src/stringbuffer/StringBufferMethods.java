package stringbuffer;

public class StringBufferMethods 
{
	public static void main(String arg[])
	{
		// append method
	/*StringBuffer sb=new StringBuffer("Hello ");  
	sb.append("Java");//now original string is changed  
	System.out.println(sb);//prints Hello Java  
	} */ 
	
	//String buffer insert method
/*	StringBuffer sb=new StringBuffer("Hello ");  
	sb.insert(1,"Java");//now original string is changed  
	System.out.println(sb);//prints HJavaello  
	}  */
   //Replace method
	/*	StringBuffer sb=new StringBuffer("Hello");  
		sb.replace(1,3,"Java");  
		System.out.println(sb);//prints HJavalo  
		}  
	*/
		//Delete method
		/*StringBuffer sb=new StringBuffer("Hello");  
		sb.delete(1,3);  
		System.out.println(sb);//prints Hlo  
		}*/  
	//Reverse Method
	/*StringBuffer sb=new StringBuffer("Hello");  
	sb.reverse();  
	System.out.println(sb);//prints olleH  
	*/
		//String buffer capacity
		{
		StringBuffer sb=new StringBuffer();  
		System.out.println(sb.capacity());//default 16  
		sb.append("Hello");  
		System.out.println(sb.capacity());//now 16  
		sb.append("java is my favourite language");  
		System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
		}  
	}  
		
		
		
		
		
		
}
