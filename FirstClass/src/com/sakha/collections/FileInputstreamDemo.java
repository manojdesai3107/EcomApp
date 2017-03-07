package com.sakha.collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputstreamDemo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fi = new FileInputStream("C://Users//Manoj//Desktop//New Text Document.txt");
		StringBuffer content = new StringBuffer();
		int ch;
		while((ch=fi.read())!=-1) {
			content.append((char)ch);
		}
		System.out.println("File Contents :" + content);
	}

}
