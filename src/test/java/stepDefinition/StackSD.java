package stepDefinition;
import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Stacks;

public class StackSD extends BaseClass {
	@Before
	public void setup() {
		objStacks = new Stacks();
	}
	
	
	
@When("user enters username {string} and password {string}")
public void user_enters_and(String userName, String passwd) {

		objStacks.setUserName("skywalkers");
		objStacks.setPassword("password150@");
}
@When("User click on Login button")
public void user_click_on_login_button() {
		objStacks.clickLoginButton();
}
@Then("User should be redirected to the homepage")
public void user_should_be_redirected_to_the_homepage() {

}
@When("User clicks on Get Started button in the Stack pane after Logged in")
public void user_clicks_on_get_started_button_in_the_stack_pane_after_logged_in() {
	objStacks.clickStackGetStartedBtn();
}
//@Then("The user should be redirected to {string} Page")
//public void the_user_should_be_redirected_to_page(String title) {
//    // Write code here that turns the phrase above into concrete actions
//	Assert.assertEquals(BaseClass.getDriver().getTitle(), title);
//}
@Given("The user is in the Stack page after logged in")
public void the_user_is_in_the_stack_page_after_logged_in() {
	Assert.assertEquals(objStacks.checkLogoutLink(), true);//checking if logged in
	Assert.assertEquals(BaseClass.getDriver().getTitle(), "Stack");
}
@When("The user clicks {string} link")
public void the_user_clicks_link(String linkName) {
	if(linkName.equalsIgnoreCase("Operations in Stack"))
		objStacks.clickOperationsInStackButton();
	else if(linkName.equalsIgnoreCase("Implementation"))
		objStacks.clickImplementationButton();
	else if(linkName.equalsIgnoreCase("Applications"))
		objStacks.clickApplicationsButton();
}
@Then("The user should be directed to {string} Page")
public void the_user_should_be_directed_to_page(String title) {
	Assert.assertEquals(BaseClass.getDriver().getTitle(), title);
}
@Given("The user is in the Operations in Stack page after logged in")
public void the_user_is_in_the_operations_in_stack_page_after_logged_in() {
	Assert.assertEquals(objStacks.checkLogoutLink(), true);//checking if logged in
	Assert.assertTrue(BaseClass.getDriver().getCurrentUrl().contains("stack/operations-in-stack/"));//checking if in operations-in-stack page
}

@When("The user clicks Try Here button")
public void the_user_clicks_try_here_button() {
	objStacks.clickTryHereButton();
}

@Then("The user should be redirected to tryEditor page")
public void the_user_should_be_redirected_to_try_editor_page() {
	Assert.assertTrue(BaseClass.getDriver().getCurrentUrl().contains("/tryEditor"));//checking if in Try Editor page
    
}

@When("User gives inputs from Excel and clicks Run Button")
public void user_gives_inputs_from_excel_and_clicks_run_button() throws IOException, InterruptedException {
	
	objStacks.getExcelData();
	
//	objStacks.writeEditor("print 'Hello'");
//    if(!objStacks.getEditorValue().isBlank()) {
//    	objStacks.clickRun();
//    }
}

@Then("User gets output or alert message based on input")
public void user_gets_output_or_alert_message_based_on_input() {
    // Write code here that turns the phrase above into concrete actions
//    if(!objStacks.getOutput().isBlank())
//    {
//    	System.out.println("You successfully wrote in python");
//    			
//    }
//    else
//       	System.out.println("Please write your code in python");
//    Assert.assertTrue(!objStacks.getOutput().isBlank(), "You successfully wrote in python");    	
}

//@Then("User navigates back to {String} page")
//public void user_navigates_back_to_page(String title) {
//    // Write code here that turns the phrase above into concrete actions
//	objStacks.goBack();
//}

@Then("User navigates back to {string} page")
public void user_navigates_back_to_page(String string) throws InterruptedException {
	BaseClass.getDriver().navigate().back();
//	BaseClass.goBack();
//	objStacks.goBack();
//	Thread.sleep(5000);
}

@Given("The user is in the Implementation page")
public void the_user_is_in_the_implementation_page() {
	Assert.assertEquals(objStacks.checkLogoutLink(), true);//checking if logged in
	Assert.assertTrue(BaseClass.getDriver().getCurrentUrl().contains("stack/implementation/"));//checking if in implementation page
    
}

@Given("The user is in the Applications page after logged in")
public void the_user_is_in_the_applications_page_after_logged_in() {
	Assert.assertEquals(objStacks.checkLogoutLink(), true);//checking if logged in
	Assert.assertTrue(BaseClass.getDriver().getCurrentUrl().contains("stack/stack-applications/"));//checking if in application page
    
}

@Given("The user navigates forward")
public void the_user_navigates_forward() {
	BaseClass.getDriver().navigate().forward();    
//	BaseClass.goForward();
}

@When("The user clicks Practice Questions button")
public void the_user_clicks_practice_question_button() {
	objStacks.clickPracticeQuestionsLink();
}

@Then("The user should be in the {string} page")
public void the_user_should_be_in_the_page(String string) {
	Assert.assertTrue(BaseClass.getDriver().getCurrentUrl().contains("stack/practice"));//checking if in practice page
    
}


	
}

