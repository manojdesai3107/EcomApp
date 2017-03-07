package com.sakha.collections;

import java.util.HashSet;
import java.util.Scanner;

public class SetDemo1 {

	public static void main(String[] args) {
		SetDemo1 sd = new SetDemo1();
		System.out.println("The country name is :"+ sd.country() );
		System.out.println("The numbers :" + sd.Numbers1to15());

	}
	 public HashSet country() {
	    
	        HashSet hs1=new HashSet();
	        Scanner scan=new Scanner(System.in);
	        for(int i=0;i<5;i++)
	        {
	        System.out.println("Pls Enter the country name:");
	        hs1.add(scan.next());
	        }
	        return hs1;
	 }

        public HashSet Numbers() {
        	HashSet hs2=new HashSet();
	        
	        for(int i=1;i<=10;i++)
	        {
	        hs2.add(i);
	        }
	        return hs2;	
        }
        public HashSet Numbers1to15() {
        	HashSet hs3 = new HashSet();
        	hs3 = Numbers();
        	for (int i = 11; i <= 15; i++) {
				hs3.add(i);
			}
			return hs3;
        	
        }
}
    
