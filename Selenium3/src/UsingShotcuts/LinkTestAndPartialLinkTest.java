package UsingShotcuts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkTestAndPartialLinkTest {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/Selenium/htmlpages/link.html");
		
		driver.findElement(By.id("google")).click();		Thread.sleep(1000);

		driver.navigate().back();
		
		driver.findElement(By.linkText("Link2")).click();		Thread.sleep(1000);

		driver.navigate().back();

		driver.findElement(By.partialLinkText("ink3")).click();		Thread.sleep(1000);

		
		driver.navigate().back();
		
	}
}
