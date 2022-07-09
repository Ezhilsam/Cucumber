package com.stepdefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CucumberFirstDayStep {

	WebDriver driver;
	
	@Given("user is on the AdactinHotel page")
	public void a() {
	 WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
	@When("user should enter username and password")
	public void b() {
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("Ezhilragul");
		WebElement txtpass = driver.findElement(By.id("password"));
		txtpass.sendKeys("Ezhilsam@123");
	}
@When("user should click the login button")
	public void c() {
	WebElement btnLogin = driver.findElement(By.id("login"));	
	btnLogin.click();
	}
@Then("user should verify sucess message")
	public void d() {
	  WebElement valid = driver.findElement(By.id("username_show"));
		 String attribute = valid.getAttribute("value");
		 Assert.assertTrue("SAM",attribute.contains("Hello Ezhilragul!"));
	  
	 // driver.quit();
	  
		 
		 System.out.println("============");
		 
		 System.out.println("GIT OPERATIONS");
		 
		 System.out.println("addd on");
		 
		 
		 
		 
	  
	}
	

	
	
	
	
}
