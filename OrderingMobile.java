package own;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrderingMobile {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://dev140572.service-now.com\r\n");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.switchTo().frame(0);
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("P-qQ7@umSYz8");
		driver.findElement(By.id("sysverb_login")).click();
		driver.switchTo().defaultContent();
		WebElement filter = driver.findElement(By.id("filter"));
		filter.sendKeys("Service Catalog");
		driver.findElement(By.xpath("(//div[text()='Service Catalog'])[1]")).click();
		driver.switchTo().frame(0);
		WebElement mobile = driver.findElement(By.xpath("//td[@class='homepage_category_only_image_cell']//img[@alt='Mobiles']"));
		mobile.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//span[text()='iPhone 6s offers a multitude of features packaged within cutting edge design. ']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@name='oi_order_now_button']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		WebElement num = driver.findElement(By.xpath("//a[@id='requesturl']//b"));
		String uniqNum = num.getText();

		System.out.println(uniqNum);

		WebElement verify = driver.findElement(By.xpath("//span[text()='Thank you, your request has been submitted']"));
		String verify2 = verify.getText();
		System.out.println(verify2);



	}

}
