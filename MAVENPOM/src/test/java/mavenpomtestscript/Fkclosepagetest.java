package mavenpomtestscript;

import org.openqa.selenium.WebDriver;

import Maven_page.MAVENPOM.fkclosepage;


public class Fkclosepagetest extends fkclosepage {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		
		browserlaunch();
		openurl("https://www.flipkart.com/");
		fkclosepage fk=new fkclosepage();
		entertext(fk.getName(),"9080295042");
		
		entertext(fk.getPassword(),"ynotme19");
		
		clickbutton(fk.getNewtoflipkart());
		
		
}
	}