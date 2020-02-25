package com.Threading;

public class GroupThread implements Runnable {
	Thread t1,t2,t3;
	public GroupThread() {
		// TODO Auto-generated constructor stub
	
	
		t1=new Thread(this);
		t2=new Thread(this);
		t3=new Thread(this);
		t1.setName("Ping");
		t2.setName("Pong");
		t3.setName("Tong");
		t1.start();
		t2.start();
		t3.start();
	}

	public static void main(String[] args) {
		new GroupThread();
		GroupThread runnable = new GroupThread();  
        ThreadGroup tg1 = new ThreadGroup("Group 1");  
          
        Thread t1 = new Thread(tg1, runnable,"one");  
        t1.start();  
        Thread t2 = new Thread(tg1, runnable,"two");  
        t2.start();  
        Thread t3 = new Thread(tg1, runnable,"three");  
        t3.start();  
        Thread.currentThread().getThreadGroup().interrupt();   
        System.out.println("Thread Group Name: "+tg1.getName());  
       tg1.list(); 

	}

	@Override
	public void run() {
		 System.out.println(Thread.currentThread().getName());  

}
}



                            