package multithreadingpractice;

public class ThreadclassExm extends Thread{  
public void run(){  
System.out.println("thread is running...");  
}  
public static void main(String args[]){  
ThreadclassExm t1=new ThreadclassExm();  
t1.start();  
 }  
}  