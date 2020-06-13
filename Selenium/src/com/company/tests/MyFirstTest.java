package com.company.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Selenium\\src\\driver\\chromedriver.exe");
		/*
		 * Headless Testing ChromeOptions chromeOptions = new ChromeOptions();
		 * chromeOptions.setHeadless(true);
		 */

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opensorce-demo.orangehrmlive.com/");

		// To maximize window
		driver.manage().window().maximize();

		// To get Title of the page
		System.out.println("The title of the page is :" + driver.getTitle());

		// driver.close();
 
		// by using id
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		driver.findElement(By.id("txtpassword")).sendKeys("admin123");
//		driver.findElement(By.id("btnLogin")).click();

		// by using xpath

//		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
//		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
//		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();

		// by using cssSelector (login)

		driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("#txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("#btnLogin")).click();

	}

}
