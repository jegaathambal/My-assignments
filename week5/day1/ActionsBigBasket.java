package week5.day1homeassignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsBigBasket {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		//Initialize ChromeDriver
				ChromeDriver driver = new ChromeDriver();
				
				// Load the URL (https://www.bigbasket.com/)
 
				
				driver.get("https://www.bigbasket.com/");
				
				//Maximize the browser window
				 
				driver.manage().window().maximize();
				
				//Add an implicit wait to ensure the webpage elements are fully loaded
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				Actions action = new Actions(driver);
				
				
				//Click on "Shop by Category".
				driver.findElement(By.xpath("(//span[text()='Category'])[2]")).click();
				
			    //Mouse over "Foodgrains, Oil & Masala"
				
				
				Thread.sleep(1000);
				
				WebElement Category = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
			    action.moveToElement(Category).build().perform();
				
				
				// Mouse over "Rice & Rice Products"
				action.moveToElement(driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"))).build().perform();
				
				// Click on "Boiled & Steam Rice"
				action.click(driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']"))).build().perform();
				
				//Filter the results by selecting the brand "bb Royal"
				action.click(driver.findElement(By.xpath("//input[@id='i-BBRoyal']"))).build().perform();
				
				// Click on "Tamil Ponni Boiled Rice"
				Thread.sleep(2000);
				action.click(driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled Rice - 12 - 17 Months Old']"))).build().perform();
				
				// Select the 5 Kg bag.
				Set<String> allWindows = driver.getWindowHandles();
				List<String> allhandles = new ArrayList<String>(allWindows);
				
				
				driver.switchTo().window(allhandles.get(1));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				Thread.sleep(2000);
				action.scrollToElement(driver.findElement(By.xpath("(//div[@class='flex flex-col items-start justify-start w-full p-2.5'])[6]"))).click().build().perform();
				
				
				// Check and note the price of the rice.
				//String Description;
				action.scrollToElement(driver.findElement(By.xpath("//h1[@class='Description___StyledH-sc-82a36a-2 bofYPK']")));
				String Description1 = driver.findElement(By.xpath("//h1[@class='Description___StyledH-sc-82a36a-2 bofYPK']")).getText();
				String price = driver.findElement(By.xpath("//td[@class='Description___StyledTd-sc-82a36a-4 fLZywG']")).getText();
				System.out.println("The product name is:"+Description1);
				System.out.println("The price of the product is:"+price);
				
				
				// Click "Add" to add the bag to your cart.
				driver.findElement(By.xpath("//button[text()='Add to basket']")).click();
				
				//  Verify the success message that confirms the item was added to your cart.
				
				String Verify = driver.findElement(By.xpath("//div[@class='flex item-center']")).getText();
				System.out.println("The product verification :"+Verify);
				
				
				//  Take a snapshot of the current page
				TakesScreenshot snap=(TakesScreenshot)driver;
				File snappic = snap.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(snappic,new File("E://TestLeaf//learn-selenium/Snapscreen.png"));
				System.out.println("Screenshot is captured");
				
				//  Close the current window.
				driver.close();
				driver.switchTo().window(allhandles.get(0));
				
				
				//Close the main window
				driver.close();
	}

}
