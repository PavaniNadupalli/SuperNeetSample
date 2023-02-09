package SuperNeetIndia;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSuperNeet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev.superneetindia.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		
		driver.findElement(By.xpath("//a[@class= 'sign-in-btn']")).click();
		
		driver.findElement(By.id("LoginAs")).click();
		driver.findElement(By.xpath("//option[@value = '3']")).click();
		
		
		driver.findElement(By.id("emailid1")).sendKeys("test2@gmail.com");
		driver.findElement(By.id("txrPassword")).sendKeys("welcome@123");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='Log In Now']")).click();
		
	

	}

}
