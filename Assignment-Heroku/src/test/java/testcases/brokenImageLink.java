package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class brokenImageLink {
	
	WebDriver driver ;
	
	@Test
	public void setupDriver() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("http://the-internet.herokuapp.com/broken_images");
	
	}
	

	@Test
	public void test01() throws InterruptedException {
		 
		
WebElement imageLink = driver.findElement(By.cssSelector("img[src='asdf.jpg']")); // Replace with the actual image link
        
        Response response = RestAssured.given()
                .contentType("application/json")
                .get(imageLink.getAttribute("src"));
        
        int statusCode = response.getStatusCode();
        
        if (statusCode == 200) {
            System.out.println("For 200 status code Image is valid.");
        } else {
            System.out.println("Image link is broken because of status code : " + statusCode  );
        }
		 	}
	
	@Test
	public void test02() throws InterruptedException {
		 
		
WebElement imageLink = driver.findElement(By.cssSelector("img[src='hjkl.jpg']")); // Replace with the actual image link
        
        Response response = RestAssured.given()
                .contentType("application/json")
                .get(imageLink.getAttribute("src"));
        
        int statusCode = response.getStatusCode();
        
        if (statusCode == 200) {
            System.out.println("For 200 status code Image is valid.");
        } else {
            System.out.println("Image link is broken because of status code : " + statusCode  );
        }
		 	}
	
	@Test
	public void test03() throws InterruptedException {
		 
		
WebElement imageLink = driver.findElement(By.cssSelector("img[src='img/avatar-blank.jpg']")); // Replace with the actual image link
        
        Response response = RestAssured.given()
                .contentType("application/json")
                .get(imageLink.getAttribute("src"));
        
        int statusCode = response.getStatusCode();
        
        if (statusCode == 200) {
            System.out.println("For 200 status code Image is valid.");
        } else {
            System.out.println("Image link is broken because of status code : " + statusCode  );
        }
		 	}
	
	@Test
	public void test04() throws InterruptedException {
		 
		
WebElement imageLink = driver.findElement(By.cssSelector("img[alt='Fork me on GitHub']")); // Replace with the actual image link
        
        Response response = RestAssured.given()
                .contentType("application/json")
                .get(imageLink.getAttribute("src"));
        
        int statusCode = response.getStatusCode();
        
        if (statusCode == 200) {
            System.out.println("For 200 status code Image is valid.");
        } else {
            System.out.println("Image link is broken because of status code : " + statusCode  );
        }
		 	}

}
