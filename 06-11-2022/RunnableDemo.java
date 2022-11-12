//class Demo implements Runnable									//Normal Approach
//{
//	public void run()
//	{
//		for(int i=1;i<=10;i++)
//		{
//			System.out.println("normal Task :"+i);
//			try{Thread.sleep(2000);}catch(Exception e){}
//		}
//	}
//}
public class RunnableDemo
{
	public static void main(String args[])
	{
		//Demo demo = new Demo();								//Normal Approach							
		//Runnable demo = new Demo()								//Anonymous class Approach
		//{
		//	public void run()
		//	{
		//		for(int i=1;i<=10;i++)
		//		{
		//			System.out.println("anonymous Task :"+i);
		//			try{Thread.sleep(2000);}catch(Exception e){}
		//		}
		//	}
		//};
		Runnable demo = ()->										//Lambda expression Approach
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println("lambda Task :"+i);
				try{Thread.sleep(2000);}catch(Exception e){}
			}
		};
		Thread t = new Thread(demo);			
		t.run();
	}
}
