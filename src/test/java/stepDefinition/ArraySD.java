package stepDefinition;

	import java.io.IOException;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.interactions.Actions;
	import org.testng.Assert;
	import io.cucumber.java.Before;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import pageObjects.DS_Array;
	


	public class ArraySD extends BaseClass {

		@Before
		public void setup() {
			array = new DS_Array();
		}

		@Given("User is navigated to the Home page")
		public void user_is_navigated_to_the_Home_page() {

		}

		@When("User clicks on Get Started button of Array Data Structure")
		public void user_clicks_on_get_started_button_of_array_data_structure() {
			array.Clickgetstrtd();
		}

		@Then("User is navigated to the Array page")
		public void user_is_navigated_to_the_array_page() {

		}

		@Then("The page title is {string}")
		public void the_page_title_is(String title) {
	       String header= BaseClass.getDriver().getTitle();
	       Assert.assertEquals(header, title);
	       System.out.println(header);
		}

		@When("User clicks on Arrays in Python button")
		public void user_clicks_on_arrays_in_python_button() {
			//array = new DS_Array();
		    array.Clickarrayinpython();
		}

		@Then("The user is navigated to the page where the header is {string}")
		public void the_user_is_navigated_to_the_page_where_the_header_is(String header) {
			String titleofpage = BaseClass.getDriver().getTitle();
	        Assert.assertEquals(titleofpage,header);  
	        System.out.println(titleofpage);
		}

		/*@When("User scrolls down to the end of the page")
		public void user_scrolls_down_to_the_end_of_the_page() {
		  JavascriptExecutor js = (JavascriptExecutor)BaseClass.getDriver();
		   js.executeScript("window.scrollBy(0,3000)");
		}*/

		@When("User click on Try here buttton")
		public void user_click_on_try_here_buttton() {
		   array.Clicktryhere();
		}

		@Then("User is taken to a Try Editor page")
		public void user_is_taken_to_a_try_editor_page() {

		}

		@Then("User enters code from excel and clicks Run")
		public void user_enters_code_from_excel_and_clicks_Run() throws IOException, InterruptedException {
			array.getExcelData();

		}


		@Then("User navigates back to the previous page")
		public void user_navigates_back_to_the_previous_page() {
		 BaseClass.goBack();
		}

		/*@When("User scrolls back up")
		public void user_scrolls_back_up() {
			JavascriptExecutor js = (JavascriptExecutor)BaseClass.getDriver();
			js.executeScript("window.scrollBy(0,-3000");
		}*/

		@When("User clicks on the Arrays Using List option")
		public void user_clicks_on_the_arrays_using_list_option() {
			//array = new DS_Array();
	            array.Clickarraysusinglist();
		}

		@When("User clicks on the Basic Operations in Lists option")
		public void user_clicks_on_the_basic_operations_in_lists_option() {
			//array = new DS_Array();
		 array.Clickbasicoperationsinlist();
		}

		@When("User clicks on the Applications of Array option")
		public void user_clicks_on_the_applications_of_array_option() {
			//array = new DS_Array();
		      array.Clickapplicationsofarray();
		}

		/*@When("User navigates one page forward")
		public void user_navigates_one_page_forward() {
		 array.Clickgetstrtd();
		 BaseClass.getDriver().navigate().forward();
		}*/

		@Then("User clicks on the Practice Questions option")
		public void user_clicks_on_the_practice_questions_option() {
	       array.Clickpracticequestions();
		}

		@Then("The user is navigated to the page having four questions")
		public void the_user_is_navigated_to_the_page_having_four_questions() {

		}

		@When("The user clicks on the Search the Array option")
		public void the_user_clicks_on_the_search_the_array_option() {
	          array.ClickquesA();

		}

		@Then("The user is navigated to the Question page")
		public void the_user_is_navigated_to_the_question_page() throws InterruptedException {

			  BaseClass.getDriver().findElement(By.xpath("//div[5]/div/pre"));

			    Actions a = new Actions(BaseClass.getDriver());

				a.sendKeys("def element_exists(lst, element):", Keys.ENTER).build().perform();
				a.sendKeys("try:", Keys.ENTER).build().perform();
				a.sendKeys("lst.index(element)",Keys.ENTER).build().perform();
				a.sendKeys("return True",Keys.ENTER).build().perform();
				a.sendKeys("except ValueError:",Keys.ENTER).build().perform();
				a.sendKeys("return False",Keys.ENTER).build().perform();
				a.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE).build().perform();
				a.sendKeys("print(element_exists([12,23,45,67,6,90],12))",Keys.ENTER).build().perform();
				a.sendKeys("print(element_exists([12,23,45,67,6,90],25))",Keys.ENTER).build().perform();
				a.sendKeys("#").build().perform();
		}

		 @When("User clicks Run")
	          public void user_clicks_run() {
	            array.Clickrun();

	}

	     @Then("The result is displayed")
	          public void the_result_is_displayed() {
		   System.out.println(array.Getresult());

	}

		@When("User clicks Submit")
		     public void user_clicks_submit() throws InterruptedException{
			 array.Clicksubmit();
			 Thread.sleep(600);

		}

		@Then ("The result displayed is {string}")
		  public void the_result_displayed_is(String result) throws InterruptedException {
			Thread.sleep(400);
			 String Submitresult = array.Getresult();
		        Assert.assertEquals(Submitresult,result);

		}


		@Then("The user goes back to the previous page")
		public void the_user_goes_back_to_the_previous_page() {
	          BaseClass.goBack();
		}


		@When("User clicks on the Max Consecutive Ones option")
		public void user_clicks_on_the_max_consecutive_ones_option() {
		    array.ClickquesB();
		}


		@When("User clicks on the Even Number of Digits option")
		public void user_clicks_on_the_even_number_of_digits_option() {
		    array.ClickquesC();
		}



		@When("User clicks on the Squares of a Sorted Array option")
		public void user_clicks_on_the_squares_of_a_sorted_array_option() {
	        array.ClickquesD();
		}


	}


