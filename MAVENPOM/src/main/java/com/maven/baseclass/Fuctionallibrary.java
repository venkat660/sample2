package com.maven.baseclass;
 
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

import Maven_page.MAVENPOM.flipkartpomhomepage;

public class Fuctionallibrary{
	
	public static WebDriver driver;
	
public static void browserlaunch() {
	try {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\venkat\\Documents\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
}	catch (Exception e){
	System.out.println(e.getStackTrace());
}	
}
public static void openurl(String url) {
	try {
	driver.get(url);
	}
	catch(Exception e) {
		System.out.println(e.getStackTrace());
	}
}
public static void entertext(WebElement element, String value) {
	try {
	element.sendKeys(value);
} catch (Exception e) {
	System.out.println(e.getStackTrace());
}

}
public static void clickbutton(WebElement element) {
	
try {
element.click();
} catch (Exception e) {
	System.out.println(e.getStackTrace());
}
}

public static void mousehover(WebElement element ) {
	
	element.click();
	
	Actions ac=new Actions(driver);
	ac.moveToElement(element).build().perform();
	
}







}


