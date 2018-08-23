package exceptionsEx;

public class ExceptionPropgation
{  
	  void m(){  
	    int data=50/0;  
	  }  
	  void n(){  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handled");}  
	  }  
	  public static void main(String args[]){  
		  ExceptionPropgation obj=new ExceptionPropgation();  
	   obj.p();  
	   System.out.println("normal flow...");  
	  }  
	}  