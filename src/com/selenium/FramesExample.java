package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asus\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		//single frame
		driver.switchTo().frame("singleframe");
		
		WebElement textBox1 = driver.findElement(By.xpath("//input[@type='text']"));
		textBox1.sendKeys("Divya");
	
		//defaultContent - from frame to main page
		driver.switchTo().defaultContent();
		
		//multi frame
		WebElement iframeButton = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		iframeButton.click();
		
		//switch to the outer frame
		WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerFrame);
		
		//switch to the inner frame
		WebElement innerFrame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(innerFrame);
		
		WebElement textBox2 = driver.findElement(By.xpath("//input[@type='text']"));
		textBox2.sendKeys("Dhanush");
		
		//parentFrame - from inner frame to outer frame
		driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
		
		
		
		
		
		
		
		
		
	}
}
