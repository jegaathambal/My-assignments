package week4.day1homeassignment;

import week4.day1.Overridetakesnap;

public class LoginPage extends BasePage{

	
	public void	performCommonTasks()
	{
		System.out.println("Perform the common task by selecting correct option");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LoginPage Login = new LoginPage();
		Login.performCommonTasks();
		Login.findElement();
		Login.enterText();
		Login.clickElement();
		
	}

}
