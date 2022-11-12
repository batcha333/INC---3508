class Demo extends Thread 
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello ->"+i);
			try{Thread.sleep(2000);}catch(Exception e){}
		}
	}
}
public class ThreadDemo
{
	public static void main(String[] args)
	{
		Demo demo = new Demo(); 	
		demo.start();
		demo.isAlive(); 						//Alive or not(Boolean)
		try{demo.join();}catch(Exception e){};		//Wait until the thread finishes	
		
	}
}