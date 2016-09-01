package cucumber.features;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinitionsWeb {
	
	File pathToBinary = new File("C:\\Users\\ophondba\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
	FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
	FirefoxProfile firefoxProfile = new FirefoxProfile(); 
	WebDriver driver = null;
	
	@Given("^I am on website$")
	public void shouldNavigateToWebsite() throws Throwable {
	 driver = new FirefoxDriver(ffBinary,firefoxProfile);
	 driver.navigate().to("http://www.tutorialspoint.com/cucumber/");
	}

	@When("^I click on link$")
	public void shouldClickOnLink() throws Throwable {
	 driver.findElement(By.id("search-string")).click();   
	}

	@And("^populate the link form$")
	public void shouldPopulateForm() throws Throwable {
	 driver.findElement(By.name("search_string")).sendKeys("selenium");
	 driver.findElement(By.id("Search Jobs")).click();
	}

	@Then("^I should be on correct page$")
	public void pageshouldbeDisplayed() throws Throwable {
	 Assert.assertTrue("Not on correct page", driver.getTitle().equals("Job Search via tutorialspoint")); 
	}

}
