package com.demo.concept;

public class StringAndStringBuffer {

	public static void main(String[] args) {

		String s = new String ("Sunita");
		s.concat("Paul");
		System.out.println(s);
		
		
		StringBuffer p =new StringBuffer("Sunita");
		p.append("paul");
		System.out.println(p);
		
		
		
	}

}
