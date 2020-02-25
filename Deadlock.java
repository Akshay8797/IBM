package com.Threading;


public class Deadlock {

	public static void main(String[] args) {
	Deadlock d=new Deadlock();
	final A a = d.new A();
    final B b = d.new B();
	Runnable b1=new Runnable() {
		
		//Thread1
		@Override
		public void run() {
			synchronized (a) {
			System.out.println("GOT A'S LOCK");	
			try
			{
				System.out.println("Sleeping inside the mon itor");
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				synchronized (b) {
					System.out.println("Trying for block a");
				}
			}
			}
			
		}
	};
	
	
	//Thread2
	 Runnable b2 = new Runnable() {
			public void run() {
				synchronized (b) {
				System.out.println("GOT B'S LOCK");	
				try
				{
					System.out.println("Sleeping inside the mon itor");
					Thread.sleep(1000);
				}
				catch (InterruptedException e) {
					synchronized (a) {
						System.out.println("Trying for block a");
					}
				}
				}
				
			}
		};
		 new Thread(b1).start();
	        new Thread(b2).start();
	
	private class A
	{
		}
	private class B
	{
		
	}

}
}
