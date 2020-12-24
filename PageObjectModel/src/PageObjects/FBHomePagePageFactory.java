package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FBHomePagePageFactory {

	
	public WebDriver driver;
	
	@FindBy(how=How.ID, using = "email")
	static WebElement username;
	
	@FindBy(how=How.ID, using = "pass")
	static WebElement password;
	
	@FindBy(how= How.NAME, using = "login")
	static WebElement loginIn;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Yogini\\chromedriver\\chromedriver.exe"); //location of browser in local drive
		WebDriver driver = new ChromeDriver(); 
		driver.manage().deleteAllCookies(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.navigate().to("https://facebook.com"); //this line can also be used to get to google page.
		
		Thread.sleep(1000);
		PageFactory.initElements(driver, FBHomePagePageFactory.class);
		username.sendKeys("yoginiochani");
		password.sendKeys("yoginiochani123456");
		loginIn.click();
		
		

	}

}
