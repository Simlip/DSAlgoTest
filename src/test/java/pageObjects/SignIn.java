package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import stepDefinition.BaseClass;

public class SignIn extends BaseClass {
	
//	public WebDriver driver;
//
//	public SignIn(WebDriver driver) {
////		this.driver = driver;
//	}
		
	
private	By loginUserName = By.id("id_username");
private	By loginPassword = By.id("id_password");
private	By loginButton = By.xpath("//input[@value='Login']");
private	By alertMsg = By.xpath("//div[@role='alert']");
private	By signOut = By.xpath("//a[text()='Sign out']");
//	By alertMsg = By.xpath("//div[@role='alert']");

	public void setUserName(String uname)
	{
		 BaseClass.getDriver().findElement(loginUserName).sendKeys(uname);
	}
	public void setPassword(String passwd)
	{
		BaseClass.getDriver().findElement(loginPassword).sendKeys(passwd);
	}
	public String getAlertMsg()
	{
		return BaseClass.getDriver().findElement(alertMsg).getText();
	}

	
	public void clickLoginButton()
	{
		BaseClass.getDriver().findElement(loginButton).click();
	}
	public void clickSignOut()
	{
		BaseClass.getDriver().findElement(signOut).click();
	}

}
