package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {
	
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
			System.out.println("Title is"+title);
			// locate the CRM/ SFA and click
			driver.findElement(By.linkText("CRM/SFA")).click();
			}
	}
