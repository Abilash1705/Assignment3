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

public class ServiceNowMand {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://dev140572.service-now.com");
		driver.switchTo().frame(0);
		WebElement user=driver.findElement(By.id("user_name"));
		user.sendKeys("admin");
		WebElement pass=driver.findElement(By.id("user_password"));
		pass.sendKeys("P-qQ7@umSYz8");
		WebElement Button1=driver.findElement(By.id("sysverb_login"));
		Button1.click();
		WebElement fil=driver.findElement(By.id("filter"));
		fil.sendKeys("proposal");
		WebElement myprop=driver.findElement(By.xpath("//div[text()='My Proposals']"));
		myprop.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		WebElement New=driver.findElement(By.xpath("//button[text()='New']"));
		New.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);

		WebElement ff=driver.findElement(By.id("std_change_proposal.short_description"));
		ff.sendKeys("abilash");
		WebElement subm=driver.findElement(By.xpath("(//button[text()='Submit'])[1]"));
		subm.click();
		
		WebElement create=driver.findElement(By.xpath("//td[contains(text(),'abilash')]"));
		String nn=create.getText();
	String name = "abilash";
		if(nn.contains(name)) {
			System.out.println("successfully created");
			
			
		}
	
		
		
	}

}
