package com.sakha.threads;

public class PrinterThread implements Runnable {

	Thread t;
	String stringA;
	String stringB;
	
	 public PrinterThread(String stringA, String stringB) {
		this.stringA = stringA;
		this.stringB = stringB;
		Thread t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		StringPrinter.printstrings(stringA, stringB);
		
	}

}
