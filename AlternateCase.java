package com.practice.challenges;

public class AlternateCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(alternateCase("bbbb"));
	}
	
	public static String alternateCase(String str){
		String alternative = "";
		
		for(char c : str.toCharArray()) {
			if(Character.isLowerCase(c)) {
				alternative += Character.toUpperCase(c);
			}
			else {
				alternative += Character.toLowerCase(c);
			}
		}
		
		return alternative;
	}

}
