package RevisionPractice;

public class OveriddingEx extends Subclass 
{
	public void add()
	{
		int a =10;
		int b=20;
		
		System.out.println(a+b);
	}	
	public void main(String[] args)
	{
		OveriddingEx subclass = new OveriddingEx();
		subclass.add();
		subclass.add();
	}

}
