package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/table.html");
		
		driver.manage().window().maximize();
		
		//all data
		System.out.println("** All Data**");
        List<WebElement> allData = driver.findElements(By.xpath("//table/tbody/tr/td"));
		
		for (WebElement all : allData) {
			
			String text = all.getText();
			System.out.println(text);
		}
		
		System.out.println();
		
		//Row data
		System.out.println("** Row Data **");
		
		List<WebElement> rowData = driver.findElements(By.xpath("//table/tbody/tr[5]/td"));
		
		for (WebElement row : rowData) {
			
			String text = row.getText();
			System.out.println(text);
		}
		
		System.out.println();
		
		//column data
		System.out.println("** Column Data **");
		
		List<WebElement> columnData = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
		
		for (WebElement column : columnData) {
			
			String text = column.getText();
			System.out.println(text);
		}
		
		System.out.println();
		
		//particular Data
		System.out.println("** Particular Data **");
		
		WebElement particularData = driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]"));
		
		String text = particularData.getText();
		System.out.println(text);
		
		System.out.println();
		
		//headers
		System.out.println("** Headers **");
		
		List<WebElement> headers = driver.findElements(By.tagName("th"));
		
		for (WebElement head : headers) {
			
			String text2 = head.getText();
			System.out.println(text2);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
