package com.Threading;
import java.util.concurrent.*;

public class ExecutorFramework {

	public static void main(String[] args) {
		ExecutorService executorservice=Executors.newFixedThreadPool(5);
		Runnable r=new Runnable() {
			
			@Override
			public void run() {
				
					for(int i=0;i<10;i++)
					{
						System.out.println("Ping");
					try
					{
						Thread.sleep(100);
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				
			}}
		};
		
	Runnable r2=new Runnable() {
			
			@Override
			public void run() {
				
					for(int i=0;i<10;i++)
					{
						System.out.println("\tPong");
					try
					{
						Thread.sleep(100);
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				
			}}
		};
		executorservice.execute(r);
		executorservice.execute(r2);
		executorservice.shutdown();

	}

}
