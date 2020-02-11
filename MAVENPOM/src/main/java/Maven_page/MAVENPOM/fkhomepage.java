package Maven_page.MAVENPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import com.maven.baseclass.Fuctionallibrary;

public class fkhomepage extends Fuctionallibrary {
	
	
	@FindBy(xpath="//span[@class='_1QZ6fC _3Lgyp8' and contains(text(),'Men')]")
	private WebElement men;


	
	
	public WebElement getMen() {
		return men;
	}

}