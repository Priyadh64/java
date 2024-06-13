package org.amz;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazonWebTable2 {
	
	
	public static void main(String[]args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		WebElement table = driver.findElement(By.id("customers"));
	//	System.out.println(table.getText());
		
		// how to find the total rows
		List<WebElement> allRows = table.findElements(By.tagName("th"));
		System.out.println(allRows.size());
		
	//	WebElement secondRow = allRows.get(0);
	//	System.out.println(secondRow.getText());
		
		for (int i=0; i<allRows.size();i++) {
			WebElement webElement = allRows.get(i);
			System.out.println(webElement.getText());
			
		}
		
		
		

	}}
		