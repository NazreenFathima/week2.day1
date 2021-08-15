package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//Step1: Launch URL
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Step2: Enter username password
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Step3: Click on Login Button
		driver.findElement(By.className("decorativeSubmit")).submit();
		
		//Step4: Click om CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Step5: Click on Leads button
		driver.findElement( By.linkText("Leads")).click();
		
		//Step6: CLick on Create Lead Button
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Step7: Enter all the fields
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nazreen");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Fathima");
		
		WebElement Source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select SourceDD = new Select(Source);
		SourceDD.selectByIndex(1);
		
		WebElement marketingCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marketingDD = new Select(marketingCampaign);
		marketingDD.selectByValue("CATRQ_AUTOMOBILE");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Nazreen");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Fathima");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mrs");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("05/20/1995");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Manager");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QualityAssurance");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("2000000");
		
		
		WebElement currency = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select currencyDD = new Select(currency);
		//currencyDD.deselectByValue("USD");
		currencyDD.selectByValue("INR");
		
		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industryDD = new Select(industry);
		industryDD.selectByValue("IND_INSURANCE");
		
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("100");
		
		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownershipDD = new Select(ownership);
		ownershipDD.selectByVisibleText("Sole Proprietorship");
		
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("Test123");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("@test@");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Description is very important");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Important notes to be notes here");
		
		//Step 8: Enter all details in Contact information
		WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countryCode.clear();
		countryCode.sendKeys("2");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("600 091");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9864987567");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Nafa");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nafa@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.nafa.com");
		
		//Step9 : Enter all details in Primary Address
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Radhika");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Preetha");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Gurusamy Street");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Vanagaram main road");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		
		WebElement Country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select countryDD = new Select(Country);
		//countryDD.deselectByValue("USA");
		countryDD.selectByValue("IND");
		
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateDD = new Select(state);
		stateDD.selectByValue("IN-TN");
		
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600 095");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("205");
		
		//Step10 : Get the first name and print it
		
		//Step11: Click on create Lead button
		driver.findElement(By.className("smallSubmit")).click();
		
		//Step12: Get and verify the title of the resulting page(View lead)
		String verifyTitle = driver.getTitle();
		String title= "View Lead | opentaps CRM";
		if(title.equals(verifyTitle))
		{
			System.out.println("Landed to correct page - View Lead");
		}
		else
		{
			System.out.println("Landed to incorrect page - Please try again");
		}
		


	}

}
