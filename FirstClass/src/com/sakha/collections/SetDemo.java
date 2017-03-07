package com.sakha.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("India");
		hs.add("Australia");
		hs.add("USA");
		hs.add(null);
		hs.add(null);
		
		System.out.println("Hashset is :" + hs);

	}

}
