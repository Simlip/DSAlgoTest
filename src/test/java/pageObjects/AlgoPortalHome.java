package pageObjects;

import org.openqa.selenium.By;

import stepDefinition.BaseClass;

public class AlgoPortalHome extends BaseClass {
//    public AlgoPortalHome(WebDriver driver) {
//	}

	By getStartedbtn = By.xpath("//button[text()='Get Started']");
	By drpDwn = By.xpath("//a[@class='nav-link dropdown-toggle']");
	By getStartd = By.xpath("//div[3]/div[1]/div/div/a");
	By array = By.xpath("//a[text()='Arrays']");
	By signIn = By.linkText("Sign in");
	By regstr = By.xpath("//a[text()='Register!']");
	
	public void clickGetStartedbtn() {
		BaseClass.getDriver().findElement(getStartedbtn).click();
	}
	public void ClickDrpdwn()  {
		BaseClass.getDriver().findElement(drpDwn).click();
	}

	public void ClickArray() {
		BaseClass.getDriver().findElement(array).click();
	}

	public void VerifyAlertMsg1() {
	}

	public void ClickGetstartd()  {
		BaseClass.getDriver().findElement(getStartd).click();
	}

	public void VerifyAlertMsg2() {
	}

	public void ClickSignin() {
//		if(BaseClass.getDriver().findElement(signIn)!= null || BaseClass.getDriver().findElement(signIn).isDisplayed() )
			BaseClass.getDriver().findElement(signIn).click();
	}

	public void ClickRegistr() {
		BaseClass.getDriver().findElement(regstr).click();
	}

//	public void ClickQueueGetStartedBtn() {
//		BaseClass.getDriver().findElement(queueGetStarted).click();
//	}

}
