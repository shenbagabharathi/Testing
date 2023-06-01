package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task34_d4 {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"input-to-name\"]")).sendKeys("Shenba");
		driver.findElement(By.xpath("//*[@id=\"input-to-email\"]")).sendKeys("Shenba123@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"input-from-name\"]")).sendKeys("Bharathi");
		driver.findElement(By.xpath("//*[@id=\"input-from-email\"]")).sendKeys("Bharathi123@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"input-theme\"]/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"input-message\"]")).sendKeys("hello");
        WebElement d=driver.findElement(By.xpath("//*[@id=\"input-amount\"]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2500)", "");
//        Thread.sleep(1000);
        d.clear();
        d.sendKeys("200");
        
	}
}
