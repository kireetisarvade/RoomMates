package IoStreams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutPutStreamEx
{

	public static void main(String[] args)
	{
		try(FileOutputStream fileoutputstream = new FileOutputStream("C:/Users/Mahi Gani/Desktop/1.txt");Scanner sc = new Scanner(System.in);)
		{
		System.out.println("enter the data into file");
		String string=sc.next();
		/*String message="\n hello how r u?";*/
		fileoutputstream.write(string.getBytes());
		System.out.println("file created");
	}
		catch(IOException e)
		{
			e.printStackTrace();
		}

}
}
