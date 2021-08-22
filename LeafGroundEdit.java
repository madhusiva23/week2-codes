package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundEdit {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String title = driver.getTitle();
		System.out.println("We have landed on " + title);

		driver.findElement(By.id("email")).sendKeys("asd@abc.com");
		driver.findElement(By.xpath("//input[contains(@value,'Append')]")).sendKeys("extra");
		String attribute = driver.findElement(By.xpath("//input[@value='TestLeaf']")).getAttribute("value");
		System.out.println("attribute: " + attribute);
		driver.findElement(By.xpath("//input[contains(@value,'Clear')]")).clear();
		boolean enabled = driver.findElement(By.xpath("(//div[contains(@class,'example')])[5]//input")).isEnabled();
		if (!enabled) {
			System.out.println("The field is disabled!!");
		} else {
			System.out.println("The fiels is enabled!");
		}

	}

}
