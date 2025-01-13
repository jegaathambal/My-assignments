package week5.marathon2;

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
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.edge.EdgeDriver;

public class Testcase1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		//Tatacliq Testcase:
			
			//1. Load the url as https://www.tatacliq.com/
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		 ChromeDriver driver = new ChromeDriver(option);
		 //EdgeDriver ed = new EdgeDriver();
		 
		 //RemoteWebDriver driver = ed;
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		 Actions action = new Actions(driver);
		 driver.get("https://www.tatacliq.com");
		
			
			Thread.sleep(1000);
			driver.navigate().refresh();
			
			//2. MouseHover on 'Brands'
			
			WebElement Brands = driver.findElement(By.xpath("(//div[@class='DesktopHeader__arrow'])[2]"));
		    action.moveToElement(Brands).build().perform();
		    
			//3. MouseHover on 'Watches & Accessories'
		    
		   action.moveToElement(driver.findElement(By.xpath("//div[text()='Watches & Accessories']"))).build().perform();
		    
			//4. Choose the first option from the 'Featured brands'.
		   action.moveToElement(driver.findElement(By.xpath("(//div[@class='DesktopHeader__brandsDetails'])[1]"))).click().build().perform();
		   

			//5. Select sortby: New Arrivals
		   
		   Thread.sleep(1000);
		   WebElement SortBy = driver.findElement(By.className("SelectBoxDesktop__hideSelect"));
		   
		   
			Select SortName = new Select(SortBy);
			SortName.selectByVisibleText("New Arrivals");
			
		  
			//6. choose men from catagories filter.
			driver.findElement(By.className("FilterDesktop__newFilName")).click();
			
			//7. print all price of watches
			Thread.sleep(1000);
			List<WebElement> prices = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']"));
			System.out.println(prices.size());
			for(WebElement amount : prices){
				System.out.println(amount.getText() + " ");
			}
			
			//8. click on the first resulting watch.
			
			driver.findElement(By.xpath("//div[@class='ProductModule__dummyDiv']")).click();
			
			
			String text2 = driver.findElement(By.xpath("(//div[@class='ProductDescription__priceHolder']/h3)[1]"))
					.getText();
			String replaceText1 = text2.replaceAll("\\D", "");

			System.out.println("watch price:" + replaceText1);
			
			Set<String> allWindows = driver.getWindowHandles();
			List<String> allhandles = new ArrayList<String>(allWindows);
			driver.switchTo().window(allhandles.get(1));
			
			
			
			//9. compare two price are similar
			String text = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']/h3")).getText();
			String replaceText2 = text.replaceAll("\\D", "");
			System.out.println("watch price in the bag   :"+replaceText2);
			// check two price are similar
			if (replaceText1.contains(replaceText2)) {
				System.out.println("Both price are equal");
			} else {
				System.out.println("Not equal");
			}

			
			
			//10. click Add to cart and get count from the cart icon.
			
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
			
			List<WebElement> cartcount = driver.findElements(By.xpath("//span[@class='DesktopHeader__cartCount']"));
			System.out.println(cartcount.size());
			//for(WebElement amount : cartcount){
			//	System.out.println(amount.getText() + " ");
			//}
			
			//11. Click on the cart
			driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).click();
			
			//12. Take a snap of the resulting page. 
			
			Thread.sleep(5000);
			// take screenshot
			File screenshot = driver.getScreenshotAs(OutputType.FILE);
			//choose location, filename and extension
			File location = new File("./snaps/snapshot1.png");
			//save the Screenshot
			FileUtils.copyFile(screenshot, location);
			
			//13. Close All the opened windows one by one.
			
			driver.close();
			driver.switchTo().window(allhandles.get(0));
			driver.close();
			
	}

	
		
		
	

}
