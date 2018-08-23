package inheritencePractice;

class Animall
{
	void ani()
	{
		System.out.println("Main class");
	}
}
class Cow extends Animall
{
	void cow()
	{
		System.out.println("subclass");
	}
}
class Horse extends Animall
{
	void horse()
	{
		System.out.println("chil class");
	}
}
public class HybridExa
{
	public static void main(String[] args)
	{
		Horse hr = new Horse();
		hr.horse();
		hr.ani();
	}

}
