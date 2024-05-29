package Seleninum;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class headlessmode {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Execution in Headless Mode");
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless=new");
	
		  WebDriver driver = new ChromeDriver(options);
		  driver.get("https://demoqa.com");
			Thread.sleep(3000);
			System.out.println("The page title is " +driver.getTitle());
			driver.quit();
			System.out.println("Execution completed");
			
			Capabilities c = ((RemoteWebDriver) driver).getCapabilities();
	        // get the browser name, version and platform with Capabilities object and getCapability() method
	        System.out.println("Current browser Name is : " +c.getBrowserName());
	        System.out.println("Current browser Version is : " +c.getBrowserVersion());
	        System.out.println("Current platform is : " +c.getPlatformName().toString());
	        driver.quit();
	}

}
