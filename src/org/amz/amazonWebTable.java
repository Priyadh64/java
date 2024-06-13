package org.amz;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazonWebTable {
	
	
	public static void main(String[]args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		
		WebElement table = driver.findElement(By.xpath("//table[@border='l']"));
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
	
		}
}
		