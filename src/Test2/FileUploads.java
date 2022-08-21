package Test2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploads {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();  		
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);

		WebElement Upload = driver.findElement(By.id("uploadfile_0"));
		Upload.sendKeys("C:\\Users\\Asus\\Downloads\\text.txt");
		
		WebElement TCn=driver.findElement(By.id("terms"));
		TCn.click();
		
		WebElement Submit=driver.findElement(By.id("submitbutton"));
		Submit.click();
	}

}
