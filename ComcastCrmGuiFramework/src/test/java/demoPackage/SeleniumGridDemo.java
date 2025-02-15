package demoPackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class SeleniumGridDemo {
	
	@Parameters("browser")
	@SuppressWarnings("deprecation")
	@Test
	public void gridTest(@Optional("chrome") String browser) throws MalformedURLException, InterruptedException {
		
		URL url = new URL(" http://localhost:4444");
		RemoteWebDriver driver;
		if (browser.equals("chrome")) { 
			ChromeOptions opt = new ChromeOptions();
			driver = new RemoteWebDriver(url, opt);
		} else if (browser.equals("edge")) {
			EdgeOptions opt = new EdgeOptions();
			driver = new RemoteWebDriver(url, opt);
		} else if (browser.equals("firefox")) {
			FirefoxOptions opt = new FirefoxOptions();
			driver = new RemoteWebDriver(url, opt);
		} else {
			ChromeOptions opt = new ChromeOptions();
			driver = new RemoteWebDriver(url, opt);
		}
		
		driver.get("http://google.com");
		Thread.sleep(10000);
		driver.findElement(By.name("q")).sendKeys("Hello World");
		driver.quit();
		Assert.assertTrue(true);
	}
}
