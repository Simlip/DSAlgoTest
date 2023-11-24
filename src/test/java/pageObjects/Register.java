package pageObjects;

import org.openqa.selenium.By;
import stepDefinition.BaseClass;

public class Register extends BaseClass {
	

//	public Register(WebDriver driver) {
//		//this.driver = driver;
//	}
	By regstr=By.xpath("//input[@value='Register']");
    By userName=By.xpath("//input[@name='username']");
    By password=By.xpath("//input[@name='password1']");
    By pwdCnfmtn=By.xpath("//input[@name='password2']");
    
	public void ClickRegister()  {
		BaseClass.getDriver().findElement(regstr).click();
	}
	public void ClickUsername(String Username) {
		BaseClass.getDriver().findElement(userName).sendKeys(Username);
	}
	public void ClickPassword(String Password) {
		BaseClass.getDriver().findElement(password).sendKeys(Password);
	}
	public void ClickpwdConfirmation(String pwdConfirmation) {
		BaseClass.getDriver().findElement(pwdCnfmtn).sendKeys(pwdConfirmation);
	}
}
