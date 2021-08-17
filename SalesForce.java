package week2.day1.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

//Step 1: Download and set the path 
//Step 2: Launch the chromebrowser
//Step 3: Load the URL 
    //    https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk
//Step 4: Maximise the window
//Step 5: Add implicit wait
//Step 6: Fill in all the text boxes
//Step 7: Handle all the dropdowns
//Step 8: Click the check box
//Step 9: Close the browser
//*Note: No need click Start my freeTrial
public class SalesForce {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String title = driver.getTitle();
		System.out.println("We have landed in "+title);
		
		driver.findElement(By.name("UserFirstName")).sendKeys("Morgan");
		driver.findElement(By.name("UserLastName")).sendKeys("Freeman");
		driver.findElement(By.name("UserEmail")).sendKeys("morganfree@yahoo.com");
		WebElement dropDown1 = driver.findElement(By.name("UserTitle"));
		Select drop1=new Select(dropDown1);
		drop1.selectByIndex(6);
		driver.findElement(By.name("CompanyName")).sendKeys("ABB");
		WebElement drop2 = driver.findElement(By.name("CompanyEmployees"));
		Select dropDown2=new Select(drop2);
		dropDown2.selectByValue("250");
		driver.findElement(By.name("UserPhone")).sendKeys("234232354");
		WebElement drop3 = driver.findElement(By.name("CompanyCountry"));
	Select dropDown3=new Select(drop3);
	dropDown3.selectByVisibleText("India");
	driver.findElement(By.xpath("//input[@id='SubscriptionAgreement']/following-sibling::div")).click();
	
	}

}
