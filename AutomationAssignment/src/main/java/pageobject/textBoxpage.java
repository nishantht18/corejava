package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class textBoxpage {

	public WebDriver driver;
	
	
	

	public textBoxpage(WebDriver driver)
	{
		this.driver = driver;
	}
	 By certificatelink = By.xpath("//img[@class='banner-image']");
	
	By closeAdvertise = By.xpath("//a[@id='close-fixedban']");
	
	By elementsPage = By.xpath("//div[@class='card-body']/h5[contains(text(),'Elements']");
	
	By textboxlink = By.xpath("//li[@id='item-0']/span[contains(text(),'Text Box')]");
	By textboxheader = By.xpath("div[@class='main-header']");
	
	By fullname = By.id("userName");
	By email = By.id("userEmail");
	By currentAddress = By.id("currentAddress");
	By permanentAddress = By.id("permanentAddress");
	
	By submit = By.id("submit");
	
	public WebElement getCertslink()
	{
		return driver.findElement(certificatelink);
	}
	
	public WebElement getCloseAdvertise()
	{
		return driver.findElement(closeAdvertise);
	}
	
	public WebElement getElementPage()
	{
		return driver.findElement(elementsPage);
	}

	public WebElement getTextBoxLink()
	{
		return driver.findElement(textboxlink);
	}
	
	public WebElement getTextBoxheader()
	{
		return driver.findElement(textboxheader);
	}
	
	public WebElement getfullname()
	{
		return driver.findElement(fullname);
	}
	public WebElement getemail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getcurrentAddress()
	{
		return driver.findElement(currentAddress);
	}
	
	public WebElement getpermanentAddress()
	{
		return driver.findElement(permanentAddress);
	}
	
	public WebElement getSubmit()
	{
		return driver.findElement(submit);
	}
	
}

