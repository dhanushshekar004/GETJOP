package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class com_base {
	public static WebDriver driver;
	public static String credentialsFilepath = "C:\\Users\\Dhanush S\\Desktop\\new\\FinalFrameWork\\src\\main\\java\\Resources\\credentials.properties";

	public WebDriver openBrowser() throws IOException {
		Properties pro = new Properties();
		FileInputStream ips = new FileInputStream(credentialsFilepath);
		pro.load(ips);
		String browserName = pro.getProperty("Browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();

		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			driver.manage().window().maximize();

		}
		return driver;
	}
//*****************************openBrowser*******************************************************
	public void closeBrowser() {
		driver.quit();
	}
	//***************************CloseBrowser******************************************************
	public void clickOnElement(WebElement element)
	{
	element.click();	
	}
	
	//*************************to click on element**************************************************
	public void EnterInputIntoElement(WebElement element,String input)
	{
		element.sendKeys(input);
	}
}
