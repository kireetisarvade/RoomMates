package constructorPractice;

public class ConstructorEx 
{
	
	int i;
	String name;
	int age;
	
	public ConstructorEx(int i,String name)
	{
		this.i =i;
		this.name=name;
	}
	public ConstructorEx(int i,String name,int age)
	{
		this.i=i;
		this.name=name;
		this.age=age;
	}
	void disply()
	{
		System.out.println( i+"  "+ name+"  " +age);
	}
	public static void main(String[] args) 
	{

		ConstructorEx ce=new ConstructorEx(5, "mahesh");
		ConstructorEx ce1= new ConstructorEx(2, "ganesh", 23);
		ce.disply();
		ce1.disply();
	}

}
