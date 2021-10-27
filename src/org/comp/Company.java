package org.comp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Company {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthick\\eclipse-workspace\\WindowHandle\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement tx = driver.findElement(By.id("email"));
		tx.sendKeys("1234@yahi.com");
		// js.executeScript("arguments[0].setAttribute('value','1234@yahi.com')", tx);
//		Object id = js.executeScript("return document.getElementById('email').value");
//		String s = (String) id;
//		System.out.println(s);
//	}
		js.executeScript("window.scroll(0,document.scrollHeight)");
		js.executeScript("window.scroll(0,-document.scrollHeight)");
	}}