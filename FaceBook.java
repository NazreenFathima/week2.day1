package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Step1: Download and set the path
		WebDriverManager.chromedriver().setup();
		
		//Step2: Launch the Chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		//Step3: Load the URL
		driver.get("https://en-gb.facebook.com/");
		
		//Step4: MAximize the window
		driver.manage().window().maximize();
		
		//Step5: Add Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Step6: Click on Create New account
		driver.findElement(By.linkText("Create New Account")).click();
		
		//Step7: Enter the first name 
		driver.findElement(By.name("firstname")).sendKeys("Nazreen");
		
		//Step8: Enter the last name
		driver.findElement(By.name("lastname")).sendKeys("Fathima");
		
		//Step9: Enter the mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("9865789567");
		
		//Step10: Enter the password
		driver.findElement(By.id("password_step_input")).sendKeys( "TestLe@f123$");
		
		//Step11: Handle all the three drop downs
		WebElement date = driver.findElement(By.id("day"));
		Select dateDD = new Select(date);
		dateDD.selectByIndex(1);
		
		WebElement month = driver.findElement(By.id("month"));
		Select monthDD = new Select(month);
		monthDD.selectByValue("5");
		
		WebElement year = driver.findElement(By.id("year"));
		Select yearDD = new Select(year);
		yearDD.selectByVisibleText("2000");
		
		//Step12: Select the radio button "Female"
		driver.findElement(By.className("_58mt")).click();
		
	

	}

}
