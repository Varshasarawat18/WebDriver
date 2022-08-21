package Test2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginXpath {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();   //As webdriver is abstract class we cannot create object of the same so we can write webdriver driver=new webdriver
		driver.get("https://www.facebook.com//");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
		WebElement username=driver.findElement(By.xpath("//input[@name='email']"));
		WebElement password =driver.findElement(By.xpath("//input[@type='password']"));
		WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		username.sendKeys("varshasaras.com");
		password.sendKeys("Abc@1234");
		login.click();
		System.out.println("Login done success");
		driver.quit();

	}

}
