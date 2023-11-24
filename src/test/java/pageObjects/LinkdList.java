package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import stepDefinition.BaseClass;

public class LinkdList extends BaseClass {
	// WebDriver driver;
	
	By getStrtedButton = By.xpath("//div[3]//div//div//a");
	By Introduction = By.linkText("Introduction");
	By creatngLnkdLst = By.linkText("Creating Linked LIst");
	By typesofLnkdLst = By.linkText("Types of Linked List");
	By implemntLnkdLstinPython = By.linkText("Implement Linked List in Python");
	By Traversal = By.linkText("Traversal");
	By Insertion = By.linkText("Insertion");
	By Deletion = By.linkText("Deletion");
	By practiceQue = By.linkText("Practice Questions");
	By tryHere = By.linkText("Try here>>>");

	public void clickGetStrtdBtn() {
		BaseClass.getDriver().findElement(getStrtedButton).click();
	}

	public void clickIntroductn() {
		BaseClass.getDriver().findElement(Introduction).click();
	}

	public void clickCreatngLL() {
		BaseClass.getDriver().findElement(creatngLnkdLst).click();
	}

	public void clickTypesofLL() {
		BaseClass.getDriver().findElement(typesofLnkdLst).click();
	}

	public void clickImplemntLLinPython() {
		BaseClass.getDriver().findElement(implemntLnkdLstinPython).click();
	}

	public void clickTraversal() {
		BaseClass.getDriver().findElement(Traversal).click();
	}

	public void clickInsertion() {
		BaseClass.getDriver().findElement(Insertion).click();
	}

	public void clickDeletion() {
		BaseClass.getDriver().findElement(Deletion).click();
	}

	public void clickPracticeQue() {
		BaseClass.getDriver().findElement(practiceQue).click();
	}

	public void clickTryHere() {
		BaseClass.getDriver().findElement(tryHere).click();
	}

	public void getExcelData() {
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
