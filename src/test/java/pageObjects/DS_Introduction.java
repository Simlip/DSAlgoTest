package pageObjects;

import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import stepDefinition.BaseClass;

public class DS_Introduction extends BaseClass {

	By UserName = By.id("id_username");
	By PassWord = By.xpath("//input[@type='password']");
	By loginButton = By.xpath("//input[@value='Login']");
	By getStarted = By.xpath("//div[3]//div[1]//div//div//a");
	By timeComplexity = By.linkText("Time Complexity");
	By practiceQue = By.xpath("//a[text()='Practice Questions']");
	By tryHereButton = By.linkText("Try here>>>");

	public void enterUsername(String Uname) {
		BaseClass.getDriver().findElement(UserName).sendKeys(Uname);
	}

	public void enterPassword(String Pwd) {
		BaseClass.getDriver().findElement(PassWord).sendKeys(Pwd);
		;
	}

	public void clickLogin() {
		BaseClass.getDriver().findElement(loginButton).click();
	}

	public void clickGetStarted() {
		BaseClass.getDriver().findElement(getStarted).click();
	}

	public void clickTimeComplexity() {
		BaseClass.getDriver().findElement(timeComplexity).click();
	}

	public void clickPracticeQue() {
		BaseClass.getDriver().findElement(practiceQue).click();
	}

	public void clickTryHere() {
		BaseClass.getDriver().findElement(tryHereButton).click();
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

//    		JavascriptExecutor js=(JavascriptExecutor)BaseClass.getDriver();
//    		js.executeScript("arguments[0].value='';", element);
			// act.moveToElement(element).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
			// act.moveToElement(element).keyDown(Keys.CONTROL).sendKeys("a",Keys.BACK_SPACE).keyUp(Keys.CONTROL).perform();
		}

	}

}
