
package com.sakha.collections;

import java.util.HashSet;
import java.util.Scanner;

public class SetDemo2 {

	public static void main(String[] args) {
		SetDemo2 sd = new SetDemo2();
		System.out.println("The country name is :"+ sd.country() );
		System.out.println("The numbers :" + sd.Numbers());

	}
	 public HashSet country() {
	    
	        HashSet<String> hs1=new HashSet<String>();
	        Scanner scan=new Scanner(System.in);
	        for(int i=0;i<5;i++)
	        {
	        System.out.println("Pls Enter the country name:");
	        hs1.add(scan.next());
	        }
	        return hs1;
	 }

        public HashSet Numbers() {
        	HashSet<Integer> hs2=new HashSet<Integer>();
	        
	        for(int i=1;i<=10;i++)
	        {
	        hs2.add(i);
	        }
	        return hs2;	
        }
}