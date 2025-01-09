package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// launch the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// load the application url
		driver.get("https://en-gb.facebook.com/");
		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Click on the Create new account button.
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		//Enter the First name
		driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-'][1]")).sendKeys("Ishu");
		//Enter the Surname.
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Mouli");
		
		//Enter the Mobile number or email address
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("j.aishwarya1824@gmail.com");
		
		//Enter the New password.
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Mochuk@2024");
		
		// Handle all three dropdowns in Date of birth
		
		WebElement dayEle = driver.findElement(By.name("birthday_day"));
		Select DAY = new Select(dayEle);
		DAY.selectByIndex(17);
		
		WebElement monthEle = driver.findElement(By.name("birthday_month"));
		Select month = new Select(monthEle);
		month.selectByIndex(06);
		
		WebElement yearEle = driver.findElement(By.name("birthday_year"));
		Select year = new Select(yearEle);
		year.selectByValue("1996");
		
		//Select the radio button in Gender.
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		//click the submit button
		driver.findElement(By.name("websubmit")).click();
	}

}
