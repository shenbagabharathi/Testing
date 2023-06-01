package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task02_d5 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new EdgeDriver();
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		String s=driver.getCurrentUrl();
		String s1="https://j2store.net/free/";
		if(s.equals(s1)) {
			System.out.println("correct url");
		}
		else
		{
			System.out.println("wrong url");
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)", "");
	        driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4")).click();
	        
	        driver.get("https://j2store.net/free/index.php/shop?filter_catid=11");
	        String s3=driver.getCurrentUrl();
	        String s4="https://j2store.net/free/index.php/shop?filter_catid=11";
	        if(s3.equals(s4)) {
				System.out.println("correct url");
			}
			else
			{
				System.out.println("wrong url");
			}
	        
	}
}
