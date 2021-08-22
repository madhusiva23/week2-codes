package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundButton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//button[@id='home']")).click();
		driver.findElement(By.xpath("(//div[@class='wp-landing-categories']//h5)[2]")).click();

		Point location = driver.findElement(By.xpath("//label[contains(text(),'position')]")).getLocation();
		System.out.println("loc of button: " + location);

		String cssValue = driver.findElement(By.xpath("(//section[@class='innerblock']//button)[3]"))
				.getCssValue("background-color");
		System.out.println("Color of button: " + cssValue);

		Dimension size = driver.findElement(By.xpath("(//section[@class='innerblock']//button)[4]")).getSize();
		System.out.println("Size of the button: " + size);
	}

}
