package Test2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();   
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
		WebElement From=driver.findElement(By.xpath("//li[@id='credit2']"));
		WebElement To =driver.findElement(By.xpath("//ol[@class='field14 ui-droppable ui-sortable']/li"));
		
		Actions Act = new Actions(driver);  // need to pass driver as constructor Action is class provided by selenium
		Act.dragAndDrop(From,To).build().perform();   //drag and drop 
		

	}

}
