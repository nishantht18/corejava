package FrameworkScratch.AutomationAssignment;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pageobject.textBoxpage;
import resources.base;

public class Homepage extends base {
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializedriver();
		driver.get("https://demoqa.com");
		
	}
	
	public void baseNavigation() 
	{
		textBoxpage textbox = new textBoxpage(driver);
		
		//Actions a = new Actions(driver);
		
		//driver.switchTo().frame(textbox.getElementPage());
		
				
		
		//textbox.getCertslink();
		//textbox.getCloseAdvertise().click();
		JavascriptExecutor js = (JavascriptExecutor)driver;         
		js.executeScript("window.scrollBy(0,500)");
		//js.executeScript("document.querySelector('.card-up').srollTop=5000");*/
		//Thread.sleep(5000);
		textbox.getElementPage().click();
		
		textbox.getTextBoxLink().click();
		
		//Thread.sleep(5000);
		
		Assert.assertTrue(textbox.getTextBoxheader().isDisplayed());
		
		textbox.getfullname().sendKeys("Peter");
		textbox.getemail().sendKeys("peter@gmail.com");
		textbox.getcurrentAddress().sendKeys("13/M James Street");
		textbox.getpermanentAddress().sendKeys("10/L TeakStreet House");

		
	}
	
	

}
