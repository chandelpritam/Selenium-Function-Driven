
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

public class MultipleSelectElement {
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
		WebElement element = driver.findElement(By.id("multiple-select-example"));
		Select sel = new Select(element);

		Thread.sleep(2000);
		System.out.println("Select Orange By Value");
		sel.selectByValue("orange");

		Thread.sleep(2000);
		System.out.println("De-Select Orange By Value");
		sel.deselectByValue("orange");

		Thread.sleep(2000);
		System.out.println("Select Peach By Index");
		sel.selectByIndex(2);

		Thread.sleep(2000);
		System.out.println("Select Apple By Visible Text");
		sel.selectByVisibleText("Apple");

		Thread.sleep(2000);
		List<WebElement> selectOptions = sel.getAllSelectedOptions();
		for (WebElement option : selectOptions) {
			System.out.println(option.getText());
		}

		Thread.sleep(2000);
		System.out.println("De-Select all the selected options");
		sel.deselectAll();
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
