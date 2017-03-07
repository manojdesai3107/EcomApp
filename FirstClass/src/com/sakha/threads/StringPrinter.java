package com.sakha.threads;

public class StringPrinter {
 static synchronized void  printstrings (String stringA, String stringB) {
	 System.out.print(stringA);
	 try {
		Thread.sleep(100);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 System.out.println(stringB);
 }
}
