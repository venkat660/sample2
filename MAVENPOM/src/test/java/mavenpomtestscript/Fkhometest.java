package mavenpomtestscript;

import org.openqa.selenium.WebDriver;

import Maven_page.MAVENPOM.flipkartpomhomepage;

public class Fkhometest extends flipkartpomhomepage {
	
	public static WebDriver driver;
	
	
	public static void main(String[] args) {
		
		browserlaunch();
		openurl("https://www.flipkart.com/");
	
		
		
		
	}

}
