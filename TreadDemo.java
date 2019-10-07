class Mytask extends Thread
{
	@Override
	public void run()
	{
		System.out.println("State of myTask 2 "+Thread.currentThread().getState());
		for(int i=0;i<10;i++)
		{
			try
			{
				Thread.sleep(1000);//1000 mili sec -> 1 sec
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage()+" is your exceptoin boss");
			}
			
			System.out.println("##Mytask##");
			
		}
		
	}
}
class A{
	
}

class YourTask extends A implements Runnable{
	public void run(){
		for(int i=0;i<5;i++)
		{
			try
			{
				Thread.sleep(1000);//1000 mili sec -> 1 sec
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage()+" is your exceptoin boss");
			}
			System.out.println("$$$YourTask$$$");
		}
	}
}

public class TreadDemo
{
	public static void main(String... arvs)
	{
		System.out.println("Main Thread");
		
		
		Mytask mref=new Mytask();
		
		Runnable r=new YourTask();//polimorphic statment
		Thread yRef=new Thread(r);
		
		
		mref.setPriority(Thread.MAX_PRIORITY);
		yRef.setPriority(Thread.MIN_PRIORITY);
		Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
		
		mref.setName("myThread");
		yRef.setName("YourThread");
		Thread.currentThread().setName("main thread");
		
		System.out.println("State of myTask 1 "+mref.getState());
		
		
		
		mref.start();
		
		
		
		yRef.start();
		
		for(int i=23;i<50;i++)
		{
			try
			{
				Thread.sleep(1000);//1000 mili sec -> 1 sec
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage()+" is your exceptoin boss");
			}
			System.out.println("Main Threfad "+i);
		}
		
		System.out.println("MyTask name "+mref.getName()+"Priority "+mref.getPriority());
		System.out.println("YourTask name"+yRef.getName()+" Priority "+yRef.getPriority());
		System.out.println("main Thread"+Thread.currentThread().getName()+" priority "+Thread.currentThread().getPriority());
		
		System.out.println("State of myTask 3 "+mref.getState());
	}
}













