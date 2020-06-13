package com.company.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbstactionDemo {
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		AbstactionDemo abstractionDemo = new AbstactionDemo();
		abstractionDemo.login();
		abstractionDemo.logout();
	}

	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Selenium\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"gb_70\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span")).click();

	}

	public void logout() {
		driver.findElement(By.xpath("//*[@id=\\\"gb_70\\\"]")).click();
		driver.findElement(By.xpath("//*[@id=\\\"identifierNext\\\"]/span")).click();
	}

	public void selectUserRole() {
		Select dropdowns = new Select(driver.findElement(By.id("#txtUsername")));
	}
}
