    package IoStreams;
	import java.io.FileInputStream;
    import java.io.FileOutputStream;
	import java.io.IOException;
	public class PractiseClassIoStreams 
	{
	 public static void main(String[] args) 
	 {  
	try(FileOutputStream fileOutputStream=new FileOutputStream("C:/Users/Mahi Gani/Desktop/DemoThree.txt");
			FileOutputStream fileOutputStream1=new FileOutputStream("C:/Users/Mahi Gani/Desktop/DemoFour.txt");)
	 {  
	  System.out.println("file created");
	  String message="\n java is platform independent";
	  String message1="\n java is programming language";
	  fileOutputStream.write(message.getBytes());
	  fileOutputStream1.write(message1.getBytes());
	 }
	 catch(IOException e)
	 {
	  e.printStackTrace();  
	 }   
	try(FileInputStream fileInputStream=new FileInputStream("C:/Users/Mahi Gani/Desktop/DemoThree.txt");
		FileOutputStream fileoutputstream = new FileOutputStream("C:/Users/Mahi Gani/Desktop/DemoFour.txt",true);)
	  {
	   int bdataa;
	   while((bdataa=fileInputStream.read())!=-1)
	   {
	    /*System.out.print((char)bdataa);*/
		   fileoutputstream.write(bdataa);
	   }
	   System.out.println("file copied");
	  }
	  catch(IOException e)
	  {
	   e.printStackTrace();   
	  }   
}
}
