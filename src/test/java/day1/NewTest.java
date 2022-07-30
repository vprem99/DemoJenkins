package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	@Test
	public void f() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\Premchand\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // parent p=new Child For Starting ChromeDriver browser
		driver.manage().window().maximize(); // For Maximize browser
		driver.get("http://selenium.dev");// For Opening Url
		System.out.println(driver.getTitle());// Printing Title
		// driver.findElement(By.linkText("Downloads")).click();

		WebElement E = driver.findElement(By.linkText("Downloads"));
		E.click();
		Thread.sleep(3000);
		driver.quit(); // For Closing Browser
	}
}
