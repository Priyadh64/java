package org.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonXpath {
	
	public static void main (String []args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
		driver.manage().window().maximize();
		
		WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions ac=new Actions(driver);
		
		ac.doubleClick(doubleclick).perform();
				
		System.out.println("OK");
		
		
	}
	
	

}
