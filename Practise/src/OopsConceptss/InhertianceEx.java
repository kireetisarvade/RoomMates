package OopsConceptss;

class calc {


		   int z;
			
		   public void addition(int x, int y) {
		      z = x + y;
		      System.out.println("The sum of the given numbers:"+z);
		   }
			
		   public void Subtraction(int x, int y) {
		      z = x - y;
		      System.out.println("The difference between the given numbers:"+z);
		   }
		}

		public class InhertianceEx extends calc {
		   public void multiplication(int x, int y) {
		      z = x * y;
		      System.out.println("The product of the given numbers:"+z);
		   }
			
		   public static void main(String args[]) {
		      int a = 20, b = 10;
//		      InhertianceEx demo = new InhertianceEx();
//		      demo.addition(a, b);
//		      demo.Subtraction(a, b);
//		      demo.multiplication(a, b);
		      calc calc1= new calc();
		      calc1.addition(a, b);
		      calc1.Subtraction(a, b);
		    		  
		   }
		}

