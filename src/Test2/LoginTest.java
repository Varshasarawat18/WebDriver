package Test2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();   //As webdriver is abstract class we cannot create
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
		//step1.click on login 
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();
		//Step 2.enter user name
		WebElement UserName= driver.findElement(By.name("user_login"));
		UserName.sendKeys("varshasarawat18@gma.com");
		//Step 3.enter password
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Simpli@123");
		//Step 4 Click on remember me checkbox
		WebElement Remember=driver.findElement(By.className("rememberMe"));
		Remember.click();
		//Step 5 click login button 
		WebElement LoginClick = driver.findElement(By.name("btn_login"));
		LoginClick.click();
		
		// step 6 to validate error
		WebElement Error=driver.findElement(By.id("msg_box"));
		
		String ActError=Error.getText();
		String ExpError="The email or password you have entered is invalid.";
		if(ActError.equals(ExpError))
		{
			System.out.println("TC passed");;
		}
		else
		{
			System.out.println("TC failed");
	
	}
		List<WebElement> links=driver.findElements(By.tagName("a"));   //a is for attributes
		System.out.println("total no of links:" + links.size());
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getAttribute("href"));  //all link
		}
		
		driver.close();
	}
}
