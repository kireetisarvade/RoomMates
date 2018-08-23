package inheritencePractice;

	class Aanimal
	{  
		void eat()
		{
			System.out.println("eating...");
		}  
		}  
		class DDog extends Aanimal
		{  
		void bark()
		{
			System.out.println("barking...");
		}  
		}  
		public class SingleinheritanceEx{  
		public static void main(String args[]){  
		DDog d=new DDog();  
		d.bark();  
		d.eat();  
}
		}
