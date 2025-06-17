package com.test;

public class WordSorter {
	
	public static void main(String[] args) {
		
		String input = "Ramesh";
		
		char[] arr = input.toCharArray();
		
		for(int i=0; i< arr.length;i++) {
			
			  char ch = arr[i];
			  int ascii = (int) ch;
			  System.out.println(ascii);
			for(int j= i+1; j<arr.length; j++) {
				
				char ch1 = arr[j];
				int ascii1 = (int) ch1;
				System.out.println("The value is " + ascii1);
				
				if( ascii > ascii1) {
					
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
				
			}
			  
			
		}
		
		for(char ch : arr) {
			System.out.println(ch);
		}
		
	}

}
