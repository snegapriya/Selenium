package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollFunctions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		//large interface
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement us = driver.findElement(By.xpath("//a[text()='United States']"));
		
		//small interface
		JavascriptExecutor js = (JavascriptExecutor) driver;//Narrowing type casting
		
		js.executeScript("arguments[0].scrollIntoView();", us);
		
		Thread.sleep(2000);
		
		//scroll up
		js.executeScript("window.scrollBy(0,-4000);");
		
		Thread.sleep(2000);
		
		//scroll down
		js.executeScript("window.scrollBy(0,2000);");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
