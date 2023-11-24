package stepDefinition;
import java.io.IOException;

import org.testng.Assert;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.QueuePO;

public class QueueSD extends BaseClass {
	
	@Before
	public void setup() {
		objQueue = new QueuePO();
	}
	

	
	@When("User clicks on Get Started button in the Queue pane after Logged in")
	public void user_clicks_on_get_started_button_in_the_queue_pane_after_logged_in() {
		objQueue.clickQueueGetStartedBtn();
	}
	@When("The user clicks on {string} link")
	public void the_user_clicks_on_link(String linkName) {
		if(linkName.equalsIgnoreCase("Implementation of Queue in Python"))
			objQueue.clickImplementationOfQueueInPythonLink();
		else if(linkName.equalsIgnoreCase("Implementation using collections.deque"))
			objQueue.clickImplementationUsingCollectionLink();
		else if(linkName.equalsIgnoreCase("Implementation using array"))
			objQueue.clickImplementationUsingArrayLink();
		else if(linkName.equalsIgnoreCase("Queue Operations"))
			objQueue.clickQueueOperationsLink();
	}

	@Given("The user is in the Implementation of Queue in Python page after logged in")
	public void the_user_is_in_the_implementation_of_queue_in_python_page_after_logged_in() {
		Assert.assertEquals(objQueue.checkLogoutLink(), true);//checking if logged in
		Assert.assertTrue(BaseClass.getDriver().getCurrentUrl().contains("queue/implementation-lists/"));//checking if in Implementation of Queue in Python page
	}

	@Given("The user is in the Implementation using collections.deque page")
	public void the_user_is_in_the_implementation_using_collections_deque_page() {
		Assert.assertEquals(objQueue.checkLogoutLink(), true);//checking if logged in
		Assert.assertTrue(BaseClass.getDriver().getCurrentUrl().contains("queue/implementation-collections/"));//checking if in using collections page
	
	}

	@Given("The user is in the Implementation using array page after logged in")
	public void the_user_is_in_the_implementation_using_array_page_after_logged_in() {
		Assert.assertEquals(objQueue.checkLogoutLink(), true);//checking if logged in
		Assert.assertTrue(BaseClass.getDriver().getCurrentUrl().contains("queue/Implementation-array/"));//checking if in Implementation-array page

	}

	@Given("The user is in the Queue Operations page after logged in")
	public void the_user_is_in_the_queue_operations_page_after_logged_in() {
		Assert.assertEquals(objQueue.checkLogoutLink(), true);//checking if logged in
		Assert.assertTrue(BaseClass.getDriver().getCurrentUrl().contains("queue/QueueOp/"));//checking if in queue operations page
	}


	@When("The user clicks on Try Here button")
	public void the_user_clicks_on_try_here_button() {
		objQueue.clickTryHereButton();
	}

	@When("User gives inputs from Excel file and clicks Run Button")
	public void user_gives_inputs_from_excel_file_and_clicks_run_button() throws IOException, InterruptedException {
		objQueue.getExcelData();
	}

	@Then("User go back to {string} page")
	public void user_go_back_to_page(String string) {
//		objQueue.goBack();
//		BaseClass.getDriver().navigate().back();
		BaseClass.getDriver().navigate().back();
}

	@When("The user clicks Practice Questions link")
	public void the_user_clicks_practice_questions_link() throws InterruptedException {
		System.out.println("The user clicks Practice Questions link in" + BaseClass.getDriver().getCurrentUrl());
		objQueue.clickPracticeQuestionsLink();
//		Thread.sleep(1000);

	}

@Then("The user should be in the Practice page")
public void the_user_should_be_in_the_practice_page() {
	Assert.assertTrue(BaseClass.getDriver().getCurrentUrl().contains("queue/practice"));//checking if in practice page
}

	
}

