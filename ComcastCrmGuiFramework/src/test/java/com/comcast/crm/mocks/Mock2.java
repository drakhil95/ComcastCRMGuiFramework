package com.comcast.crm.mocks;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mock2 {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.clinique.in/");
		WebElement skinCare = driver.findElement(By.xpath("//a[@aria-label='View Skincare menu']"));
		Actions a = new Actions(driver);
		a.moveToElement(skinCare).perform();
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//a[contains(text(), 'All Skincare')]/../a"));
		
		for (WebElement ele : allLinks) {
			System.out.println(ele.getText());
		}
		
	}
}
