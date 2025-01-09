package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLeadAssignment {

		
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
			
			// locate the Lead tab and click
			driver.findElement(By.linkText("Leads")).click();
			
			// locate the CreateLead link and click
			driver.findElement(By.linkText("Create Lead")).click();
			
			//locate the first name field and enter name as jegathambal
			driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Jegathambal");
			
			//locate the last name field and enter name as K
			driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("K");
			
			//locate the company name field and enter as testleaf
			driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("Testleaf");
			
			// locate the FirstName (Local) Field Using Xpath
			driver.findElement(By.xpath("(//input[@name='firstNameLocal'])[1]")).sendKeys("Jega");
			
			
			//Enter the Department Field Using any Locator of Your Choice.
			driver.findElement(By.xpath("(//input[@name='departmentName'])[1]")).sendKeys("Finance");
			
			 //Enter the Description Field Using any Locator of your choice.
			driver.findElement(By.xpath("(//textarea[@name='description'])[1]")).sendKeys("learningxpath");
			
			 //Enter your email in the E-mail address Field using the locator of your choice.
			driver.findElement(By.xpath("//input[contains(@id,'createLeadForm_primaryEm')]")).sendKeys("jegakirubakaran@gmail.com");
			
			//Select State/Province as NewYork Using Visible Text.
			WebElement StateProvinceEle = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			Select stateprovinceDD = new Select(StateProvinceEle);
			stateprovinceDD.selectByVisibleText("New York");
			
			 //Click on the Create Button.
			  driver.findElement(By.className("smallSubmit")).click();
              System.out.println(driver.getTitle());
              
			  //Click on the edit button.
              driver.findElement(By.xpath("//a[@class='subMenuButton'][3]")).click();
              
			  //Clear the Description Field.
			  driver.findElement(By.id("updateLeadForm_description")).clear();
			  
			  //Fill the Important Note Field with Any text.
			  driver.findElement(By.xpath("//textarea[contains(@id,'updateLeadForm_importantNote')]")).sendKeys("BestInstitute");
					  
			 
			  //locate the update and Click on the update button.
			  driver.findElement(By.xpath("//input[@class='smallSubmit'][1]")).click();
			  System.out.println(driver.getTitle());
			  
		
		
			  //Close the browser window.
			  driver.close();
		}
}

	

	//tagname[@attribute='attribute value/name']
	// input[@name='First name']

	// tagname[text()='text of the element']
	//h2[Text()='Leaftaps Login']
	//label[text()='Username']

	//(any xpath)[index]
	//input[@class]




