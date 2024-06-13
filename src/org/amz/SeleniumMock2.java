package org.amz;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class SeleniumMock2 {
	public static void main(String[]args) throws InterruptedException  {
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.codecademy.com/article/what-is-javascript");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor jk = (JavascriptExecutor) driver; 
		
		WebElement accept = driver.findElement(By.xpath("//button[text()='Accept']"));
		
		accept.click();
		
		WebElement scrollup = driver.findElement(By.xpath("//h2[text()='JavaScript libraries and frameworks']"));
		
		jk.executeScript("arguments[0].scrollIntoView(true)", scrollup);
		
		Thread.sleep(5000);
		
		WebElement scrolldown = driver.findElement(By.xpath("////h1[text()='What is JavaScript?']]"));
		
		jk.executeScript("arguments[0].scrollIntoView(false)", scrolldown);
		
		
		
		
	}
}