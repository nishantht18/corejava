package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkBoxpage {
	
public WebDriver driver;
	
	
	

	public checkBoxpage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By checkboxlink = By.xpath("//li[@id='item-1']/span[contains(text(),'Check Box')]");
	
	By checkboxselect = By.xpath("//span[contains(text(),'Home')]");
	

	public WebElement getCheckBoxlink()
	{
		return driver.findElement(checkboxlink);
	}
	
	public WebElement getCheckBoxselect()
	{
		return driver.findElement(checkboxselect);
	}
}
