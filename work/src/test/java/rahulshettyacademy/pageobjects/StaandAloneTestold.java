package rahulshettyacademy.pageobjects;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.List;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaandAloneTestold {

	public static void main(String[] args) {
	
		//System.setProperty("webdriver.driver.chrome","C:\\browserdrivers\\chromedriver.exe");
	//	ChromeOptions option = new ChromeOptions();
		//options for chrome 
		//option.addArguments("--disable-infobars");
		  //option.addArguments("--disable-notifications");
		//  option.addArguments("--disable-gpu");
		// option.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.		  DISMISS_AND_NOTIFY);
		 		//we need pass the below argument for Chrome Remote access)
	    //option.addArguments("--remote-allow-origins=*"); 
	    		//WebDriver driver = new ChromeDriver();- Already declared on Global level so using driver variable directly 
	    //ChromeDriver driver = new ChromeDriver(option);
		
		String ProductName = "ZARA COAT 3";
WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LandingPage landingPage = new LandingPage(driver);
		landingPage.goTo();
		landingPage.loginApplication("radhikach7@gmail.com", "Radhikach7");
		
		
		
		List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
		WebElement Prod = products.stream().filter(product->
		product.findElement(By.cssSelector("b")).getText().equals("ProductName")).findFirst().orElse(null);
		driver.findElement(By.xpath("//div[@class='container']//div[1]//div[1]//div[1]//button[2]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement((By.cssSelector(".ng-animating")))));
		
		driver.findElement(By.xpath("//button[@routerlink= '/dashboard/cart']")).click();
		//List<WebElement> cartproducts = driver.findElements(By.xpath("//div[@class= 'cart']//ul"));
	List<WebElement> cartproducts = driver.findElements(By.cssSelector(".cartSection h3"));
	 Boolean match = cartproducts.stream().anyMatch(cartproduct-> cartproduct.getText().equalsIgnoreCase(ProductName));
	Assert.assertTrue(match);

	//driver.findElement(By.cssSelector(". totalRow button ")).click();
	
	//driver.findElement(By.cssSelector(" . totalRow button ")).click();
driver.findElement(By.xpath("//button[contains(text(),'Checkout')]")).click();

		//Actions a = new Actions(driver);
		//a.sendKeys(args)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
