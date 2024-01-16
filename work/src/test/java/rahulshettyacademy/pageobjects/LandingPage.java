package rahulshettyacademy.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
WebDriver driver;
	public LandingPage(WebDriver driver)
	{//this will initializate first in landing page class
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
		
			//WebElement userEmail =  driver.findElement(By.id("userEmail"));
	//driver.findElement(By.id("userPassword")).sendKeys("Radhikach7");
	//	driver.findElement(By.id("login")).click();
		//Page Factory 
		@FindBy(id="userEmail")
		WebElement userEmail;
		
		@FindBy(id="userPassword")
		WebElement passwordEle;
		
		@FindBy(id="login")
		WebElement submit;
			
public void  loginApplication(String email,  String password )
{	userEmail.sendKeys(email);
	passwordEle.sendKeys(password);
	submit.click();
	}	
public void goTo()
{
	driver.get("https://rahulshettyacademy.com/client/");
	}
}
