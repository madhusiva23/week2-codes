package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundCheckbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("(//section[@class='innerblock']//input)[1]")).click();
		driver.findElement(By.xpath("(//section[@class='innerblock']//input)[3]")).click();
		driver.findElement(By.xpath("(//section[@class='innerblock']//input)[5]")).click();

		if (driver.findElement(By.xpath("(//section[@class='innerblock']//input)[5]")).isSelected()) {
			System.out.println("Selenium is selected");
		} else {
			System.out.println("Selenium is NOT selected");
		}
		if (driver.findElement(By.xpath("(//section[@class='innerblock']//input)[7]")).isSelected()) {
			driver.findElement(By.xpath("(//section[@class='innerblock']//input)[7]")).click();
		}
		if (driver.findElement(By.xpath("(//section[@class='innerblock']//input)[8]")).isSelected()) {
			driver.findElement(By.xpath("(//section[@class='innerblock']//input)[8]")).click();
		}
		driver.findElement(By.xpath("(//section[@class='innerblock']//input)[9]")).click();
		driver.findElement(By.xpath("(//section[@class='innerblock']//input)[10]")).click();
		driver.findElement(By.xpath("(//section[@class='innerblock']//input)[11]")).click();
		driver.findElement(By.xpath("(//section[@class='innerblock']//input)[12]")).click();
		driver.findElement(By.xpath("(//section[@class='innerblock']//input)[13]")).click();

	}

}
