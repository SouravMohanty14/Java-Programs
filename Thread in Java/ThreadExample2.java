//Creating a Thread by extending the Thread class
public class ThreadExample2 extends Thread
{
	public void run()
	{
		System.out.println("Run method called");
	}
	public static void main(String args[])
	{
		ThreadExample2 threadTwo = new ThreadExample2();
		threadTwo.start(); //Calls run method
		
	}
	

}
