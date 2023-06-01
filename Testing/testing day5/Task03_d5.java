package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task03_d5 {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)", "");
	        driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4")).click();
	        
	        driver.get("https://j2store.net/free/index.php/shop?filter_catid=11");
	        JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollBy(0,500)", "");
	        WebElement e=driver.findElement(By.xpath("//*[@id=\"akeeba-renderjoomla\"]/div/div/div[1]/div[1]/div[1]/div/h2/a"));
	        String s=e.getText();
	        System.out.println(s);
	        WebElement f=driver.findElement(By.xpath("//*[@id=\"akeeba-renderjoomla\"]/div/div/div[1]/div[1]/div[2]/div/h2/a"));
	        String s1=f.getText();
	        System.out.println(s1);
	        WebElement h=driver.findElement(By.xpath("//*[@id=\"akeeba-renderjoomla\"]/div/div/div[1]/div[1]/div[3]/div/h2/a"));
	        String s2=h.getText();
	        System.out.println(s2);
	        
		
	}
}
