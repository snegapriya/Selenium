package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Dropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asus\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement createButton = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		createButton.click();
		
		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.id("day"));
		
		Select s = new Select(day);
		s.selectByValue("10");
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select s1 = new Select(month);
		s1.selectByIndex(6);
		
		WebElement year = driver.findElement(By.id("year"));
		
		Select s2 = new Select(year);
		s2.selectByVisibleText("2020");
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
