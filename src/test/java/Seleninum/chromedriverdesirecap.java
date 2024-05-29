package Seleninum;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class chromedriverdesirecap {
	public static void main(String[] args) {
		System.out.println("Execution with desired capabilities");
		//DesiredCapabilities caps= DesiredCapabilities.ch;
		
		ChromeOptions cs= new ChromeOptions();
	    cs.setAcceptInsecureCerts(true);
	    ChromeDriver driver = new ChromeDriver(cs);	
		driver.get("https://www.google.com");
		driver.quit();
	}
	

	

}
