package com.thread1;

public class MyClass extends Thread {
	
	public MyClass(String name)
	{
		super(name);
	}
	

	// Mandatory override run()
	/*
	 * Rule - method overriding and exception handling Overriding form of the
	 * method(sub class version) CAN NOT throw any NEW or BROADER CHECKED exception
	 */
	@Override
	public void run() {
		System.out.println(getName() + " started");
		try {
			// B.L -- for loop(10)
			for (int i = 0; i < 10; i++) {
				System.out.println(getName() + " exec count");
				Thread.sleep(500);
			}
		} catch (Exception e) {
			System.out.println(getName() + " got exec" + e);
		}
		System.out.println(getName() + " over");

	}

}
