
public class StringExample {

	public static void main(String[] args) 
	{
		/*StringBuilder s1= new StringBuilder("Hello GoodMorning");
		StringBuilder s11 = new StringBuilder("Hello good");
		System.out.println(s11.equals(s11));*/
		String s1= new String("Hello");
		String s2 = new String("Hello");
		String s3=s1.concat("Good Morning");
		System.out.println(s1.equals(s2)+"\t"+s3);
	}
}
