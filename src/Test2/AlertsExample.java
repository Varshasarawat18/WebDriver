package Test2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();   
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
		//WebElement ClickMe= driver.findElement(By.id("alertButton"));
		WebElement Button1= driver.findElement(By.xpath("//button[@id='alertButton']"));
		Button1.click();
		
		Alert alert1= driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert1.accept();
		System.out.println("All done alert1");
		
		WebElement Button3= driver.findElement(By.id("confirmButton"));
		Button3.click();
		alert1=driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert1.dismiss();   ///to click on cancel button
		System.out.println("All done alert2");
		
		WebElement Button4= driver.findElement(By.id("promtButton"));
		System.out.println(Button4.getText());
		Button4.sendKeys("Hello World");
		alert1.accept();
		System.out.println("All done for button 4");

		

	}

}
