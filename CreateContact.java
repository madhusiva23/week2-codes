package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Tom");
		driver.findElement(By.id("lastNameField")).sendKeys("Hanks");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("tom");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Han");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("R&D");
		driver.findElement(By.id("createContactForm_description")).sendKeys("colleague");
		System.out.println("Description " + driver.findElement(By.id("createContactForm_description")).getText());
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("tom@abb.com");
		WebElement dropDown1 = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select drop1 = new Select(dropDown1);
		drop1.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();

		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("update comments");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println("Title " + driver.getTitle());

	}

}
