package day22;
//methods covered is isDisplayed(),isEnabled()
//1 logo
//2 search box
//isSelected()
//3 radio button
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ConditionalCommands 
{
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); //--->same as usual
		
		WebDriver driver=new ChromeDriver(); //---> same as usual but we pass 'options'
	
	//WebDriver driver=new ChromeDriver();
	
	driver.get("http://demo.nopcommerce.com/register");
	driver.manage().window().maximize();	
	//  logo ()
	//it used to display logo is present or not either we can also use another from in boolean method it is (2)
	//(1)
//	WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
//	System.out.println("displsy status of logo:"+logo.isDisplayed());
	
	//(2)
//	boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
//	System.out.println(status);//it prints the true or false;
	
	//searchbox status
//	WebElement searchbox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
//	System.out.println("Dispay status:"+searchbox.isDisplayed());
//	System.out.println("Enable status:"+searchbox.isEnabled());
	
	//(3) radio buttons
	
	WebElement male_rd=driver.findElement(By.xpath("//input[@id='gender-male']"));
	WebElement female_rd=driver.findElement(By.xpath("//input[@id='gender-female']"));
	
	//Before selection
	System.out.println("Before selection...............");
	System.out.println(male_rd.isSelected()); //false
	System.out.println(female_rd.isSelected()); //false
	
	//After selection of male radio button
//	System.out.println("After selection of male radiop button............");
//	male_rd.click();
//	System.out.println(male_rd.isSelected()); //true
//	System.out.println(female_rd.isSelected()); //false
			
	
	//After selection of fe-male radio button
	System.out.println("After selection of female radiop button............");
	female_rd.click();
	System.out.println(male_rd.isSelected()); //false
	System.out.println(female_rd.isSelected()); //true
					
}

}
