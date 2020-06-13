package basicweb;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithHiddenElement {
	WebDriver driver;
	String baseUrl1;
	String baseUrl2;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Selenium\\src\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl1 = "https://learn.letskodeit.com/p/practice";
		baseUrl2 = "http://www.expedia.com";
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@Test
	public void test() {
		driver.get(baseUrl1);
		WebElement textBox = driver.findElement(By.id("displayed-text"));
		System.out.println("TextBox Is Displayed :" + textBox.isDisplayed());
	}

	@After
	public void tearDown() throws Exception {
	}

}
