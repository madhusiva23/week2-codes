package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundRadio {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='yes']")).click();
		if (driver.findElement(By.xpath("(//input[@type='radio'])[3]")).isSelected()) {
			System.out.println("Unchecked is selected");
		} else {
			System.out.println("Checked is selected");
		}
		if (driver.findElement(By.xpath("(//input[@type='radio'])[6]")).isSelected()) {
			System.out.println("rightly selected as 20-40years");
		} else {
			System.out.println("not selected correctly");
		}
	}

}
