package basicweb;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithListOfRadioButtons {
	private WebDriver driver;
	private String baseUrl;

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
		boolean isChecked = false;
		List<WebElement> radioButtons = driver
				.findElements(By.xpath("//input[contains(@type,'radio') and contains(@name,'cars')]"));
		int size = radioButtons.size();
		System.out.println("Size of Radio Button Is:" + size);
		for (int i = 0; i < size; i++) {
			isChecked = radioButtons.get(i).isSelected();
			if (!isChecked) {
				radioButtons.get(i).click();
				Thread.sleep(2000);
			}
		}
	}

	@After
	public void tearDown() throws Exception {

		Thread.sleep(3000);
		driver.quit();
	}

}
