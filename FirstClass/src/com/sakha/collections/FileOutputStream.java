package com.sakha.collections;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FileOutputStream {

	public static void main(String[] args) throws IOException {
		java.io.FileOutputStream fos = new java.io.FileOutputStream("C:/Users/Manoj/Desktop/New Text Document (2)");
		byte[] data = new byte[1024];
		String str = "Write this content to file";
		data = str.getBytes();
		fos.write(data);
		System.out.println(str);

	}

}
