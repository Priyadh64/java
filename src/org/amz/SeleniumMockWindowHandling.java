package org.amz;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumMockWindowHandling {

	public static void main(String[]args) 		 {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement txtSearchBox = driver.findElement(By.name("q"));
		txtSearchBox.sendKeys("Tv");
		txtSearchBox.sendKeys(Keys.ENTER);
		
		driver.findElement(By.
		xpath("//div[text()='LG 80 cm (32 inch) HD Ready LED Smart WebOS TV']")).click();
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		Set<String> allOpenedWindow = driver.getWindowHandles();
		System.out.println(allOpenedWindow);
		
		for(String x: allOpenedWindow)	{
			System.out.println(x);
			
			if (!x.equals(parentWindow)) {
				driver.switchTo().window(x);
			}}
				
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		
		
		

	
		
	}
}