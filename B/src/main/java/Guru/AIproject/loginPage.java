package Guru.AIproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*Test Script 01
*        ************** 
*        Test Steps
*        1)  Go to http://www.demo.guru99.com/V4/
         2) Enter valid UserId
         3) Enter valid Password
         4) Click Login
*/
public class loginPage {

	public static void main(String[] args) {
		// Setup Chrome driver
		System.setProperty("webdriver.driver.chrome", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.get(" http://www.demo.guru99.com/V4/");
		String baseUrl = "http://www.demo.guru99.com/V4/";

		// launch Firefox and direct it to the Base URL- if u want to launch from
		// firefox
		driver.get(baseUrl);
		driver.findElement(By.name("uid")).sendKeys("mngr532453");
		driver.findElement(By.name("password")).sendKeys("tEdabEb");
		driver.findElement(By.name("btnLogin")).click();

	}

}
