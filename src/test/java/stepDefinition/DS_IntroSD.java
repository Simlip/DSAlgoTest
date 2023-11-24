package stepDefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;
import pageObjects.DS_Introduction;

public class DS_IntroSD extends BaseClass {
	@Given("User is in Sign in page")
	public void user_is_in_sign_in_page() {
	    DS = new DS_Introduction();
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String Uname, String Pwd) throws InterruptedException {
		System.out.println("Enter Username");
		DS.enterUsername("skywalkers");
		DS.enterPassword("password150@");
	}

	@When("User click on login")
	public void user_click_on_login() {
		DS.clickLogin();
	}

	@Then("User should be redirected to the home page")
	public void user_should_be_redirected_to_the_home_page() {

	}

	@When("User click on Get started button below DS introduction")
	public void user_click_on_get_started_button_below_ds_introduction() {
		DS.clickGetStarted();
	}

	@Then("User should land in DS intro. page")
	public void user_should_land_in_ds_intro_page() {

	}

	@When("User click on Time Complexity button")
	public void user_click_on_time_complexity_button() {
		DS.clickTimeComplexity();
	}

	@Then("User should land in Time Complexity of DS intro.")
	public void user_should_land_in_time_complexity_of_ds_intro() {

	}

	@When("User click on Practice Questions button")
	public void user_click_on_practice_questions_button() {
		DS.clickPracticeQue();
	}

	@Then("User should be redirected to Practice Questions of DS intro.")
	public void user_should_be_redirected_to_practice_questions_of_ds_intro() {

	}

	@Then("User should navigate to back")
	public void user_should_navigate_to_back() {
		BaseClass.getDriver().navigate().back();
	}

	@When("User click on Try here button")
	public void user_click_on_try_here_button() {
		DS.clickTryHere();
	}

	@Then("User should be redirected to a page having tryEditor with a Run button to test")
	public void user_should_be_redirected_to_a_page_having_try_editor_with_a_run_button_to_test() {

	}

	@When("User enters code from Excel and Run")
	public void user_enters_code_from_excel_and_run() throws IOException, InterruptedException {
		DS.getExcelData();

	}

}
