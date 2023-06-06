package com.example.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task01_d6 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("shenbaga");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("bharathi");
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("shenba123@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("shenba");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,3000)", "");
		 driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
		 driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();
		 driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();

		
	}
}
