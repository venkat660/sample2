package Maven_page.MAVENPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maven.baseclass.Fuctionallibrary;

public class fkclosepage  extends Fuctionallibrary{
	
	@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']")
	private WebElement close;
	
	@FindBy (xpath="//input[@class='_2zrpKA _1dBPDZ']")
	private WebElement name;

		@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
		private WebElement password;
		
		
		@FindBy(xpath="//a[contains(text(),'New to Flipkart? Create an account')]")
		private WebElement newtoflipkart;
		
	public WebElement getNewtoflipkart() {
			return newtoflipkart;
		}
	
	public WebElement getPassword() {
			return password;
		}
	public WebElement getName() {
		return name;
	}
	public WebElement getClose() {
		return close;
	}
	public fkclosepage() {
		PageFactory.initElements(driver, this);
	}

}