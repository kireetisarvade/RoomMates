		class Adder
		{  
		static void add(int a,int b)
		{
		 System.out.println(a+b); 
			}  
		static void add(int a,int b,int c)
		{
			System.out.println(a+b+c); 
			}  
		static void adddd(long a ,long b)
		{
			
		}
		static float add(int a,int b ,int z,int E)
		{
		 return a+b; 
			} 
		}  
		class TestOverloading1
		{  
		public static void main(String[] args)
		{  
			Adder ader = new Adder();
			ader.add(11,1);
			float q=ader.add(12,21,21,21);
			ader.add(11,1,10);
			System.out.println(q);
			
			
		//System.out.println(Adder.add(11,11));  
		//System.out.println(Adder.add(11,11,11));  
		}}  
