package assignmentselenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://ca.indeed.com/?from=gnav-jobsearch--jasx");

		driver.manage().window().maximize();

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println(links.size());

		for (int i = 0; i < links.size(); i++) {

			WebElement el = links.get(i);
			String url = el.getAttribute("href");

			URL link = new URL(url);

			HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();

			Thread.sleep(2000);

			httpConn.connect();

			int res = httpConn.getResponseCode();

			if (res >= 400) {
				System.out.println(url + " : is broken link");
			} else {
				System.out.println(url + " : is valid link");
			}

		}

	}

}
