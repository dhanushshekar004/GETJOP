package Reposortiory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	WebDriver driver;
	public loginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	
	}
@FindBys({@FindBy(xpath ="//input[@placeholder='Email ID']"),
	@FindBy(xpath = "//*[@placeholder='Email ID']")})
public WebElement emailID;
}
