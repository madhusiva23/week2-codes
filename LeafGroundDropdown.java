package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundDropdown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement dropDown1 = driver.findElement(By.id("dropdown1"));
		Select drpDown1 = new Select(dropDown1);
		drpDown1.selectByIndex(1);

		WebElement dropDown2 = driver.findElement(By.name("dropdown2"));
		Select drpDown2 = new Select(dropDown2);
		drpDown2.selectByVisibleText("Appium");

		WebElement dropDown3 = driver.findElement(By.id("dropdown3"));
		Select drpDown3 = new Select(dropDown3);
		drpDown3.selectByValue("3");

		WebElement dropDown4 = driver.findElement(By.xpath("(//div[@id='contentblock']//select)[4]"));
		Select drpDown4 = new Select(dropDown4);
		int size3 = drpDown4.getOptions().size();
		System.out.println("Size of drop down "+size3);

		driver.findElement(By.xpath("(//div[@id='contentblock']//select)[5]")).sendKeys("Selenium");
		WebElement dropDown6 = driver.findElement(By.xpath("(//section[@class='innerblock']//select)[6]"));
		Select drpDown6 = new Select(dropDown6);
		drpDown6.selectByIndex(4);

	}

}
