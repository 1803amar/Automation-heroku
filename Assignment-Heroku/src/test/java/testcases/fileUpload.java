package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;


public class fileUpload {

	WebDriver driver ;
	
	@Test
	public void setupDriver() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("http://the-internet.herokuapp.com/upload");
	
	}
	

	@Test
	public void test01() throws InterruptedException {
		 
		
WebElement imageLink = driver.findElement(By.cssSelector("#file-upload")); // Replace with the actual image link
        
        imageLink.sendKeys("D:\\Amar\\doc\\Amar_Mishra_Resume_23-06-2023-16-27-59.pdf");
        driver.findElement(By.cssSelector("#file-submit")).click();
        
       String expected = driver.findElement(By.cssSelector("div[class='example'] h3")).getText();
       String actual = "File Uploaded!";
       Assert.assertEquals(expected, actual);
        
		 	}
}
