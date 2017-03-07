package com.sakha.threads;

public class ThreadDemo extends Thread {
	public void start () {
		System.out.println("Thread's Start Method");
	}
	
	public void run () {
		System.out.println("Thread's run Method");
	}

	public static void main(String[] args) {
		ThreadDemo t1 = new ThreadDemo();
		ThreadDemo t2 = t1;
		System.out.println("Thread1 Name : " + t1.getName());
		System.out.println("Thread1 Priority : " + t1.getPriority());
		System.out.println("Thread1 Status : " + t1.isAlive());
		t2.setName("Second Thread");
		t2.setPriority(MAX_PRIORITY);
		System.out.println("Thread2 Name : " + t2.getName());
		System.out.println("Thread2 Priority : " + t2.getPriority());
		System.out.println("Thread2 Status : " + t2.isAlive());

	}

}
