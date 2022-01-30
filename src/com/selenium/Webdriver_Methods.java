package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Methods {

	public static void main(String[] args) throws InterruptedException {

		// property setting - key(driver name) , value(driver location)
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asus\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");

		// browser launch
		// interface           class
		WebDriver driver = new ChromeDriver(); // upcasting
		// parent              child

		// WebDriver driver1 = new WebDriver;

		// ChromeDriver driver2 = new ChromeDriver();

		// get
		driver.get("https://www.facebook.com/");

		// maximize
		driver.manage().window().maximize();

		// Navigation methods - to
		driver.navigate().to("https://www.instagram.com/accounts/login/");

		// back
		driver.navigate().back(); //facebook

		// getTitle
		String title = driver.getTitle();
		System.out.println("Title is :" + title);

		// forward
		driver.navigate().forward(); //instagram

		// getCurrentUrl
		String currentUrl = driver.getCurrentUrl();
		System.out.println("CurrentUrl is :" + currentUrl);

		Thread.sleep(2000);

		// refresh
		driver.navigate().refresh();

		// close
		driver.close();

	}
}
