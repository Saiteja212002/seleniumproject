package day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeDemoassignment {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
		// to get no of frames presenr in webpage press ctrl+f you get a small popup
		// wendow type has fream or ifram you can get no.of frames list over there
		driver.switchTo().frame("mce_0_ifr");// mce_0_ifr it is the id of iframe

		driver.findElement(By.id("tinymce")).clear(); // clears box
		driver.findElement(By.id("tinymce")).sendKeys("Welcome to automation");

		driver.findElement(By.id("tinymce")).sendKeys(Keys.CONTROL + "A"); // select text

		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[@title='Bold']")).click();// bold text

	}
}
