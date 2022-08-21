package Test2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();   
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
		List<WebElement>Rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println("Total no of rows are: " + Rows.size());   //total no of rows
		
		List<WebElement>Columns = driver.findElements(By.xpath("//table[@id='customers']//th"));
		System.out.println("Total no of rows are: " + Columns.size());   //total no of columns
		
		WebElement Data = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[1]"));
		System.out.println("Data at third row and column one is : " + Data.getText());   //total no of columns
		
		//WAP to find all rows and columns via for each loop
	/*	for(WebElement rrows: Rows)
		{
			List<WebElement> AllCell=rrows.findElements(By.tagName("td"));
			for(WebElement cell : AllCell)
			{
				System.out.print(cell.getText() + "\t");
			}
			System.out.println();
			
	}
	*/		
		//same code via for loop
		for (int row=1;row<=Rows.size();row++)
		{
			for(int column=1;column<=Columns.size();column++)
			{
				WebElement Cell = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[" + row + "] /* [" +column + "]"));
				System.out.println(Cell.getText()+ "\t" );
			}
			System.out.println();
		}

		//WAP to find country for selected company	
		String company ="Island Trading";
		String xpath="//td[text()='"+ company+"']/following-sibling::td[2]";
		WebElement country =driver.findElement(By.xpath(xpath));
		System.out.println("The country is : " + country.getText());	
		driver.close();

	}
	
}
