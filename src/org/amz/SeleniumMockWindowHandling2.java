package org.amz;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumMockWindowHandling2 {
	public static void main(String[]args) 		 {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//p[text()='Do not consent']")).click();
		driver.findElement(By.
		xpath("//a[text()='Open Seperate Multiple Windows']")).click();
		driver.findElement(By.xpath("//button[@onclick='multiwindow()']")).click();
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		Set<String> allOpenedWindow = driver.getWindowHandles();
		System.out.println(allOpenedWindow);
		
		List<String> l = new ArrayList<String>();
		l.addAll(allOpenedWindow);
		String string= l.get(2);
		driver.switchTo().window(string);
		
		WebElement txtemail = driver.findElement(By.id("email"));
		txtemail.sendKeys("Priya");
		txtemail.sendKeys(Keys.ENTER);
		
	}
}