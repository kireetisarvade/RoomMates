package inheritencePractice;

class Animal
{
	void an()
	{
		System.out.println("Animal class");
	}
}
class Abc extends Animal
{
	void dg()
	{
		System.out.println("child class");
	}
}
class Cat extends Abc
{
	void small()
	{
		System.out.println("small clas");
	}
}
public class MultileveInEx 
{
	public static void main(String[] args)
	{
	 	Cat c = new Cat();
	 	c.an();
	 	c.dg();
	 	c.small();

	}

}
