package UsingShotcuts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BackspacetTillTxtBoxEmpty {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		Thread.sleep(3000);

		WebDriver driver = new FirefoxDriver();
		Thread.sleep(3000);

		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);

		WebElement un = driver.findElement(By.id("username"));
		String uname = "Administrator";
		Thread.sleep(3000);
		un.sendKeys(uname);
		Thread.sleep(3000);

		for (int i = 0; i <= uname.length() - 1; i++) {
			un.sendKeys(Keys.BACK_SPACE);
			Thread.sleep(3000);
		}

	}
}
