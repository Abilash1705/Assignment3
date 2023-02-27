package own;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNowCall {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://dev140572.service-now.com\r\n");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.switchTo().frame(0);
	WebElement un=driver.findElement(By.id("user_name"));
	un.sendKeys("admin");
	WebElement pw=driver.findElement(By.id("user_password"));
	pw.sendKeys("P-qQ7@umSYz8");
	WebElement log=driver.findElement(By.id("sysverb_login"));
	log.click();
	driver.switchTo().defaultContent();
	WebElement fil=driver.findElement(By.id("filter"));
	fil.sendKeys("All",Keys.ENTER);
	WebElement call=driver.findElement(By.xpath("//div[text()='Callers']"));
	call.click();
	driver.switchTo().defaultContent();

	
	driver.switchTo().frame(0);

	WebElement ne=driver.findElement(By.xpath("//button[text()='New']"));
	ne.click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame(0);
	WebElement first=driver.findElement(By.id("sys_user.first_name"));
	first.sendKeys("abilash");
	WebElement last=driver.findElement(By.id("sys_user.last_name"));
	last.sendKeys("M");
	WebElement mail=driver.findElement(By.id("sys_user.email"));
	
	mail.sendKeys("abiabilash627@gmail.com");
	WebElement phone=driver.findElement(By.id("sys_user.phone"));
	phone.sendKeys("iPhone");
	WebElement phone2=driver.findElement(By.id("sys_user.mobile_phone"));
	phone2.sendKeys("samsung");
	WebElement click=driver.findElement(By.id("lookup.sys_user.title"));
	click.click();
	
	Set<String> windowHandle = driver.getWindowHandles();
	List<String> windowHandle1=new ArrayList<String>(windowHandle);
	driver.switchTo().window(windowHandle1.get(1));
	
	WebElement vice=driver.findElement(By.linkText("Vice President"));
	vice.click();
	
	Set<String> windowHandle2 = driver.getWindowHandles();
	List<String> windowHandle3=new ArrayList<String>(windowHandle2);
	driver.switchTo().window(windowHandle3.get(0));
	
	driver.switchTo().frame(0);
	WebElement insert=driver.findElement(By.id("sysverb_insert_bottom"));
	insert.click();
	
	WebElement successfull=driver.findElement(By.xpath("//div[@class='outputmsg_text']"));
	System.out.println(successfull.getText());

}



}

