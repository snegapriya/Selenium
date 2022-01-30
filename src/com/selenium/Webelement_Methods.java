package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_Methods {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asus\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/");

		driver.manage().window().maximize();

		// sendkeys
		WebElement emailId = driver.findElement(By.id("email"));

		emailId.sendKeys("Sivaranjani@gmail.com");

		// getAttribute
		String attribute = emailId.getAttribute("name");
		System.out.println(attribute);

		String attribute2 = emailId.getAttribute("value");
		System.out.println(attribute2);

		//clear
		emailId.clear();
		
		// isDisplayed
		boolean displayed = emailId.isDisplayed();
		System.out.println("Is Displayed :" + displayed);

		// sendkeys
		WebElement password = driver.findElement(By.name("pass"));

		password.sendKeys("123456");

		// isEnabled
		boolean enabled = password.isEnabled();
		System.out.println("Is Enabled :" + enabled);

		// click
		WebElement loginButton = driver.findElement(By.name("login"));

		// isSelected
		boolean selected = loginButton.isSelected();
		System.out.println("Is Selected :" + selected);

	//	loginButton.click();

	}
}
