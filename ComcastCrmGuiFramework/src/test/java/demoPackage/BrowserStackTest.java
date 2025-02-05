package demoPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.MutableCapabilities;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.HashMap;

public class BrowserStackTest {
    @SuppressWarnings({ "deprecation", "deprecation" })
	@Test
    public void sampleTest() {
        MutableCapabilities capabilities = new MutableCapabilities();
        HashMap<String, Object> bstackOptions = new HashMap<String, Object>();
        capabilities.setCapability("browserName", "safari");
        bstackOptions.put("osVersion", "18");
        bstackOptions.put("deviceName", "iPad 9th");
        bstackOptions.put("userName", "akhileshsingh_VtFkxC");
        bstackOptions.put("accessKey", "m9psBPF2QkjsSCAfN1kU");
        capabilities.setCapability("bstack:options", bstackOptions);

        WebDriver driver;
        try {
            driver = new RemoteWebDriver(new URL("https://hub-cloud.browserstack.com/wd/hub"), capabilities);
            driver.get("https://www.google.com");
            driver.findElement(By.id("APjFqb")).sendKeys("Life Sucks" + Keys.ENTER);
            System.out.println("Page title is: " + driver.getTitle());
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

