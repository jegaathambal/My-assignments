package week2.marathon1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		// maximize the browser
		driver.manage().window().maximize();
		
		// load the application url and implicitwait
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Type "Bags for boys" in the Search box
		driver.findElement(By.xpath("//input[@id ='twotabsearchtextbox']")).sendKeys("Bags for boys");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='icon-search-suggestion s-suggestion-icon-left'][1]")).click();
		
		//Choose the item in the result (bags for boys)
		driver.findElement(By.xpath("//span[text()='Safari']/ preceding-sibling:: div")).click();
		driver.findElement(By.xpath("//span[text()='Skybags']/ preceding-sibling:: div")).click();
		
		//Print the total number of results (like 50000)//example like this-----> 1-48 of over 50,000 results for "bags for boys"
		String text = driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']/span")).getText();
		System.out.println(text);
		
	
		//Choose New Arrivals in sorting
				
		WebElement Sort = driver.findElement(By.xpath("//select[@id='s-result-sort-select']"));
		Select Sorting = new Select(Sort);
		Sorting.selectByVisibleText("Newest Arrivals");
		Thread.sleep(2000);
				
		//Print the first resulting bag info (name, discounted price)

		String Bagname1 = driver.findElement(By.xpath("(//h2[@class='a-size-mini s-line-clamp-1'])[1]/span")).getText();
		System.out.println("First bag name is :" + Bagname1);
		Thread.sleep(2000);
				
		String Bagprice1 = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("First bag discounted price is :" + Bagprice1);
		Thread.sleep(2000);
				
				
		String title = driver.getTitle();
		System.out.println("Title is: "+title);
				
		driver.close();
		

		
	}

}
