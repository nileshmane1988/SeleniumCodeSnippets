import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAmazonAccount {

	public static void main(String[] args) {
		System.out.println("hii");

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		System.out.println("2");
		driver.get("https://www.amazon.in");

		By ref1 = By.id("nav-link-accountList");
		WebElement rv1 = driver.findElement(ref1);
		
		rv1.click();
		
		
		By refcreate = By.id("createAccountSubmit");
		WebElement crateAcc = driver.findElement(refcreate);
		crateAcc.click();
		
		WebElement yourname = driver.findElement(By.id("ap_customer_name"));
		yourname.sendKeys("Nilesh");
		
		WebElement mobno = driver.findElement(By.id("ap_phone_number"));
		mobno.sendKeys("9420689338");
		
		driver.findElement(By.id("ap_email")).sendKeys("nileshmane1988@gmal.com");
		
		driver.findElement(By.id("ap_password")).sendKeys("Password@123");
		
		driver.findElement(By.id("continue")).click();
		
		
		
		System.out.println("hello");
	}

}