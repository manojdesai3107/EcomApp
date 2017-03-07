package com.sakha.collections;



public class GenericsDemo<E> {
	private E width;

	public static void main(String[] args) {
	
            GenericsDemo<Float> g = new GenericsDemo<Float>();
            System.out.println("Width is :" + g.display(5.00f));
	}
    public E display (E width) {
    	return width;
    }
}
