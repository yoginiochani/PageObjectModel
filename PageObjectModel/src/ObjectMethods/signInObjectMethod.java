package ObjectMethods;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObjects.FBHomePagePageObject;

public class signInObjectMethod {  						//creating another class called singinObjectMethod where I created signin Method below
	
	public void signIn(WebDriver driver) throws InterruptedException  //created signIn method for facebook login page
	{
		FBHomePagePageObject object = new FBHomePagePageObject();  //created object of another class in here and imported that class in here.
		object.userName_textbox(driver).sendKeys("yoginiochani");  //now, using object, sending value for username and password text box using 
																	//methods which are created in other class. called those methods using object.
		Thread.sleep(1000);							
		object.password_textbox(driver).sendKeys("yoginiochani1234"); 
	}
	
	//launching web browser now
	/*
	 * if you want to use TestNG annotation, then you can add this below line instead of main method line. 
	 * And add TestNG library too.
	 * 
	 * @Test
	 * public void testcase() throws InterruptedException
	*/
	public static void main(String[] args) throws InterruptedException
	{   //launching web browser from main method
		System.setProperty("webdriver.chrome.driver", "C:\\Yogini\\chromedriver\\chromedriver.exe"); //location of browser in local drive
		WebDriver driver = new ChromeDriver(); 
		driver.manage().deleteAllCookies(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.navigate().to("https://facebook.com"); //this line can also be used to get to google page.
		
		signInObjectMethod obj = new signInObjectMethod(); //created object of the class
		obj.signIn(driver);  //calling method using this object.
		
		driver.close();
	}

}

