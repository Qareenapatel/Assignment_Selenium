package assignmentselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollUp_Down {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		
		driver.findElement(By.xpath("//a[@id='menu_directory_viewDirectory']")).click();
		
		
		Actions atc = new Actions(driver);
		atc.sendKeys(Keys.PAGE_DOWN).build().perform();

		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//b[contains(text(),'Charlie Carter')]"));

		
		atc.sendKeys(Keys.PAGE_UP).build().perform();
		
		driver.findElement(By.xpath("//input[@id='searchBtn']"));
		Thread.sleep(3000);

		
		
	}


	}


