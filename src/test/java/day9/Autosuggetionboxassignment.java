package day9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggetionboxassignment 
{
	public static void main(String[] args) throws InterruptedException
	{
         WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		driver.get("https://www.bing.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("java");
		//driver.findElement(By.xpath("//textarea[@id='sb_form_q']")).sendKeys("java");
		Thread.sleep(3000);
		List<WebElement> list=driver.findElements(By.xpath("//div[contains(@class,'sa_tm')]//span"));
		System.out.println("Number of suggestions:"+list.size());

		//select an option from list
		for(int i=0;i<list.size();i++)
		{
			String text=list.get(i).getText();
			
			if(text.equals("java download"))
			{
				list.get(i).click();
				break;
			}
			
		}
		
		
	}

}
