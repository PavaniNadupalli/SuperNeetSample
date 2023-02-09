package SuperNeetIndia;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateStudent {

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
		
		driver.findElement(By.xpath("//span[text()='Log In Now']")).click();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//p[text()='Student']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("UploadNewStudent")).click();
		
		
		driver.findElement(By.id("UserName")).sendKeys("User name automate");
		
		driver.findElement(By.id("Email")).sendKeys("testAutomate@gmail.com");
		
		driver.findElement(By.id("studentaddress")).sendKeys("Address bangalore");
		
		driver.findElement(By.id("studentmarks")).sendKeys("Marks sample");
		
		driver.findElement(By.id("studentPhoneNumber")).sendKeys("2356895623");
		
		driver.findElement(By.id("studentFile")).sendKeys("C:\\Users\\User\\OneDrive\\Desktop\\pexels-pok-rie-130576.jpg");
		
		driver.findElement(By.id("Password")).sendKeys("Password");
		
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Password");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("CreateNewStudent")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.xpath("//button[text()='OK']")).click();
	    driver.findElement(By.xpath("(//button[text()='Close'])[2]")).click();
	}

}
