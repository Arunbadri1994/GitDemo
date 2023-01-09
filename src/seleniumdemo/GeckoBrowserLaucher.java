package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GeckoBrowserLaucher {
	
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		System.setProperty("driver.gecko.browser", "C:\\Users\\Badri\\Documents\\My Lib\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		Thread.sleep(2000);
		driver.navigate().to("https://web.whatsapp.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().to("https://facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		

	}

}
