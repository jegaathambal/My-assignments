package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
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
					
		// locate the CRM/ SFA and click
		driver.findElement(By.linkText("CRM/SFA")).click();
					
		// locate the Lead tab and click
		driver.findElement(By.linkText("Leads")).click();
					
		//click on find leads
		driver.findElement(By.linkText("Find Leads")).click();
				
	    //Click on the "Phone" tab.
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
		
		//Enter the phone number.
		driver.findElement(By.xpath("(//input[@name='phoneNumber'])")).sendKeys("9944385656");
		
		//Click the "Find leads" button.
		driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
		
		//Capture the lead ID of the first resulting lead.
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath(("(//a[@class='linktext'])[4]"))).getText();
		System.out.println(text);
		
		//Click the first resulting lead.
		driver.findElement(By.xpath(("(//a[@class='linktext'])[4]"))).click();
		
		//Click the "Delete" button.
		driver.findElement(By.linkText("Delete")).click();
		
		//Click "Find leads" again.
		driver.findElement(By.linkText("Find Leads")).click();
		
		//Enter the captured lead ID.
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
		
		//Click the "Find leads" button.
		driver.findElement(By.linkText("Find Leads")).click();
		
		//Verify the presence of the message "No records to display" in the Lead List. This 
		String records = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		System.out.println(records);
		
		//Close the browser window.
		driver.close();
	}

}
