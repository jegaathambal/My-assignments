package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Point;
import org.openqa.selenium.Dimension;

public class LeafGroundButtonInteraction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

			// launch the browser
			ChromeDriver driver = new ChromeDriver();
			
			// maximize the browser
			driver.manage().window().maximize();
			
			// load the application url
			driver.get("https://leafground.com/button.xhtml");
			
			 //Click on the button with the text ‘Click and Confirm title.’
			driver.findElement(By.xpath("//span[@class='ui-button-text ui-c'][1]")).click();
			
			 //Verify that the title of the page is ‘dashboard.’
			String Title = driver.getTitle();
			System.out.println(Title);
			if (Title.equals("Dashboard"))
			{System.out.println("The Title Dashboard is correct");}
			else { System.out.println("The Title Dashboard is not correct");
			}
			
			
			//Check if the button with the text ‘Confirm if the button is disabled’ is disabled.
			driver.navigate().back();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Disabled']"));
			String Buttondisabled = driver.getTitle();
			System.out.println(Buttondisabled);
			
			if (Buttondisabled.equals("Disabled"))
			{System.out.println("The Button is enabled");}
			else { System.out.println("The Button is disabled");
			}
			
			//Find and print the position of the button with the text ‘Submit.’
		    Point location = driver.findElement(By.xpath("//span[text()='Submit']")).getLocation();
			System.out.println("The position of the submit button is"+location);
		    
			//Find and print the background color of the button with the text ‘Find the Save button color.’
			String cssValue = driver.findElement(By.xpath("//span[text()='Save']/parent::button")).getCssValue("background-Color");
			System.out.println("The background color of the save button is "+cssValue);
			
			//Find and print the height and width of the button with the text ‘Find the height and width of this button.’
			Dimension Size = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize();
			System.out.println("The height and width of this button"+Size);
			
			//Close the browser window.
		    driver.close();
	}

}

