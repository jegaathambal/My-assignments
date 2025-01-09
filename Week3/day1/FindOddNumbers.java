package week3.day1;


public class FindOddNumbers {

	public void checkNumberIsOddOrEven(int startRange, int endRange)
	{
		for(int i = startRange; i<=endRange; i++)
		
		if (i % 2 == 0)
		
		{System.out.println("The number "+i+" is Even Number ");}
		else
		{ System.out.println("The number "+i+" is Odd Number ");}
		
		System.out.println("--------------");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub{
		FindOddNumbers checkNumber = new FindOddNumbers();
		checkNumber.checkNumberIsOddOrEven(10,20);
		checkNumber.checkNumberIsOddOrEven(45,55);
		
	}

}
