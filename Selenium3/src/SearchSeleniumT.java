import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchSeleniumT {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("ProgStart");
		driver.get("https://www.google.com");
		
		 WebElement src = driver.findElement(By.name("q"));
		 src.sendKeys("selenium tutorial");
		 Thread.sleep(8000);
		 src.sendKeys(Keys.ENTER);
		


	}

}
