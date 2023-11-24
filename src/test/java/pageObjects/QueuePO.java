package pageObjects;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import stepDefinition.BaseClass;

public class QueuePO extends BaseClass {
	
	private By queueGetStarted = By.xpath("//div[2]/div[5]/div/div/a");
	private By implementationOfQueueInPythonLink = By.linkText("Implementation of Queue in Python");
	private By implementationUsingCollectionLink = By.linkText("Implementation using collections.deque");
	private By implementationUsingArrayLink = By.linkText("Implementation using array");
	private By queueOperationsLink = By.linkText("Queue Operations");
	private By tryHereButton = By.xpath("//a[text()='Try here>>>']");
	private By editor = By.id("editor");
	private By output = By.xpath("//*[@id='output']");
	private By runButton = By.xpath("//*[@id='answer_form']/button");
	private By signOutLink = By.xpath("//a[text()='Sign out']");
	private By signIn = By.xpath("//a[text()='Sign in']");
//	private By practiceQuestionsLink = By.xpath("//a[text()='Practice Questions']");
	private By practiceQuestionsLink = By.linkText("Practice Questions");
//	private By practiceQuestionsLink = By.xpath("//*[@id='content']/a]");
	
	public void clickQueueGetStartedBtn() {
		BaseClass.getDriver().findElement(queueGetStarted).click();
	}
	public void clickImplementationOfQueueInPythonLink() {
		BaseClass.getDriver().findElement(implementationOfQueueInPythonLink).click();
	}
	public void clickImplementationUsingCollectionLink() {
		BaseClass.getDriver().findElement(implementationUsingCollectionLink).click();
	}
	public void clickImplementationUsingArrayLink() {
		BaseClass.getDriver().findElement(implementationUsingArrayLink).click();
	}
	public void clickQueueOperationsLink() {
		BaseClass.getDriver().findElement(queueOperationsLink).click();
	}
	public void clickTryHereButton() {
		BaseClass.getDriver().findElement(tryHereButton).click();
	}
	public String getEditorValue() {
		return BaseClass.getDriver().findElement(editor).getText();
	}
	public boolean checkLogoutLink() {
		return BaseClass.getDriver().findElement(signOutLink).isDisplayed();
	}
	public void clickSignin() {
		BaseClass.getDriver().findElement(signIn).click();
	}
	public void clickRun() {
		BaseClass.getDriver().findElement(runButton).click();
	}
	public String getOutput() {
		return BaseClass.getDriver().findElement(output).getText();
	}
	public void clickPracticeQuestionsLink() {
		BaseClass.getDriver().findElement(practiceQuestionsLink).click();
	}
	public void getExcelData() throws IOException, InterruptedException {

		XLUtility Util = new XLUtility("src/test/resources/DSalgo.xlsx");
		int rowCount = Util.getRowCount("Sheet1");
		for (int rownum = 2; rownum <= rowCount; rownum++) {
			String Code = Util.getCellData("Sheet1", "Program Code", rownum);
			String Status = Util.getCellData("Sheet1", "Running Status", rownum);
			WebElement textEditorLine = BaseClass.getDriver().findElement(By.xpath("//div[5]//div//pre"));
			Actions act = new Actions(BaseClass.getDriver());
			act.sendKeys(textEditorLine, Code).build().perform();
			clickRun();
			
//			driver.findElement(By.xpath("//button[@type='button']")).click();
			if(Status.equalsIgnoreCase("Success"))
				Assert.assertTrue(!getOutput().isBlank(), "You successfully wrote in python");    	
			else if (Status.equalsIgnoreCase("Failure")) {
				Alert alert = BaseClass.getDriver().switchTo().alert();
				alert.accept();
			}

//    		JavascriptExecutor js=(JavascriptExecutor)driver;
//    		js.executeScript("arguments[0].value='';", element);
			// act.moveToElement(element).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
			// act.moveToElement(element).keyDown(Keys.CONTROL).sendKeys("a",Keys.BACK_SPACE).keyUp(Keys.CONTROL).perform();
		}

	}


}
