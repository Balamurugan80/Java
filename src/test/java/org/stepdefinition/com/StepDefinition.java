package org.stepdefinition.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
public WebDriver driver;

@Given("Launch the browser")
public void launch_the_browser() {
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	
}

@When("User have to Enter the Invalid user Id and Invalid  Password")
public void user_have_to_Enter_the_Invalid_user_Id_and_Invalid_Password() {
	
	WebElement Login = driver.findElement(By.id("email"));
	Login.sendKeys("Bala");
	
	WebElement Pwd = driver.findElement(By.id("pass"));
	Pwd.sendKeys("12345");
}

@When("User have to Click the Login Button")
public void user_have_to_Click_the_Login_Button() {
	WebElement Click = driver.findElement(By.id("loginbutton"));
	Click.click();
	
	
	
	
}

	}
	


