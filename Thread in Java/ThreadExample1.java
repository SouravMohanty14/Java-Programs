//Creating a Thread by implementing Runnable Interface
public class ThreadExample1 implements Runnable
{
	public void run () //Overriding run() of Runnable Interface
	{
		System.out.println("Run method called");
	}
	public static void main(String args[])
	{
		ThreadExample1 n = new ThreadExample1(); //Creating object of class ThreadExample1
		Thread threadOne = new Thread(n); //Creating object of thread class and passing object of ThreadExample1
		threadOne.start(); //Calls run method
	}
}