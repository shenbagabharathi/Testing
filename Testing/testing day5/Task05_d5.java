package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task05_d5 {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.smart-hospital.in/site/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div[1]/a[1]/i")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/form/button")).click();
		driver.get("https://demo.smart-hospital.in/admin/admin/dashboard");
		WebElement e=driver.findElement(By.xpath("//*[@id=\"sibe-box\"]/ul[2]/li[4]/a"));
		String a=e.getTagName();
		System.out.println(a);
		WebElement f=driver.findElement(By.xpath("//*[@id=\"alert\"]/nav/div[2]/div/form/div/input"));
		Dimension w=f.getSize();
		System.out.println(w);
		String b=f.getCssValue("color");
		System.out.println(b);
		driver.close();
		
	}
}
