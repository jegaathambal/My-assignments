package week3.day2;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write your code here		
	
    String input = "TestLeaf";
    String expectedOutput = "laeLtseT";
    String output ="";
    char[] reverse = input.toCharArray();
    for (int i = reverse.length-1 ; i>=0; i--)
    {
    	System.out.print(reverse[i]);
    	output = output+reverse[i];
    }
    
	}


}
	


