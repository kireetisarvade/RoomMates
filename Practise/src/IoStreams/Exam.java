package IoStreams;

import java.io.File;

public class Exam {

	public static void main(String[] args)
	{
		File folder = new File("F:/FileEx");
		File[] listOfFiles = folder.listFiles();

		    for (int i = 0; i < listOfFiles.length; i++) {
		      if (listOfFiles[i].isFile()) {
		        System.out.println("Files are :\n  " + listOfFiles[i].getName());
		      } else if (listOfFiles[i].isDirectory()) {
		        System.out.println("Directories are:\n " + listOfFiles[i].getName());
		      }
		    }

	}

}
