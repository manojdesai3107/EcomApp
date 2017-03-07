package com.sakha.threads;

public class RunnableThreaddemo implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Printing From " + Thread.currentThread().getName() + " , the value of i : " + i);
			try {
				Thread.sleep(100);
			}
			catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			
		}

	}
	public static void main(String[] args) throws InterruptedException {
		RunnableThreaddemo r1 = new RunnableThreaddemo();
		RunnableThreaddemo r2 = new RunnableThreaddemo();
		Thread t1 = new Thread(r1, "One");
		Thread t2 = new Thread(r2, "Two");
		System.out.println("Main Thread Starts");
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		/*for (int i = 0; i < 10; i++) {
			System.out.println("Current Thread Name : " + Thread.currentThread().getName() + "\t :" + i);
			Thread.sleep(200);
		}*/
		System.out.println("Main Thread Ends");
	}
}
