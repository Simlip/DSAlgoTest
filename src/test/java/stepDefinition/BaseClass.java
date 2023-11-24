package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import pageObjects.AlgoPortalHome;
import pageObjects.DS_Array;
import pageObjects.DS_Introduction;
import pageObjects.LinkdList;
import pageObjects.QueuePO;
import pageObjects.Register;
import pageObjects.SignIn;
import pageObjects.Stacks;

public class BaseClass {
	private static WebDriver driver;
	public String URL="https://dsportalapp.herokuapp.com";
	public AlgoPortalHome AP;
	public Register RG; 
	public SignIn objSignIn;
	public DS_Introduction DS;
	public Stacks objStacks;
	public QueuePO objQueue;
	public LinkdList LL;
	public DS_Array array;
	
	public static WebDriver getDriver()
	{
	if(driver == null) {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}
		return driver;		
	}
	
	public static void closeDriver()
	{
		if (driver != null) {
			driver.quit();
		}
		
	}
	
	public static void goForward()
	{
		driver.navigate().back();
	}
	public static void goBack()
	{
		driver.navigate().forward();
	}
	
}