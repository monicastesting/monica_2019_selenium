package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POMClass 
{
	private WebDriver driver;
	public WebElement username(WebDriver driver)
	{
		WebElement username = driver.findElement(By.id("txtCustomerID"));
		return username;
		
	}
	
	public WebElement password(WebDriver driver)
	{
		WebElement password = driver.findElement(By.id("txtPassword"));
		return password;
		
	}
	
	public WebElement loginButton(WebDriver driver)
	{
		WebElement loginBt = driver.findElement(By.id("Butsub"));
		return loginBt;
		
	}
	
	public WebElement errorMsg(WebDriver driver)
	{
		WebElement errormsg = driver.findElement(By.id("lblMsg"));
		return errormsg;
		
	}

}
