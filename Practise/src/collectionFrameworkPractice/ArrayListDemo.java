package collectionFrameworkPractice;
 import java.util.ArrayList;
import java.util.Collections;
public class ArrayListDemo {

	   public static void main(String args[]) {
	      // create an array list
	      ArrayList<String> al = new ArrayList<String>();
	      System.out.println("Initial size of al: " + al.size());

	      // add elements to the array list
	      al.add("C");
	      al.add("A");
	      al.add("E");
	      al.add("B");
	      al.add("D");
	      al.add("F");
	      al.add("E");
	    
	      for (int i = 0; i <al.size(); i++) 
	      {
				  	String data=al.get(i);
	    	  	System.out.println(data);
	      }      
	      
	      System.out.println("Initial size of al: " + al.size());
	      
	      al.add(1, "A2");
	      System.out.println(al);
	      System.out.println("Initial size of al: " + al.size());
	      
	      al.set(1, "A22");
	      System.out.println(al);
	      System.out.println("Initial size of al: " + al.size());
	      al.remove(1);
	      System.out.println(al);
	      System.out.println("Initial size of al: " + al.size());
	      
	      
	      for(String  value:al)
	      {
	    	  	System.out.println(value);
	    	  
	      }
	      Collections.sort(al);
	      System.out.println(al);
	      
	      
	    
	   }
	}