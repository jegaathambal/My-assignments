package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadassignment {

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
				
				// locate the company name field and enter the company name as Testleaf
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
				
				//locate the first name field and enter the first name as Jegathambal
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jegathambal");
				
				//locate the last name field and enter the last name
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
				
				// locate the source dropdown element
				//step 1 locate the dropdown
				WebElement SourceEle = driver.findElement(By.id("createLeadForm_dataSourceId"));
				//step 2 create object for select class and pass the webelement refrence into the argument
				Select sourceDD = new Select(SourceEle);
				//step 3 using method to select value from the dropdown
				sourceDD.selectByIndex(5);
				
				//locate the marketing campaign and select ecommerce
				WebElement marketingEle = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
				Select marketingDD = new Select(marketingEle);
				marketingDD.selectByValue("9000");
				
				//locate the industry dropdown and select general services
				WebElement industryEle = driver.findElement(By.id("createLeadForm_industryEnumId"));
				Select industryDD = new Select(industryEle);
				industryDD.selectByVisibleText("General Services");
				
				//locate the create lead button and click
				driver.findElement(By.className("smallSubmit")).click();
                System.out.println(driver.getTitle());

                String companyNameAndLeadId = driver.findElement(By.id("viewLead_companyName_sp")).getText();
                System.out.println(companyNameAndLeadId);				
				
                //close the browser window
        		driver.close();
				}

		}


