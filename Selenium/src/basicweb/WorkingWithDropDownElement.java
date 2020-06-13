package basicweb;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithDropDownElement {
	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Selenium\\src\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "https://learn.letskodeit.com/p/practice";
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@Test
	public void test() throws Exception {
		driver.get(baseUrl);
		WebElement element = driver.findElement(By.id("carselect"));
		Select dropdown = new Select(element);

		Thread.sleep(2000);
		System.out.println("Select Benz By Value");
		dropdown.selectByValue("benz");

		Thread.sleep(2000);
		System.out.println("Select Benz By Index");
		dropdown.selectByIndex(2);

		Thread.sleep(2000);
		System.out.println("Select Benz By Visible Text");
		dropdown.selectByVisibleText("BMW");

		Thread.sleep(2000);
		System.out.println("Print the list of all options");
		List<WebElement> options = dropdown.getOptions();
		int size = options.size();

		for (int i = 0; i < size; i++) {
			String optionsNames = options.get(i).getText();
			System.out.println(optionsNames);

		}
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
