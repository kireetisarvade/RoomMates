import java.io.ObjectInputStream;

public class RevisionPractice 
{
	public void add()
	{
		
	}
	public static void main(String[] args) throws ClassNotFoundException, CloneNotSupportedException 
	{
			// ways of creation object
		   // by using new keyword
		
			RevisionPractice rp = new RevisionPractice();
			rp.add();
			
			//by suing class.forname
			
			Class.forName("RevisionPractice");
			
			// by using clone 
			
			RevisionPractice obje = new RevisionPractice();
			RevisionPractice objee = (RevisionPractice)obje.clone();
			
			// de-serialization
			
			/*ObjectInputStream inStream = new ObjectInputStream("");
			RevisionPractice object = (RevisionPractice) inStream.readObject();*/		
	}

}
















