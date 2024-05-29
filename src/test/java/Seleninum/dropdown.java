package Seleninum;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {
public static void main(String[] args) {	
	WebDriverManager.chromedriver().setup();		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demoqa.com/select-menu");
	driver.manage().window().maximize();
	Select sc= new Select(driver.findElement(By.id("oldSelectMenu")));
	
	
	List<WebElement> s= sc.getOptions();
	System.out.println("The list are ");
	
	for(WebElement options : s)
	{
		System.out.println(options.getText());
	}
	driver.quit();
}
}