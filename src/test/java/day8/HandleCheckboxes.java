package day8;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//1 one checkbox
//2 total check box
//3 Select all the checkboxes
//4 Select last 2 checkboxes
//5 Select first 2 chekboxes
//6 clear/Uncheck checkboxes
public class HandleCheckboxes {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		// 1
		// select specific one checkbox
		// driver.findElement(By.xpath("//input[@id='monday']")).click();
		// 2
		// total number of checkboxes
		List<WebElement> checkboxes = driver
				.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println("Total number of checkboxes:" + checkboxes.size()); // 7
		// 3
		// 3i
		// Select all the checkboxes
		/*
		 * for(int i=0;i<checkboxes.size();i++) { checkboxes.get(i).click(); }
		 */
		// 3ii
		/*
		 * for(WebElement chkbox:checkboxes) { chkbox.click(); }
		 */
		// 4
		// Select last 2 checkboxes
		// total Number of checkboxes-how many checkboxes to be selected= startign index
		// 7-3= 4 ( startign index)
		/*
		 * for(int i=4;i<checkboxes.size();i++) { checkboxes.get(i).click(); }
		 */
		// 5
		// Select first 2 chekboxes
		// 5i
		/*
		 * for(int i=0;i<3;i++) { checkboxes.get(i).click(); }
		 */
		// 5ii
		/*
		 * for(int i=0;i<checkboxes.size();i++) { if(i<2) { checkboxes.get(i).click(); }
		 * }
		 */
		// 6
		// clear/Uncheck checkboxes: if it is selected once adain if it is selected one
		// more time then it clear or uncheak automatically

		// Using normal for loop
		for (int i = 0; i < 3; i++) {
			checkboxes.get(i).click();
		}

		Thread.sleep(4000);

		/*
		 * for(int i=0;i<checkboxes.size();i++) { if(checkboxes.get(i).isSelected()) {
		 * checkboxes.get(i).click(); } }
		 */

		for (WebElement chkbox : checkboxes) {
			if (chkbox.isSelected()) {
				chkbox.click();
			}
		}

	}
}
