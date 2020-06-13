package basicweb;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatingBetweenPage {

	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Selenium\\src\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "http://letskodeit.teachable.com/";
		driver.manage().window().maximize();
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		String title = driver.getTitle();
		System.out.println("Title of the page is" + title);

		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is" + currentUrl);

		String urlToNavigate = "https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1";
		driver.navigate().to(urlToNavigate);
		System.out.println("Navigating to url");
		Thread.sleep(2000);

		currentUrl = driver.getCurrentUrl();
		System.out.println("Current Url is" + currentUrl);

		driver.navigate().back();
		Thread.sleep(2000);
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current Url is" + currentUrl);

		driver.navigate().forward();
		System.out.println("Navigate Forword");
		Thread.sleep(2000);
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current Url is" + currentUrl);

		driver.navigate().back();
		Thread.sleep(2000);
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current Url is" + currentUrl);

		String pageSorce = driver.getPageSource();
		System.out.println(pageSorce);

	}

	@After
	public void tearDown() throws Exception {
	}

}
