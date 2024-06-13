package org.amz;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumMock3 {
	
	public static void main(String[]args) throws InterruptedException  {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		
	//	WebElement decline = driver.findElement(By.xpath("//p[text()='Do not consent']"));
	//	decline.click();
		
		WebElement multiselect = driver.findElement(By.xpath("//select[@size='10']"));
		
		Select select= new Select(multiselect);
		
		select.selectByIndex(2);
		select.selectByIndex(5);
		select.selectByIndex(7);
		
		select.deselectAll();
		
	}
}