package com.Ecommerce.Option2;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Ecommerce.PageObjects.GrandhiBankingCustomerPage;
import com.Ecommerce.PageObjects.homePage;
import com.Ecommerce.PageObjects.loginPage;

import BaseFramework.BaseClass;
@Listeners(Reports.ExtentList.class)
public class Login extends BaseClass{

	//public static void main(String[] args) {
		
	//}
	loginPage lpage = new loginPage();
	String filepath = System.getProperty("user.dir")+"//src//test//java//config//config.properties";

	 @Test 
	public void openAppilication() {
		BaseClass.launchBrowser();
		loginPage.EnterUserName("standard_user");
		loginPage.EnterPassword("secret_sauce");
		loginPage.clickLogin();
	}
	public void closingtheBrowser() {

		try 
		{	
			BaseClass.closeBrowser();

		}

		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail();
		}
	}
}