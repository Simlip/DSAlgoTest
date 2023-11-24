package stepDefinition;

import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pageObjects.LinkdList;

public class LinkdListSD extends BaseClass {

	@Before
	public void setUp() {
		LL = new LinkdList();
	}

	@When("User click on Get Started button below Linked List")
	public void user_click_on_get_started_button_below_linked_list() {
		LL.clickGetStrtdBtn();
	}

	@Then("User should be redirected to the linked list page")
	public void user_should_be_redirected_to_the_linked_list_page() {
		Assert.assertEquals(BaseClass.getDriver().getTitle(), "Linked List");
	}

	@When("User click on Introduction")
	public void user_click_on_introduction() {
		LL.clickIntroductn();
	}

	@Then("User should be redirected to the introduction page of linked list")
	public void user_should_be_redirected_to_the_introduction_page_of_linked_list() {
		Assert.assertEquals(BaseClass.getDriver().getTitle(), "Introduction");
	}

	@When("User  will click on Try here")
	public void user_will_click_on_try_here() {
		LL.clickTryHere();
	}

	@Then("User will land in a tryEditor page")
	public void user_will_land_in_a_try_editor_page() {

	}

	@When("User enters code from Excel and Run the code")
	public void user_enters_code_from_excel_and_run_the_code() {
		LL.getExcelData();
	}

	@Then("User navigate to back")
	public void user_navigate_to_back() {
		BaseClass.getDriver().navigate().back();
	}

	@When("User click on Creating Linked List")
	public void user_click_on_creating_linked_list() {
		LL.clickCreatngLL();
	}

	@Then("User should be redirected to the Creating Linked List page")
	public void user_should_be_redirected_to_the_creating_linked_list_page() {
		Assert.assertEquals(BaseClass.getDriver().getTitle(), "Creating Linked LIst");
	}

	@When("User should  click on Try here button on the creating Linked List page")
	public void user_should_click_on_try_here_button_on_the_creating_linked_list_page() {
		LL.clickTryHere();
	}

	@When("User click on Types of Linked List")
	public void user_click_on_types_of_linked_list() {
		LL.clickTypesofLL();
	}

	@Then("User should be redirected to the Types Of Linked List page")
	public void user_should_be_redirected_to_the_types_of_linked_list_page() {
		Assert.assertEquals(BaseClass.getDriver().getTitle(), "Types of Linked List");
	}

	@When("User should  click on Try here button on the Types of Linked List page")
	public void user_should_click_on_try_here_button_on_the_types_of_linked_list_page() {
		LL.clickTryHere();
	}

	@When("User click on Implement Linked List in Python")
	public void user_click_on_implement_linked_list_in_python() {
		LL.clickImplemntLLinPython();
	}

	@Then("User should be redirected to the Implement Linked List in Python page")
	public void user_should_be_redirected_to_the_implement_linked_list_in_python_page() {
		Assert.assertEquals(BaseClass.getDriver().getTitle(), "Implement Linked List in Python");
	}

	@When("User should  click on Try here button on the Implement Linked List page")
	public void user_should_click_on_try_here_button_on_the_implement_linked_list_page() {
		LL.clickTryHere();
	}

	@When("User click on Traversal")
	public void user_click_on_traversal() {
		LL.clickTraversal();
	}

	@Then("User should be redirected to the Traversal page")
	public void user_should_be_redirected_to_the_traversal_page() {
		Assert.assertEquals(BaseClass.getDriver().getTitle(), "Traversal");
	}

	@When("User should  click on Try here button on Traversal page")
	public void user_should_click_on_try_here_button_on_traversal_page() {
		LL.clickTryHere();
	}

	@When("User click on Insertion")
	public void user_click_on_insertion() {
		LL.clickInsertion();
	}

	@Then("User should be redirected to the Insertion page")
	public void user_should_be_redirected_to_the_insertion_page() {
		Assert.assertEquals(BaseClass.getDriver().getTitle(), "Insertion");
	}

	@When("User should  click on Try here button on the Insertion page")
	public void user_should_click_on_try_here_button_on_the_insertion_page() {
		LL.clickTryHere();
	}

	@When("User click on Deletion")
	public void user_click_on_deletion() {
		LL.clickDeletion();
	}

	@Then("User should be redirected to the Deletion page")
	public void user_should_be_redirected_to_the_deletion_page() {
		Assert.assertEquals(BaseClass.getDriver().getTitle(), "Deletion");
	}

	@When("User should  click on Try here button on the Deletion page")
	public void user_should_click_on_try_here_button_on_the_deletion_page() {
		LL.clickTryHere();
	}

	@Given("User navigate to forward")
	public void user_navigate_to_forward() {
		BaseClass.getDriver().navigate().forward();
	}

	@When("User click on Practice Questions")
	public void user_click_on_practice_questions() {
		LL.clickPracticeQue();
	}

	@Then("User should be redirected to the Practice Questions page")
	public void user_should_be_redirected_to_the_practice_questions_page() {

	}

	@Then("Title should be {string}")
	public void title_should_be(String title) {
		Assert.assertEquals(BaseClass.getDriver().getTitle(), title);
	}

}