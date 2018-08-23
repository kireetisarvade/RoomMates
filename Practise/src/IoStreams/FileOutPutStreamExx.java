package IoStreams;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamExx 
{

	public static void main(String[] args)
	{
		try(FileOutputStream file= new FileOutputStream("C:/Users/Mahi Gani/Desktop/2.txt");)
		{
			System.out.println("file created");
			String message= "\n am good how r u";
			file.write(message.getBytes());
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
