package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	
	public WebDriver driver;
	public Properties prop;
	

	public WebDriver initializedriver() throws IOException
	{
		
		// TODO Auto-generated method stub
		FileInputStream fin = new FileInputStream("C:\\Users\\nishantht\\eclipse-workspace\\AutomationAssignment\\src\\main\\java\\resources\\data.properties");
		prop = new Properties();
		prop.load(fin);
		
		String browsername = prop.getProperty("browser");
		
		if(browsername.equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "D://geckodriver//geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else if(browsername.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "D://chromedriver_win32//chromedriver.exe");
				 driver = new ChromeDriver();
			}
			else if(browsername.equals("IE"))
			{
				System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
	}

}
