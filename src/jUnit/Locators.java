package jUnit;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Locators {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("driver.chrome.browser", "C:\\\\Users\\\\Badri\\\\Documents\\\\My Lib\\\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(5000);
		System.out.println("Hello World");
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.close();
	}

	@Test
	void test() throws Exception {
		driver.get("http://hyderabadreport.com/user");
		Thread.sleep(3000);
		List<WebElement> totallinks= driver.findElements(By.tagName("a"));
		System.out.println("Total links =" +totallinks.size());
		driver.findElement(By.id("edit-name")).sendKeys("arun@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("edit-pass")).sendKeys("Arun@1234"+Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.linkText("Vishleshana")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(""))
	}

	@Test
	void test2() {

	}

}
