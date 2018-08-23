package IoStreams;
import java.io.*;

import collectionFramework.ArrayListExample;
class FileDemo 
{
    public static void main(String args[]) {
    	
    
        //this will close the resources automatically
        //even if an exception rises
        try (FileReader fr = new FileReader("C:/Users/Mahi Gani/Desktop/1.txt");
             FileWriter fw = new FileWriter("C:/Users/Mahi Gani/Desktop/2.txt");) {
            int c;
            while((c = fr.read())!=-1)
            {
              fw.write(c);  
            }
            System.out.println("data was transfered");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
