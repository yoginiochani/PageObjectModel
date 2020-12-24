package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//here in this class, defining all the element object of the page, username textbox, password textbox and login button.
//In another class, "signInObjectMethod", calling this class and sending key values using class object.

public class FBHomePagePageObject {
	
	public WebElement element;
	WebDriver driver;
	public WebElement userName_textbox(WebDriver driver) //I don't know why we have to se WebDriver driver in parameter
	{
		element = driver.findElement(By.id("email"));
		return element;
	}
	
	public WebElement password_textbox(WebDriver driver) //I don't know why we have to se WebDriver driver in parameter
	{
		element = driver.findElement(By.id("pass"));
		return element;
	}
	
	public WebElement login_btn(WebDriver driver)
	{
		element = driver.findElement(By.name("login"));
		return element;
	}
	

}
