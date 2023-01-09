package jUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JUnitPractice {
	
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("driver..chrome.browser", "C:\\\\Users\\\\Badri\\\\Documents\\\\My Lib\\\\geckodriver.exe");
		driver= new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.manage().window().minimize();
		Thread.sleep(3000);
	driver.close();
	}

	@Test
	void google() throws Exception {
		driver.get("https:\\www.google.com");
		Thread.sleep(3000);
	}
	
	@Disabled
	@Test
	void facebook() throws Exception {
		driver.get("https:\\www.facebook.com");
		Thread.sleep(3000);
	}
	
	@Test
	void twitter() throws Exception {
		driver.get("https:\\www.twitter.com");
		Thread.sleep(3000);
	}
	
	@Test
	void selenium() throws Exception {
		driver.get("http://www.seleniumlearn.com/");
		Thread.sleep(3000);
	}

}
