package RevisionPractice;

public class ObjectCreation 
{
	public void add()
	{
		
	}
	public static void main(String[] args) throws ClassNotFoundException, CloneNotSupportedException 
	{
			// ways of creation object
		   // by using new keyword
		
		ObjectCreation rp = new ObjectCreation();
			rp.add();
			
			//by suing class.forname
			
			Class.forName("RevisionPractice");
			
			// by using clone 
			
			ObjectCreation obje = new ObjectCreation();
			ObjectCreation objee = (ObjectCreation)obje.clone();
			
			// de-serialization
			
			/*ObjectInputStream inStream = new ObjectInputStream("");
			RevisionPractice object = (RevisionPractice) inStream.readObject();*/	
			
			
			
			
			
	}

}

















