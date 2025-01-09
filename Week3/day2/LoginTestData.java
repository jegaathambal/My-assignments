package week3.day2;

public class LoginTestData extends TestData {

	public void enterUsername() 
	{
		System.out.println("Jegathambal");
	}
	
	public void enterPassword()
	{
		System.out.println("1234@Jega");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Calling superclass,subclass methods by creating an object in sub class");
		LoginTestData LTD = new LoginTestData();
		LTD.enterUsername();
        LTD.enterPassword();
        LTD.enterCredentials("");
        LTD.navigateToHomePage("");
        
        System.out.println("Calling super class method by creating the object in sub class");
        TestData TD = new TestData();
        TD.enterCredentials("");
		TD.navigateToHomePage("");
	}

}
