package com.example.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task04_d6 {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 WebElement username=driver.findElement(By.name("username"));
		  username.sendKeys("Admin");
		  WebElement pass=driver.findElement(By.name("password"));
		  pass.sendKeys("admin123");
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		  Thread.sleep(3000);
		  
		String url = driver.getCurrentUrl();
		if(url.equals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"))
		{
			System.out.println("Login Successful");
		}
		else
		{
			System.out.println("Login failed");
		}
	}

}