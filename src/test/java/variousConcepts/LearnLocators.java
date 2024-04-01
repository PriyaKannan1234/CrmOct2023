package variousConcepts;

import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

		
	public class LearnLocators {
		
	WebDriver driver;
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window();
		driver.get("https://objectspy.space/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
	
	@Test
	public void testLocators() throws InterruptedException {
  //Name locator
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		
 // Id locator
	    driver.findElement(By.id("sex-1")).click();
		
 //	File uploads
	
  	//driver.findElement(By.id("photo")).sendKeys("C:\\Users\\kanna\\Desktop\\File upload test folder\\Session 1.pptx");
	   driver.findElement(By.cssSelector("input.input-file")).sendKeys("C:\\Users\\kanna\\Desktop\\File upload test folder\\Java questionnaire.docx");

 // Link Text
 //	    driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
 // for pausing/slow down the execution
	    Thread.sleep(2000);
 
 // for going to the first page
    //  driver.navigate().back();
 
 // Partial link text - even the full link also could work
 // 	driver.findElement(By.partialLinkText("TF-API Product Backend")).click();
 // 	driver.findElement(By.partialLinkText("Backend")).click();
 // 	driver.findElement(By.partialLinkText("Product")).click();
    	
 // CSS selector TagNamet#value
 //  	         TagName.value
 //  driver.findElement(By.cssSelector("input#profession-1")).click();
 //	driver.findElement(By.cssSelector("input.input-file")).clear();
 // 	driver.findElement(By.cssSelector("input[value='Selenium Webdriver']")).click();
 //	Thread.sleep(2000);
 // if we do twice click on the same button then it would unselect the checkbox
 //	driver.findElement(By.cssSelector("input[id='tool-2'][name='tool']")).click();
 //  driver.findElement(By.cssSelector("input[id='tool-1'][name='tool']")).click();
  	

 // 	driver.findElement(By.cssSelector("a[href$='http://www.objectspy.space']")).click();
  	
 // XPath - EX: if its last name means it has to be selected the empty typing box not the whole 
 //	           last name
	    
  	driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[10]/input")).sendKeys("is fun");
  	
  	driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Welcome");
  	
  	driver.findElement(By.xpath("//input[@id='exp-4' and @name ='exp']")).click();
  	
// for text()method XPath we use only text only
// 	driver.findElement(By.xpath("//strong[text()='Link Test : Page Change']")).click();
  	
// for contains method XPath we do have pass the two arguments text(),'value'
  	driver.findElement(By.xpath("//strong[contains(text(),'Link Test : Page Change')]")).click();
    	 	
    	
	}
	
	
	
	

	
	

	
	
	//file upload
	// if the tag is input; sendKeys method will work
	// if the tag is anything then use the Robot class
	
	
	// Xpath
	// absolute
	
	// relative
	
	
	
	
}
