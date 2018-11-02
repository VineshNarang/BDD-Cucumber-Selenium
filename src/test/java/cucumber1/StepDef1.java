package cucumber1;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.io.File;
import java.io.IOException;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StepDef1 {
	
	   public static WebDriver driver;
	   public static WebDriverWait wait;
	   
	@Before
	public WebDriver getdriver()  {
		  if (driver == null) {
		 driver= new FirefoxDriver();
		  }
		  

	return driver;
	}	
	
	
	@Given("^user launch the application$")
	public void user_launch_the_application() throws Exception{
		WebDriver driver = getdriver();
		driver.get("http://localhost:8081/tdd-app-1.0/");
		driver.manage().window().maximize() ;
		//System.out.println(driver.getTitle().toString());
		Thread.sleep(3000);
		wait = new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("/html/body/h1"))));
		
		
	}
	//     /html/body/ul/li/a
	
	@Then("^user verifies the link \"([^\"]*)\"$")
	public void user_verifies_the_link(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	
     Assert.assertNotNull(driver.findElement(By.linkText(arg1)));
	}

	@Then("^user click on link \"([^\"]*)\"$")
	public void user_click_on_link(String arg1) throws InterruptedException {
	   WebElement link;
	    link = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("/html/body/ul/li/a"))));
	    link.click();
	    Thread.sleep(3000);
		driver.close();
	
	}
	
	
	
	
	
	
/*@Given("^I want to write a step with precondition$")
public void i_want_to_write_a_step_with_precondition() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	WebDriver driver = getdriver();
	driver.get("http://www.bing.com");
	Thread.sleep(3000);
	System.out.println("I am in Step Def File");
	driverClose();
    
}*/


/*@After
public void driverClose()  {
	System.out.println("I am in After Block");
	WebDriver driver = getdriver();
	
	driver.close();
driver.quit();

}*/	


}
