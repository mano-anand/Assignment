package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement createButton = driver.findElement(By.linkText("Create New Account"));
		createButton.click();
		WebElement Firstname = driver.findElement(By.name("firstname"));
		Firstname.sendKeys("Mano");
		WebElement Surname = driver.findElement(By.name("lastname"));
		Surname.sendKeys("Anand");
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("mano@testmail.com");
		WebElement Pwd = driver.findElement(By.name("reg_passwd__"));
		Pwd.sendKeys("12345678");
		WebElement Day = driver.findElement(By.id("day"));
		Select D = new Select(Day);
		D.selectByValue("29");
		WebElement Month = driver.findElement(By.id("month"));
		Select M = new Select(Month);
		M.selectByVisibleText("Apr");
		WebElement Year = driver.findElement(By.id("year"));
		Select Y = new Select(Year);
		Y.selectByIndex(12);
		WebElement gender = driver.findElement(By.xpath("//label[text()='Female']"));
		gender.click();
				
		
	}

}
