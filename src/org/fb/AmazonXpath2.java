package org.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonXpath2 {
	
	public static void main (String []args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://greenstechnologys.com/");
		
		driver.manage().window().maximize();
		
		WebElement mouseover = driver.findElement(By.xpath("//a[text()='Master Program']"));
		
		Actions ac = new Actions(driver);
		
		ac.moveToElement(mouseover).perform();
		
		
		
		
		
		
		
	
		
		
		
	}
	
	

}
