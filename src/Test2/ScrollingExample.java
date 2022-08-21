package Test2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingExample {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();   
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
		WebElement target = driver.findElement(By.xpath("//h2[text()='HTML Table Tags']"));
		
		// ======================JAVA SCRIPT =============================
	
		//JavascriptExecutor Obj= (JavascriptExecutor) driver;
       // Obj.executeScript("arguments[0].scrollIntoView();", target);   //to scroll to target text
        
        //scroll down 
      // Obj.executeScript("window.scrollTo(0,document.body.scrollHeight);");
        
       //Scroll up 
        //Obj.executeScript("window.scrollTo(0,-document.body.scrollHeight);");
        
		//=================ACTIONS =======================================
        //Above mentioned can be done by action class as well
		
        Actions Act = new Actions(driver);
        Act.sendKeys(Keys.PAGE_DOWN).build().perform();
        Act.keyDown(Keys.CONTROL).sendKeys(Keys.END).keyUp(Keys.CONTROL).build().perform();
        

		System.out.println("All done");
	}

}
