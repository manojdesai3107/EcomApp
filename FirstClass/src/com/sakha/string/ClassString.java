package com.sakha.string;

public class ClassString {
public static void main(String[] args) {
	String s1 = "Welcome to Java World";
	System.out.println("The character at 5th position is :" + s1.charAt(4));
	System.out.println("The concatenation is :" + s1.concat(" Bye"));
	System.out.println("The replacement is :" + s1.replace('a', 'e'));
	System.out.println("The substring is :" + s1.substring(4, 10));
	StringBuffer sb = new StringBuffer("This is StringBuffer");
	System.out.println("The String Buffer is : " + sb);
	//System.out.println("The additional is :" + sb.append(" This is a simple Program"));
	//System.out.println("The reverse is :" + sb.reverse());
	System.out.println("The Replacement is :" + sb.replace(14, 20, "Bulider"));
}
}
