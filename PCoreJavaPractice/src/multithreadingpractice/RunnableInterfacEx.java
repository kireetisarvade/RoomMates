package multithreadingpractice;

public class RunnableInterfacEx implements Runnable 
{
	public void run(){  
		System.out.println("thread is running...");  
		}  
		  
		public static void main(String args[]){  
			RunnableInterfacEx m1=new RunnableInterfacEx();  
		    Thread t1 =new Thread(m1);
		    /***If you are not extending the Thread class,your class object 
		     * would not be treated as a thread object.So you need to explicitely create 
		     * Thread class object.We are passing the object of your class that implements
		     *  Runnable so that your class run() method may execute.
		     */
		    t1.start();  
		 }  
}
