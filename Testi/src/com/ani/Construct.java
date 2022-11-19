package com.ani;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Construct {


@Test	
public void launch() {
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.id("email")).sendKeys("vicky");
	
	
}
	
}
