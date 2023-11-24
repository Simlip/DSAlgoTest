package stepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SignIn;

public class SignInSD extends BaseClass {

//	public SignIn objSignIn;
//	public String validUserName = "Skywalkers";
//	public String validPassword = "password150@";
//	public String url = "https://dsportalapp.herokuapp.com/login";
	
	@Given("User is in the Sign In Page")
	public void user_is_in_the_sign_in_page() {
//		BaseClass.getDriver().get(url);
		objSignIn = new SignIn();
	}

	@When("I want to login with username {string} and password {string} and I clicked Login Button")
	public void i_want_to_login_with_username_and_password_and_i_clicked_login_button(String uname, String passwd) throws InterruptedException {
		
		objSignIn.setUserName(uname);
		objSignIn.setPassword(passwd);
		System.out.println("userID" + uname + " " + "password" + passwd);
//		Thread.sleep(5000);
		objSignIn.clickLoginButton();
//		Thread.sleep(1000);
	}

	@Then("I verify the {string} in step")
	public void i_verify_the_in_step(String status) throws InterruptedException {
		//Assert.assertEquals("Invalid Username and Password", objSignIn.getAlertMsg().getText());
		if(status.equalsIgnoreCase("Both Blank")) 
			System.out.println("Please fill out User Name field");
		else if(status.equalsIgnoreCase("Password Blank")) 
			System.out.println("Please fill out Password field");
		else if(status.equalsIgnoreCase("Both Invalid")) 
			System.out.println("Invalid Username and Password");			
		else if(status.equalsIgnoreCase("Password Invalid")) 
			System.out.println("Please check your Password");			
		else if(status.equalsIgnoreCase("success")) 
			System.out.println(" Username and Password are valid");			

		
//		if(status.equalsIgnoreCase("fail")) {
//		if(objSignIn.getUserName().getText()==null || objSignIn.getUserName().getText().isBlank()) {
////			objSignIn.getAlertMsg().sendKeys("Please fill out User Name field");
//			System.out.println("Please fill out User Name field");
//		}
//		else if((objSignIn.getUserName().getText()!=null || !objSignIn.getUserName().getText().isBlank()) && (objSignIn.getPassword().getText()==null || objSignIn.getPassword().getText().isBlank())) {
////			objSignIn.getAlertMsg().sendKeys("Please fill out Password field");
//			System.out.println("Please fill out Password field");
//		}
//		else if(!objSignIn.getUserName().getText().equalsIgnoreCase(validUserName) && objSignIn.getUserName().getText().equalsIgnoreCase(validPassword)) {
////			objSignIn.getAlertMsg().sendKeys("Please check your User Name");
//			System.out.println("Please check your User Name");			
//		}
//		else if(objSignIn.getUserName().getText().equalsIgnoreCase(validUserName) && !objSignIn.getUserName().getText().equalsIgnoreCase(validPassword)) {
////			objSignIn.getAlertMsg().sendKeys("Please check your Password");
//			System.out.println("Please check your Password");			
//		}
//		else if(!objSignIn.getUserName().getText().equalsIgnoreCase(validUserName) && !objSignIn.getUserName().getText().equalsIgnoreCase(validPassword)) {
////			objSignIn.getAlertMsg().sendKeys("Invalid Username and Password");
//			System.out.println("Invalid Username and Password");			
//		}
//		}
////		else if(objSignIn.getUserName().getText().equalsIgnoreCase(validUserName) && objSignIn.getUserName().getText().equalsIgnoreCase(validPassword)) {
////			objSignIn.getAlertMsg().sendKeys("Username and Password are valid");
//		else if(status.equalsIgnoreCase("success")) {
//			System.out.println(" Username and Password are valid");			
//		}
//		Thread.sleep(5000);

	}

	@Then("User should redirected to the home page if {string} is success with the message {string} {string}")
	public void user_should_redirected_to_the_home_page_if_is_success_with_the_message(String status, String uname, String msg) throws InterruptedException {
		if(status.equalsIgnoreCase("success")) {
		Assert.assertEquals(BaseClass.getDriver().getTitle(), "NumpyNinja");
		Assert.assertTrue(objSignIn.getAlertMsg().contains(msg));
		if(BaseClass.getDriver().getTitle().equalsIgnoreCase("NumpyNinja")) { 
			System.out.println(uname + " " + msg);			
		}
//		Thread.sleep(5000);
		}
	}
	
	@Then("User click Sign Out Button if {string} is success")
	public void user_click_sign_out_button_if_is_success(String status) {
		if(status.equalsIgnoreCase("success")) {
		objSignIn.clickSignOut();
		System.out.println("Successfully Signed Out");
		}
	}

}
