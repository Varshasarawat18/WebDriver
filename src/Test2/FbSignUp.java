package Test2;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSignUp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();   
		driver.get("https://www.facebook.com//");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
		WebElement SignUp = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		SignUp.click();
		WebElement FirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		FirstName.sendKeys("varsha");
		WebElement SurName =driver.findElement(By.xpath("//input[@name='lastname']"));
		SurName.sendKeys("sherawat");
		WebElement EmailAddress=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		EmailAddress.sendKeys("varshatestnew@gmail.com");
		WebElement ReEnterEmail=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		ReEnterEmail.sendKeys("varshatestnew@gmail.com");
		WebElement newPassword =driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		newPassword.sendKeys("Test@1357");
		//to select dropdown values
		WebElement Day=driver.findElement(By.name("birthday_day"));
		Select ddDay=new Select(Day);  //class to select value
		ddDay.selectByVisibleText("1");
		
		WebElement Month =driver.findElement(By.name("birthday_month"));
		Select mmMonth =new Select(Month);
		mmMonth.selectByVisibleText("Jan");
		System.out.println("select month is :" + mmMonth.getFirstSelectedOption().getText());
	  //OR
	//	WebElement SelectedMonth = driver.findElement(By.xpath("//select[@name='birthday_month']/option[@selected='1']"));
		//System.out.println("Select month by xpath :" + SelectedMonth);	  
	
		WebElement Year=driver.findElement(By.name("birthday_year"));
		Select yyYear=new Select(Year);
		yyYear.selectByVisibleText("1995");

		
		//WAP to print all month value 
		//List<WebElement>Months= mmMonth.getOptions(); //another way
		List<WebElement>Months = driver.findElements(By.xpath("//select[@name='birthday_month']/option"));
		for (WebElement ele: Months)
		{
			System.out.println(ele.getText());
		}
		
		String Gender="Male";
	//	WebElement Female = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
	//	WebElement Male = driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
	//	WebElement Others = driver.findElement(By.xpath("//input[@type='radio' and @value='-1']"));

	//	if (Gender.equals("Female"))
	//	{
	//	Female.click();
	//	}else if (Gender.equals("Male"))
	//	{
	//		Male.click();
	//	}else
	//	{
	//		Others.click();
	//	}
	
		WebElement RadioButton=driver.findElement(By.xpath("//label[text()='" + Gender + "']/following-sibling::input "));   //+ operator is for string concatenation
		RadioButton.click();
		
		driver.quit();
		System.out.println("All exceuted passed");
		
		}

}
