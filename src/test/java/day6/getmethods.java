package day6;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getmethods 
{
public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	
	System.out.println("title of the page:"+driver.getTitle());
	
	System.out.println("Current URL:"+ driver.getCurrentUrl());
			
	/*System.out.println("Page source......................");
	String ps=driver.getPageSource();
	System.out.println(ps);
	System.out.println(ps.contains("html"));*/
	
	//System.out.println(driver.getWindowHandle()); 

	//Thread.sleep(3000);
	driver.findElement(By.linkText("OrangeHRM, Inc")).click(); // opens new browser window
	
	Set<String> windowids=driver.getWindowHandles();
	
	for(String winid:windowids)
	{
		System.out.println(winid);  
	}
}

}
