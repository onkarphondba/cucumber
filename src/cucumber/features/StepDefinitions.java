package cucumber.features;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	
	@Given("^I navigated to Zoo Website$")
	public void shouldNavigateToZoo() throws Throwable { 
	System.out.println("zoo webpage");
	}

	@When("^I click on the adoption link$")
	public void shouldClickOnAdoption() throws Throwable { 
	System.out.println("Adoption link");
	}

	@Then("^I check to see that no animals are available$")
	public void checkAnimalsStringVisible() throws Throwable { 
	System.out.println("No Animals");
	}

}
