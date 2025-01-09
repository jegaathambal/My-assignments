package week3.day1;

public class ChangeOddIndexToUppercase {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		char[] test1 = test.toCharArray();
				   
					 
					for(int i = 0; i<=test.length(); i++)
					{
							if (i % 2 == 1)
						        {test1[i]=Character.toUpperCase(test1[i]);}
								  
					   
					}
							 
								test1.toString();
								System.out.println(test1);
				   
		
					}
	}


	
