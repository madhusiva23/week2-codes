package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundPages {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leafground.com/pages/Link.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.linkText("Go to Home Page")).click();
	driver.navigate().back();
	
	WebElement element1=driver.findElement(By.partialLinkText("Find where am supposed to"));
	System.out.println(element1.getAttribute("href"));
	
	WebElement element2=driver.findElement(By.partialLinkText("Verify a"));
	System.out.println(element2.getAttribute("href"));
	
	driver.findElement(By.xpath("(//a[contains(text(),'Go to Home')])[2]")).click();
	driver.navigate().back();
	
	WebElement element3=driver.findElement(By.partialLinkText("How many links"));
	System.out.println(element3.getAttribute("href"));
	
	
	
	
	
	
	

	}

}
