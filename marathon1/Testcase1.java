package week2.marathon1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// launch the browser
				ChromeDriver driver = new ChromeDriver();
				
				// maximize the browser
				driver.manage().window().maximize();
				
				// load the application url
				driver.get("http://www.pvrcinemas.com/");
				
				//Choose Your location as "Chennai" (sometimes it will be located automatically)
				//driver.findElement(By.xpath("(//span[text()='Chennai'])[3]")).click();
				
				//Click on Cinema under Quick Book
				driver.findElement(By.xpath("(//span[text()='Cinema'])")).click();
				
				//Select Your Cinema
				driver.findElement(By.xpath("(//span[text()='Select Cinema'])")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//span[text()='INOX Chennai Citi Centre,Dr. R. K. Salai Chennai'])[1]")).click();
				
				//Select Your Date as Tomorrow
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
				
				//Select Your Movie
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//span[text()='VIDUTHALAI PART 2'])[2]")).click();
				
				//Select Your Show Time
				driver.findElement(By.xpath("(//span[text()='11:10 AM'])")).click();
				
				//Click on Book Button
				driver.findElement(By.xpath("(//span[text()='Book'])[4]")).click();
				driver.findElement(By.xpath("(//button[text()='Accept'])")).click();
				
				//Click Accept on Term and Condition
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//button[text()='Accept'])")).click();
				
				//Click any one available seat
				driver.findElement(By.xpath("//span[@id='CL.Club|N:18']")).click();
				
				//Click Proceed Button
				driver.findElement(By.xpath("//button[text()='Proceed']")).click();
						
				//Print the Seat info under book summary
				String text = driver.findElement(By.xpath("//div[@class='seat-number']/p")).getText();
				System.out.println(text);
			
				
				//Print the grand total under book summary
				String total = driver.findElement(By.xpath("//div[@class='grand-total']/following-sibling::div")).getText();
				System.out.println(total);
				
				//Click Proceed Button
			
				driver.findElement(By.xpath("//button[@class='sc-kfzCjt dzvwYk btn-proceeded']")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//button[@class='sc-dQpIV kXNFEA btn-proceeded']")).click();
				
				//Close the popup
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[@class='cross-icon mx-2'])[2]//i")).click();
				
				// Print Your Current Page title
				System.out.println(driver.getTitle());
				
				//Close Browser
				driver.close();
	}

}
