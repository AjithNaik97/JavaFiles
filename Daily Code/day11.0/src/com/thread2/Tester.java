package com.thread2;

public class Tester {

	public static void main(String[] args) throws InterruptedException {
		// Display details of the main thread(name,prior,thread group)
		System.out.println(Thread.currentThread()); //toString --Thread(main,5,main)
		//Create multiple child threads (extends Thread)
		//create runnable task instance (i.3 implementatio class of Runnable Thread of Runnable
		MyClass runnableTask= new MyClass();
		
		Thread t1=new Thread(runnableTask, "one");
		Thread t2=new Thread(runnableTask, "two");
		Thread t3=new Thread(runnableTask, "three");
		Thread t4=new Thread(runnableTask, "four");
		
		
		//how many runnable threads? 1(main)
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		//how many runnable threads? 1(main)+=4(child)
		System.out.println(t1.isAlive()+" "+t4.isAlive());
		
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " exec count");
			Thread.sleep(1000);
		}
		System.out.println(t1.isAlive()+" "+t4.isAlive());
		System.out.println("main over.........");

		
	}

}
