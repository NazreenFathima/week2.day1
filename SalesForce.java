package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Step1: Download and set the path
		WebDriverManager.chromedriver().setup();
		
		//Step2: Launch the chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		//Step3: Lauch the URL
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		
		//Step4: Maximize the window
		driver.manage().window().maximize();
		
		//Step5: Add Implicite wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Step6: Fill in all text box
		 driver.findElement(By.name("UserFirstName")).sendKeys("Nazreen");
		 driver.findElement(By.name("UserLastName")).sendKeys("Fathima");
		 driver.findElement(By.name("UserEmail")).sendKeys("nafa@gmail.com");
		 
		 WebElement jobTitle = driver.findElement(By.name("UserTitle"));
		 Select jobTitleDD = new Select(jobTitle);
		 jobTitleDD.selectByIndex(5);
		 
		 driver.findElement(By.name("CompanyName")).sendKeys("TestLeaf");
		 
		 WebElement employees = driver.findElement(By.name("CompanyEmployees"));
		 Select employeesDD = new Select(employees);
		 employeesDD.selectByValue("250");
		 
		 driver.findElement(By.name("UserPhone")).sendKeys("9865907867");
		 
		 WebElement country = driver.findElement(By.name("CompanyCountry"));
		 Select countryDD = new Select(country);
		 //countryDD.deselectByValue("IN");
		 countryDD.selectByVisibleText("Maldives");
		
		 
		 driver.findElement(By.className("checkbox-ui")).click();
	

	}

}
