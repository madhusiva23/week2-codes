package week2.day1.assignments;
//Step 1: Download and set the path 
//Step 2: Launch the chromebrowser
//Step 3: Load the URL https://en-gb.facebook.com/
//Step 4: Maximise the window
//Step 5: Add implicit wait
//Step 6: Click on Create New Account button
//Step 7: Enter the first name
//Step 8: Enter the last name
//Step 9: Enter the mobile number
//Step 10: Enterthe password
//Step 11: Handle all the three drop downs
//Step 12: Select the radio button "Female" 
 //        ( A normal click will do for this step) 

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Tom");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ethan");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("923479234");
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("tomEthan2");
		WebElement date = driver.findElement(By.id("day"));
		Select dateDrop=new Select(date);
		dateDrop.selectByVisibleText("23");
		
		WebElement month = driver.findElement(By.id("month"));
		Select monthDrop=new Select(month);
		monthDrop.selectByValue("8");
		
		WebElement year = driver.findElement(By.id("year"));
		Select yearDrop=new Select(year);
		yearDrop.selectByVisibleText("1991");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		
	}

}
