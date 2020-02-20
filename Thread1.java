package com.Threading;

public class Thread1 extends Thread {
	
	public Thread1(String threadName)
	{
		super.setName(threadName);
	super.start();
	}

	public static void main(String[] args) {
		new Thread1("Ping");
		new Thread1("Pong");
			//Thread1 t=new Thread1();
	}

	@Override
	public void run() {
		Thread currentThread=Thread.currentThread();
		if(currentThread.getName().equals("Ping"))
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("Ping");
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
	}

}
}
