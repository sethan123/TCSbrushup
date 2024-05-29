package Seleninum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class naviagate {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/login");
		
		driver.navigate().refresh();
		System.out.println("Refreshed");
		
		driver.navigate().back();
		System.out.println("Backed");
		driver.quit();
		
	}

}
