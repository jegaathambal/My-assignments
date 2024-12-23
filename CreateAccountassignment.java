package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// launch the browser
	ChromeDriver driver = new ChromeDriver();
	
	// maximize the browser
	driver.manage().window().maximize();
	
	// load the application url
	driver.get("http://leaftaps.com/opentaps/");
	
	//locate the username field
	WebElement usernameField = driver.findElement(By.id("username"));	
	
	// enter the input as demosalesmanager for usernamefield
	usernameField.sendKeys("demosalesmanager");
	
	//locate the password field and enter the password
	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
    
	//enter the login page
	driver.findElement(By.className("decorativeSubmit")).click();
	
	//to get the title of the webpage
	String title = driver.getTitle();
	System.out.println("Title is" +title);
	
	// locate the CRM/ SFA and click
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	// locate the Accounts tab and click
	driver.findElement(By.linkText("Accounts")).click();
	
	// locate the CreateAccount link and click
	driver.findElement(By.linkText("Create Account")).click();
	
	// locate the company name field and enter the company name as 
	driver.findElement(By.id("accountName")).sendKeys("Selenium Automation Tester");
	
	//locate the no of employees and add 100
	driver.findElement(By.id("numberEmployees")).sendKeys("100");
	
	//locate the office sitename and enter LeafTaps
	driver.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");
	
	//locate the create lead button and click
	driver.findElement(By.className("smallSubmit")).click();
    System.out.println(driver.getTitle());
	
    //close the browser window
	driver.close();
	    			
		
	}

}
