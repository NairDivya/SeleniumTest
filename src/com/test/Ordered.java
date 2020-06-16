package com.test;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Ordered {
	
	@Test
	public void list() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver d1= new ChromeDriver();
		d1.get("http://demo.automationtesting.in/Selectable.html");
		List <WebElement> select = d1.findElements(By.xpath("//*[@class='deaultFunc']/li"));
		
		int list_size = select.size();
		System.out.println(list_size);
		Actions act1 = new Actions(d1);
		act1.keyDown(Keys.CONTROL)
		.click(select.get(0))
		.click(select.get(2))
		.click(select.get(4))
		.build().perform();

		
		
		
		
		
	}

}
