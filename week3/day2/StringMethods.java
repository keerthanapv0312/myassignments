package week3.day2;

import java.util.Iterator;

public class StringMethods {

	public static void main(String[] args) {
		
		
		String value= "string methods";
		
		//1.split o/p sring mehods interview question
		
		String[] split=value.split("t");
		
		for (int j = 0; j < split.length; j++) {
			
		
		
		System.out.print(split[j]);
		}
		  
		System.out.println();
		
		String replace=value.replace('s', 'S');
		System.out.print(replace);
		
		System.out.println();
		
		String substring=value.substring(3,9);
		
		System.out.print(substring);
		
		
		

	}

}
