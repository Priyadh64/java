package org.amz;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class SeleniumMockWebTable {
	public static void main(String[]args) 		 {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/table");
		
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.id("webtable"));
		
		
		List<WebElement> rows = driver.findElements(By.tagName("td"));
		
		System.out.println(rows.size());
		
		WebElement secondrow = rows.get(1);
		System.out.println(secondrow.getText());
		
		for(int i=0;i <rows.size(); i++)	{
			WebElement webElement = rows.get(i);
			System.out.println(webElement.getText());
			
			
			
		}	
	}
}