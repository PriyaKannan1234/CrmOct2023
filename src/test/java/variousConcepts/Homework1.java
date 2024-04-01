package variousConcepts;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		// Initiating & launching the webBrowser

	   System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().deleteAllCookies();
	   driver.get("https://codefios.com/ebilling/login");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		  driver.findElement(By.id("user_name")).sendKeys("demo@codefios.com");
		  driver.findElement(By.name("password")).sendKeys("abc123");
		  driver.findElement(By.id("login_submit")).click();
		 
	      driver.findElement(By.xpath("//a[@title='Company']")).click();
		  driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		  driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys("test12$");
		  driver.findElement(By.xpath("//input[@id='company_email']")).sendKeys("test123@gmail.com");
		  driver.findElement(By.xpath("//input[@id='company_phone']")).sendKeys("1231234567");
		  driver.findElement(By.xpath("//button[@id='companyformsubmit']")).click();
		  Thread.sleep(3000);
		  
		//  driver.close();
	}
	
}
