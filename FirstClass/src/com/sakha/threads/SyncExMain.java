package com.sakha.threads;

public class SyncExMain {

	public static void main(String[] args) {
		new PrinterThread("Hello..", "There");
		new PrinterThread("How are", "You");
		new PrinterThread("Fine", "Thank you");

	}

}
