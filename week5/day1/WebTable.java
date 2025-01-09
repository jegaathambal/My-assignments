package week5.day1homeassignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Initialize ChromeDriver
		
				
		ChromeDriver driver = new ChromeDriver();
		
		//Load the url - https://finance.yahoo.com/
				
		driver.get("https://finance.yahoo.com/");
				
		// Maximize the browser window
		driver.manage().window().maximize();
		
		//Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		
		// Click on “Crypto” tab
		 driver.findElement(By.xpath("//span[text()='Markets']")).click();
		 Thread.sleep(2000);
	     driver.findElement(By.xpath("//span[text()='Crypto']")).click();
				
		//Locate the table in the dom page //Locate the cryptocurrency names in the table using specific row and column
	     
	     Thread.sleep(2000);
	     List <WebElement> elements = driver.findElements(By.xpath("//table/tbody/tr/td[2]/span"));
         
	     int rowCount=elements.size(); 
		
		 
		 System.out.println(rowCount);

		//Use loop to iterate the cryptocurrency names
		 for (int i = 2; i <= rowCount; i++) {

			 //Print the cryptocurrency names 
		 	System.out.println(driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[2]/span")).getText());

		 
			 }
		
	     
		
		
	    
			

	}

}
