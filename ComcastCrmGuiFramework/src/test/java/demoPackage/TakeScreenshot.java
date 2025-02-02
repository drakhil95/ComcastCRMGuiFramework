package demoPackage;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://amazon.com");
		
//		EventFiringWebDriver edriver = new EventFiringWebDriver(driver);
//		
//		File src = edriver.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src, new File("./screenshots/abc.png"));
//		driver.quit();
	}
}
