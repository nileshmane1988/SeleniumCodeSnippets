import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ResizeWind {
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver rv = new FirefoxDriver();
		Navigation nvg = rv.navigate();
		rv.get("http://www.google.com");
		 rv.manage().window().setSize(new Dimension(100,500));
		Options opt = rv.manage();
		opt.window().setSize(new Dimension(200,400));
 
		Window w = opt.window();
			 Thread.sleep(4000);

		 	Dimension d = new Dimension(400, 500);
		 	w.setSize(d);
			 Thread.sleep(4000);

		 	// change Position
		 	Point p = new Point(200,100);
		 	w.setPosition(p);
		 	// or in single line
			 Thread.sleep(4000);

		 rv.manage().window().setPosition(new Point(300,200));	
		 Thread.sleep(4000);

		 //Maximize Window
		 
		 rv.manage().window().maximize();
		 
		 Thread.sleep(4000);
		 
		 

		 rv.quit();
		 

	}

}
