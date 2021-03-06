package UsingShotcuts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChkBoxSelectedorNot {
	public static void main(String[] args) {

		System.out.println("hello");

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement chk = driver.findElement(By.id("keepLoggedInCheckBox"));

		boolean s1 = chk.isDisplayed();
		System.out.println(s1);

		if (s1) {
			System.out.println("Checkbox is Displayed");

			boolean s2 = chk.isSelected();
			if (s2) {
				System.out.println("checkbox is already selected");
			} else {
				System.out.println("checkbox is not selected");
				chk.click();
			}
		} else {
			System.out.println("checkbox is not available");
		}

	}

}
