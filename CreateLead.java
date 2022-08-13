package week2.day1;

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
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		WebElement UName = driver.findElement(By.id("username"));
		UName.sendKeys("Demosalesmanager");
		
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("crmsfa");
		
		WebElement LoginButton = driver.findElement(By.className("decorativeSubmit"));
		LoginButton.click();
		 
		WebElement CRMClick = driver.findElement(By.linkText("CRM/SFA"));
		 CRMClick.click();
		 
		 WebElement LeadLink = driver.findElement(By.linkText("Leads"));
		 LeadLink.click();
		 
		 WebElement CreateLeadLink = driver.findElement(By.linkText("Create Lead"));
		 CreateLeadLink.click();
		 
		 WebElement Companyname = driver.findElement(By.id("createLeadForm_companyName"));
		 Companyname.sendKeys("BB");
		 
		 WebElement Firstname = driver.findElement(By.id("createLeadForm_firstName"));
		 Firstname.sendKeys("David");
		 
		 WebElement Lastname = driver.findElement(By.id("createLeadForm_lastName"));
		 Lastname.sendKeys("Cranes");
		 
		 WebElement LocalFirstName = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		 LocalFirstName.sendKeys("Dac");
		 
		 WebElement Deptname =driver.findElement(By.name("departmentName"));
		 Deptname.sendKeys("Testing");
		 
		 WebElement desc = driver.findElement(By.name("description"));
		 desc.sendKeys("This page contains the company and basic details");
		 
		 WebElement email=driver.findElement(By.name("primaryEmail"));
		 email.sendKeys("mano@testmail.com");
		  
		
		 WebElement SelectState =driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		//Select by Value
		Select state = new Select(SelectState);
		state.selectByValue("NY");
		
		WebElement createLead =driver.findElement(By.className("smallSubmit"));
		createLead.click();
		//WebElement viewTitle = driver.findElement(By.id("sectionHeaderTitle_leads"));
		String TitleDisplay =driver.getTitle();
		System.out.println(TitleDisplay);
		
		
		//driver.close();
			
		 
	}

}
