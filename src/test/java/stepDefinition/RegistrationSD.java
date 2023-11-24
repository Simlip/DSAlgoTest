package stepDefinition;

import java.util.Map;
import org.openqa.selenium.By;
import org.testng.Assert;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pageObjects.Register;

public class RegistrationSD extends BaseClass {

	@Given("User opens register page")
	public void user_opens_register_page() {
		RG = new Register();
	}

	@When("User click on Register with all fields empty")
	public void user_click_on_register_with_all_fields_empty() {
		RG.ClickRegister();
	}

	@Then("It should display an error {string} below Username textbox")
	public void it_should_display_an_error_below_username_textbox(String Text) {
		String toolTip = BaseClass.getDriver().findElement(By.xpath("//input[@name='username']")).getAttribute("validationMessage");
		Assert.assertEquals(toolTip, Text);
	}

	@When("User enters only username")
	public void user_enters_only_username(DataTable Data) {
		for (Map<String, String> data : Data.asMaps(String.class, String.class)) {
			BaseClass.getDriver().findElement(By.xpath("//input[@name='username']")).sendKeys(data.get("Username"));
			BaseClass.getDriver().findElement(By.xpath("//input[@name='password1']")).sendKeys(data.get("Password"));
			BaseClass.getDriver().findElement(By.xpath("//input[@name='password2']")).sendKeys(data.get("Password confirmation"));
		}
	}

	@When("User click on Register button with password empty")
	public void user_click_on_register_button_with_password_empty() throws InterruptedException {
		RG.ClickRegister();
	}

	@Then("It should display an error {string} below Password textbox")
	public void it_should_display_an_error_below_password_textbox(String Text) {
		String toolTip = BaseClass.getDriver().findElement(By.xpath("//input[@name='password1']")).getAttribute("validationMessage");
		Assert.assertEquals(toolTip, Text);
	}

	@When("User enters username and password")
	public void user_enters_username_and_password(DataTable Data) {
		for (Map<String, String> data : Data.asMaps(String.class, String.class)) {
			BaseClass.getDriver().findElement(By.xpath("//input[@name='username']")).sendKeys(data.get("Username"));
			BaseClass.getDriver().findElement(By.xpath("//input[@name='password1']")).sendKeys(data.get("Password"));
			BaseClass.getDriver().findElement(By.xpath("//input[@name='password2']")).sendKeys(data.get("Password confirmation"));
		}

	}

	@When("User click on Register  button with password confirmation empty")
	public void user_click_on_register_button_with_password_confirmation_empty() {
		RG.ClickRegister();

	}

	@Then("It should display an error {string} below Password confirmation textbox")
	public void it_should_display_an_error_below_password_confirmation_textbox(String Text) {
		String toolTip = BaseClass.getDriver().findElement(By.xpath("//input[@name='password2']")).getAttribute("validationMessage");
		Assert.assertEquals(toolTip, Text);
	}

	@When("User enters invalid password confirmation")
	public void user_enters_invalid_password_confirmation(DataTable Data) {
		for (Map<String, String> data : Data.asMaps(String.class, String.class)) {
			BaseClass.getDriver().findElement(By.xpath("//input[@name='username']")).sendKeys(data.get("Username"));
			BaseClass.getDriver().findElement(By.xpath("//input[@name='password1']")).sendKeys(data.get("Password"));
			BaseClass.getDriver().findElement(By.xpath("//input[@name='password2']")).sendKeys(data.get("Password confirmation"));
		}
	}

	@When("User click on Register with invalid password confirmation")
	public void user_click_on_register_with_invalid_password_confirmation() {
		RG.ClickRegister();
	}

	@Then("It should display an error {string}")
	public void it_should_display_an_error(String Msg) {
		if (BaseClass.getDriver().getPageSource().contains(Msg)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@When("User enters password with all numbers")
	public void user_enters_password_with_all_numbers(DataTable Data) {
		for (Map<String, String> data : Data.asMaps(String.class, String.class)) {
			BaseClass.getDriver().findElement(By.xpath("//input[@name='username']")).sendKeys(data.get("Username"));
			BaseClass.getDriver().findElement(By.xpath("//input[@name='password1']")).sendKeys(data.get("Password"));
			BaseClass.getDriver().findElement(By.xpath("//input[@name='password2']")).sendKeys(data.get("Password confirmation"));
		}
	}

	@When("User click on Register button with invalid password")
	public void user_click_on_register_button_with_invalid_password() {
		RG.ClickRegister();
	}

	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password(io.cucumber.datatable.DataTable Data) {
		for (Map<String, String> data : Data.asMaps(String.class, String.class)) {
			BaseClass.getDriver().findElement(By.xpath("//input[@name='username']")).sendKeys(data.get("Username"));
			BaseClass.getDriver().findElement(By.xpath("//input[@name='password1']")).sendKeys(data.get("Password"));
			BaseClass.getDriver().findElement(By.xpath("//input[@name='password2']")).sendKeys(data.get("Password confirmation"));
		}
	}

	@When("User click Register button with valid crediantials")
	public void user_click_register_button_with_valid_crediantials() throws InterruptedException {
		RG.ClickRegister();
	}

	@Then("User should be redirected to the home page with the message {string}<Username>{string}")
	public void user_should_be_redirected_to_the_home_page_with_the_message_username(String Message, String Username) {
		Assert.assertTrue(BaseClass.getDriver().findElement(By.xpath("//div[@role='alert']")).getText().contains(Message));
		BaseClass.getDriver().findElement(By.linkText("Sign out")).click();
	}
}