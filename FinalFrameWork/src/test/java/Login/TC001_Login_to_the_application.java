package Login;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Reposortiory.loginPage;
import Resources.com_base;

public class TC001_Login_to_the_application extends com_base {

	@BeforeTest
	
		public void openBrowserchrome() throws IOException, InterruptedException {
			openBrowser();
			driver.navigate().to("https://welcome.getjop.com/auth?returnUrl=%2Fokr");
			Thread.sleep(5000);
			loginPage lp=new loginPage(driver);
			clickOnElement(lp.emailID);
			EnterInputIntoElement(lp.emailID, "dhanush.s@testyantar.com");
			
		}
	@Test
	public void verify()
	{
		System.out.println("12345");
	}
	
}
