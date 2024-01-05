package day9;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlertsassignment 
{
	public static void main(String[] args) throws InterruptedException
	{
         WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		//4 explicit wait declaration
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();

		
		//2
		//Alert alertwindow=driver.switchTo().alert();
		//3
		Alert alertwindow=mywait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println(alertwindow.getText());
		//5
		//alertwindow.accept(); // this will close alert window using ok button
		//6
		alertwindow.dismiss();  // close alert window by using cancel button
		
	}

}
