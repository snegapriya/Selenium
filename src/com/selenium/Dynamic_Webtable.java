package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Webtable {
	
	static int indexOfTotal , indexOfRecovered , indexOfActive;
    static String country = "USA";
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.worldometers.info/coronavirus/");
		
		driver.manage().window().maximize();
		
		//All headers
		List<WebElement> allHeaders = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr/th"));
		
		for (int i = 0; i < allHeaders.size(); i++) {
			
			String text = allHeaders.get(i).getText();
		//	System.out.println(text);
			
			String header = text.replaceAll("\n", " ");
		//	System.out.println(header);
			
			if (header.equalsIgnoreCase("Total Cases")) {
				
				indexOfTotal = i;
				System.out.println("Index Of Total Cases :"+indexOfTotal);
			}
			else if (header.equalsIgnoreCase("Total Recovered")) {
				
				indexOfRecovered = i;
				System.out.println("Index Of Recovered Cases :"+indexOfRecovered);
			}
			else if (header.equalsIgnoreCase("Active Cases")) {
				
				indexOfActive = i;
				System.out.println("Index Of Active Cases :"+indexOfActive);
			}
			
		}
		
		//traverse into body
		//All Row
		List<WebElement> allRow = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[1]/tr"));
		
		//Iterate Row
		for (int i = 0; i < allRow.size(); i++) {
			
			List<WebElement> allData = allRow.get(i).findElements(By.tagName("td"));
			
			//Iterate column
			for (int j = 0; j < allData.size(); j++) {
				
				if (allData.get(j).getText().equalsIgnoreCase(country)) {
					
					System.out.println("Total Cases :"+allData.get(indexOfTotal).getText());
					System.out.println("Recovered Cases :"+allData.get(indexOfRecovered).getText());
					System.out.println("Active cases :"+allData.get(indexOfActive).getText());
				}
				
				
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
