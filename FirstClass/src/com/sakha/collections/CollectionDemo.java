package com.sakha.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionDemo {
    public static void main(String[] args) {
		ArrayList al = new ArrayList();
		ArrayList al1 = new ArrayList();
		al.add(1);
		al.add("Hello");
		al.add(null);
		al.add("Hello");
		al1.add("S");
		al1.add(null);
		al1.add(null);
		al.add(8);
		al.addAll(1, al1);
		
		System.out.println("Size of Array List :" + al.size());
		System.out.println("ArrayList :"+ al);
		
		LinkedList l1 = new LinkedList();
		l1.add(1);
		l1.addFirst(5);
		l1.addAll(al1);
		l1.add(4, 5);
		Object obj = l1.clone();
		Object[] obj1 = l1.toArray();
		System.out.println("Linked List :" + l1);
		
	}
}
