//Running multiple threads based on their priority
public class ThreadPriority implements Runnable
{
	public void run()
	{
		Thread thread = Thread.currentThread(); //A static method that returns currently executing thread
		System.out.println("Currently executing thread : "+thread.getName());
	}
	public static void main(String args[])
	{
		ThreadPriority p1 = new ThreadPriority();
		ThreadPriority p2 = new ThreadPriority();
		ThreadPriority p3 = new ThreadPriority();
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		Thread t3 = new Thread(p3);
		t1.setName("First thread");
		t2.setName("Second thread");
		t3.setName("Third thread");
		t1.setPriority(6);
		t2.setPriority(4);
		t3.setPriority(10);
		t1.start();
		t2.start();
		t3.start();
		
	}
	

}
