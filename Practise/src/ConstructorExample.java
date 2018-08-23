
public class ConstructorExample {
		
		int x,y,z;
	
		ConstructorExample(int x,int y)
		{
			this.x=x;
			this.y=y;
		}
		ConstructorExample(int x,int y,int z)
		{
			//this();
			this.z=z;
			System.out.println("x::"+x);
			System.out.println("y::"+y);
		}
		public static void main(String[] args) {
			ConstructorExample cont= new ConstructorExample(10,20,30);
			//int z=50;
		
			System.out.println("z:::::"+cont.z);
		}

	}


