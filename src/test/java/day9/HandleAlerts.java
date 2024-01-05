package day9;
//1 perfrom the action on web page
//2 here we are switching to alert window it will return the alert window it is captured into alertwindow variable
// Alert: is a predefined class , alert is not a webelement
//3after click on (click for js conform) button on webpage it takes time to load the popup page so to wait for that popup window we have to use explicitwait in place of implicitwait 
//with out explicit also we can do it by point 2 but some times you get problens in that statement that's the reson we use the explicit wait
//acutall statement mean:here we were using method called (.alertIsPresent()) if alert present it returns to alertwindoew variable
//4 explicit wait declaration
//5
//alertwindow.accept(); // this will close alert window using ok button
//6
//alertwindow.dismiss();  // close alert window by using cancel button

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
public class HandleAlerts {
public static void main(String[] args) {
		
	 WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	//4 explicit wait declaration
	WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
	
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.manage().window().maximize();
	//1
	driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	
	
	
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
