//1.(L2)Write a program to illustrate creation of threads using runnable class.(start method start each of the newly created thread. Inside the run method there is sleep() for suspend the thread for 500 milliseconds).

class RunnableDemo1 implements Runnable
{
	public void run() //throws InterruptedException
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Number "+i);
			try{
				Thread.sleep(500);
			}
			catch(InterruptedException e){}
		}
	}
	public static void main(String args[])
	{
		Runnable r = new RunnableDemo1();
		Thread t = new Thread(r);
		t.run();
	}
}