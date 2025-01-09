package week5.day1homeassignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL (http://leaftaps.com/opentaps/control/login) 
		
		driver.get("http://leaftaps.com/opentaps/");
		
		//Maximize the browser window
		 
		driver.manage().window().maximize();
		
		//Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Enter the username and password.
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click on the Login button.
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on the CRM/SFA link.
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on the Contacts button.
		driver.findElement(By.linkText("Contacts")).click();
		
		// Click on Merge Contacts.
		driver.findElement(By.linkText("Merge Contacts")).click();
		
		//Click on the widget of the "From Contact".
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		
		//Click on the first resulting contact
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-lastName'])[3]")).click();
		Thread.sleep(1000);
        driver.switchTo().window(allhandles.get(0));
        
        //Click on the widget of the "To Contact"
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
		
		//Click on the second resulting contact.
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[2]")).click();
		Thread.sleep(1000);
		driver.switchTo().window(allhandles2.get(0));
		
		//- Click on the Merge button.
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		// Accept the alert.
		driver.switchTo().alert().accept();
		
		// Verify the title of the page.
		System.out.println("Title of the page "+ driver.getTitle());
	
	

}




}
