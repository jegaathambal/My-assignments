package week3.day1;

public class Reversetheoddposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String input = "I am a software tester";
		    //String expectedOutput = "I ma a erawtfos tester";
		   
		    //Split the words and have it in an array
		    String[] split = input.split(" ");
		    //Traverse through each word using loop
		    String result = "";
		    	for (int i =0; i< split.length ; i++)
		    	{
		    		if (i % 2==1)
		    		
		    		{
		    			
		    			String value = reverse(split[i]);
		    			result += value +" ";
		    			
			    }
		    		else { 
		    			result += split[i]+ " " ;
		    		}
		    }
		    	
		    	
                result = result.trim();
		    	System.out.println(result);
		    	}
	public static String reverse(String reverse) {
		String reversed = "";
		for (int i = reverse.length() - 1; i >= 0; i--) {
		    reversed += reverse.charAt(i);
		}
		return reversed;
		}
	}


		  
		    
		    
		    
	
		    
		  
		      	
	


