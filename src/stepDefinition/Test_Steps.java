package stepDefinition;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	WebDriver driver;

	@When("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
        WebElement element = driver.findElement(By.xpath(".//*[@id='frmMaster']/div/header/nav/div[2]/ul/li[4]/a"));
        if(element.isDisplayed())
        	System.out.println("User is on Home Page");
        else {
			System.out.println("User is not on Home Page");
		}
	}
 
	@Given("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://cnet.smartturn.com/User/Login");
		
	}
 
	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
		driver.findElement(By.cssSelector("#EmailAddress")).sendKeys("autotest@no-spam.ws"); 	 
	    driver.findElement(By.cssSelector("#Password")).sendKeys("Test.123");
	    driver.findElement(By.cssSelector(".btn.btn-success")).click();
	}
 
	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Login Successfully");
	}
 
	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='frmMaster']/div/header/nav/div[2]/ul/li[4]/a")).click();
	}
 
	@Then("^Message displayed Logout Successfully$")
	public void message_displayed_Logout_Successfully() throws Throwable {
        System.out.println("LogOut Successfully");
	}
	@And("^Wait For$")
	public void waitFor() throws Throwable{
		Thread.sleep(3000);
	}
	@Then("^Close Browser$")
	public void close_Browser() throws Throwable{
		System.out.println("Close Browser");
		driver.quit();
	}
}

