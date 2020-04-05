package org.iPulse.general;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepDefinitions extends TestBase{
	
	@Before
	public void fnpInitialize() throws Throwable{
		
		if(!initialize){
			//initialize properties file
			OR=new Properties();
			FileInputStream orFile=new FileInputStream(System.getProperty("user.dir")+"//src\\test\\java\\org\\iPulse\\config\\OR.property");
			OR.load(orFile);
			
			initialize=true;
		}
	}
	
	
	
	@Given("open the iPulse application")
	public void open_the_iPulse_application() {
		//setup the chromedriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(300, TimeUnit.SECONDS);
        driver.get("https://testapps.nsf.org/trunkecap");
        
		
		

	}

	@When("^insert ([^\"]*) into the ([^\"]*) field$")
	public void insert_value_into_the_field(String value,String fieldName) {
		System.out.println("field name is --"+fieldName +" and value is ---"+value);
		System.out.println("OR value  is --"+OR);
		System.out.println("field xpath is --"+OR.getProperty(fieldName));
		driver.findElement(By.xpath(OR.getProperty(fieldName))).sendKeys(value);
		
	}

/*	@When("insert ([^\"]*) into the password field")
	public void insert_password_into_the_password_field(String value) {
		driver.findElement(By.xpath(OR.password)).sendKeys(value);
	}*/

	@When("click login button")
	public void click_login_button() {
		driver.findElement(By.xpath(OR.getProperty("loginButton"))).click();
	}

	@Then("user should be login and logout button should be visible")
	public void user_should_be_login_and_logout_button_should_be_visible() {

	}

	@Then("click on search work order top menu")
	public void click_on_search_work_order_top_menu() {

	}

	@Then("click on search button")
	public void click_on_search_button() {

	}

	@Then("pick first work order no.")
	public void pick_first_work_order_no() {

	}

	@Then("insert into the work order field")
	public void insert_into_the_work_order_field() {

	}



	@Then("first work order should be same as picked one")
	public void first_work_order_should_be_same_as_picked_one() {

	}


	
	
}
