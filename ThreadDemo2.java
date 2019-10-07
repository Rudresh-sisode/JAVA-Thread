class Table{
	synchronized public void printTable(int num){
		for(int i=0;i<10;i++){
			System.out.println(num+" "+i+"'s are"+(num*i));
		}
	}
}
class MyThread extends Thread{
	Table tRef;
	MyThread(Table t)
	{
		tRef=t;
	}
	@Override
	public void run(){
		tRef.printTable(5);
	}
}

class YourThread extends Thread{
	Table tRef;
	YourThread(Table t)
	{
		tRef=t;
	}
	@Override
	public void run(){
		tRef.printTable(8);
	}
}

public class ThreadDemo2
{
	public static void main(String... arvs)
	{
		Table tRef=new Table();
		
		
		MyThread mRef=new MyThread(tRef);
		
		mRef.start();
		YourThread yRef=new YourThread(tRef);
		yRef.start();
		
		
	}
}