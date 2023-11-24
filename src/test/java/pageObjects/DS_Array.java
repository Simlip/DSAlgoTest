package pageObjects;

	import java.io.IOException;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;

	import stepDefinition.BaseClass;

	public class DS_Array extends BaseClass {
		By getStartedPortal = By.xpath("//button[text()='Get Started']");
		By signIn = By.xpath("//a[text()='Sign in']");
		By usrname=By.xpath("//input[id='id_username']");
		By pwd=By.xpath("//input[id='id_password']");
		By login = By.xpath("//input[@value='Login']");	
		By getStartedBtn = By.xpath("//div[2]/div/div/a");
		By arraysInPython = By.xpath("//a[text()='Arrays in Python']");
		By arraysUsingList = By.xpath("//a[text()='Arrays Using List']");
		By basicOperationsInList = By.xpath("//a[text()='Basic Operations in Lists']");
		By applicationsOfArray = By.xpath("//a[text()='Applications of Array']");
		By tryHere = By.linkText("Try here>>>");
		By practiceQues = By.xpath("//a[text()='Practice Questions']");
		By quesA = By.xpath("//a[text()='Search the array']");
		By quesB = By.xpath("//a[text()='Max Consecutive Ones']");
		By quesC = By.xpath("//a[text()='Find Numbers with Even Number of Digits']");
		By quesD = By.xpath("//div[5]/a");
		By submit = By.xpath("//input[@type='submit']");
		By run = By.xpath("//button[@type='button']");
		//By result = By.xpath("//div/div[2]/div/pre");
		By result = By.xpath("/html/body/div/div[2]/div/pre");



		public void ClickStart() {
			BaseClass.getDriver().findElement(getStartedPortal).click();
		}

		public void Clicksignin() {
			BaseClass.getDriver().findElement(signIn).click();
		}

		public void Enterusername(String username) {
			BaseClass.getDriver().findElement(usrname).sendKeys(username);
		}	
		public void Enterpassword(String passwd) {
			BaseClass.getDriver().findElement(pwd).sendKeys(passwd);
		}

		public void Clicklogin() {
			BaseClass.getDriver().findElement(login).click();
		}

		public void Clickgetstrtd() {
			BaseClass.getDriver().findElement(getStartedBtn).click();	
		}

		public void Clickarrayinpython() {
			BaseClass.getDriver().findElement(arraysInPython).click();	
		}

		public void Clickarraysusinglist() {
			BaseClass.getDriver().findElement(arraysUsingList).click();	
		}
		public void Clickbasicoperationsinlist() {
			BaseClass.getDriver().findElement(basicOperationsInList).click();	
		}
		public void Clickapplicationsofarray() {
			BaseClass.getDriver().findElement(applicationsOfArray).click();	
		}

		public void Clicktryhere() {
			BaseClass.getDriver().findElement(tryHere).click();
		}

		public void Clickpracticequestions() {
			BaseClass.getDriver().findElement(practiceQues).click();
		}

		public void ClickquesA() {
			BaseClass.getDriver().findElement(quesA).click();
		}

		public void ClickquesB() {
			BaseClass.getDriver().findElement(quesB).click();
		}

		public void ClickquesC() {
			BaseClass.getDriver().findElement(quesC).click();
		}

		public void ClickquesD() {	
		    BaseClass.getDriver().findElement(quesD).click();
		}

		public void Clicksubmit() {
			BaseClass.getDriver().findElement(submit).click();
		}

		public String Getresult() {
			return BaseClass.getDriver().findElement(result).getText();
		}

		public void Clickrun() {
			BaseClass.getDriver().findElement(run).click();
		}

		public void getExcelData() throws IOException, InterruptedException {

			XLUtility Util = new XLUtility("src/test/resources/DSalgo.xlsx");
			int rowCount = Util.getRowCount("Sheet1");
			for (int rownum = 2; rownum <= rowCount; rownum++) {
				String Code = Util.getCellData("Sheet1", "Program Code", rownum);
				String Status = Util.getCellData("Sheet1", "Running Status", rownum);
				WebElement element = BaseClass.getDriver().findElement(By.xpath("//div[5]//div//pre"));
				Actions act = new Actions(BaseClass.getDriver());
				act.sendKeys(element, Code).build().perform();
				BaseClass.getDriver().findElement(By.xpath("//button[@type='button']")).click();

				if (Status.equalsIgnoreCase("Failure")) {
					Alert alert = BaseClass.getDriver().switchTo().alert();
					alert.accept();
				}
	}
	}
	

}
