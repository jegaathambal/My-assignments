package week1.day2;

public class CheckNumberIsPositive {

	public void checkNumber(int a) {
	
	        if (a>=0)
			{System.out.println("a is positive");}
			else 
			{System.out.println("a is negative");} 	
	}
    public static void main(String[] args) {
	CheckNumberIsPositive check = new CheckNumberIsPositive();
	check.checkNumber(10);
	}
  
}
