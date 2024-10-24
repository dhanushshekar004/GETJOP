package mobilePractice;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.base_class;

public class open_Application extends base_class {
	@BeforeTest
	public void openbrowser() throws IOException
	{
		ToLaunchApplication();
	}
	@Test
	public void verify()
	{
		System.out.println("rtyu");
	}

}
