package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task33_d4 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();
//		String mac="FEATURES";
		WebElement fe=driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/ul/li[1]/a"));
		String txt=fe.getText();
		System.out.print(txt);
		
		
		
		
	}
}
