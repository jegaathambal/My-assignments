package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Define two input strings.
		 String text1 = "stops"; 
		 String text2 = "potss";
		
		 //Check if the lengths of the two strings are equal:	 
	//If equal, continue; otherwise, print "Lengths mismatch, therefore the strings are not an Anagram" and exit.
		 if (text1.length()== text2.length())
		 {
		//- Convert both the strings to character arrays
		 char a[] = text1.toCharArray();
		 char b[] = text2.toCharArray();
		 
		 //Sort both the character arrays
		 Arrays.sort(a);
		 Arrays.sort(b);
				
		
			 //Check if the sorted arrays are equal
		 Boolean result = Arrays.equals(a,b);
		 {
		 if ( result == true)
			//If equal, print "The given strings are Anagram."
				 { System.out.println("The given strings are Anagram");}
		 
		 else {System.out.println("The given strings are not Anagram");}
			 
		 }
		 }
		 else 
		 {  System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		 
		 
		 }	 
		 
	}

}
