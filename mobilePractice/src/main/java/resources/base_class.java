package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class base_class {
	// global variables

	public static AndroidDriver driver;
	public static String credentialsFilePath = "C:\\Users\\Dhanush S\\Desktop\\new\\mobilePractice\\commonData.properties";

	//
	public static AndroidDriver ToLaunchApplication() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(credentialsFilePath);
		prop.load(fis);
		String appPackage = prop.getProperty("appPackage");
		String appActivity = prop.getProperty("appActivity");
		String noRest = prop.getProperty("noReset");
DesiredCapabilities cap=new DesiredCapabilities();
cap.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
cap.setCapability("appPackage", appPackage);
cap.setCapability("appActivity", appActivity);
cap.setCapability(noRest, false);
URL url=new URL("http://localhost:4723/wd/hub");
driver=new AndroidDriver(url, cap);

		return driver;

	}
	public static void main(String[] args) throws IOException {
		ToLaunchApplication();
	}

}
