package stepDefinition;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pages.ChooseACar;
import pages.FindDealership;
import pages.SearchForFinancing;

public class Test_Steps {
	
	public static WebDriver driver;
	public static String env = "test";
	public static String browserType = "chrome";
	
	public ChooseACar chooseCar;
	public FindDealership findDealer;
	public SearchForFinancing searchFinance;
	
	///////////////////////////////////////////////////////////////////////////
	/////// BEFORE ////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	
	@Before
	public void beforeScenario() throws Throwable {
		if(browserType == "chrome") {
			if(env == "test") {
				System.setProperty("webdriver.chrome.driver","C:\\seleniumWebDrivers\\chromedriver.exe");
			}
			driver = new ChromeDriver();
		}
		else {
			if(env == "test") {
				System.setProperty("webdriver.chrome.driver","C:\\seleniumWebDrivers\\chromedriver.exe");
			}
			driver = new ChromeDriver();
		}
		
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}
	
	///////////////////////////////////////////////////////////////////////////
	/////// AFTER /////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	
	@After
	public void afterScenario() throws Throwable {
		//driver.close();
	}
	
	
	///////////////////////////////////////////////////////////////////////////
	/////// GIVENS ////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	
	@Given("^user is on apply page$")
	public void user_is_on_apply_page() throws Throwable {
	    chooseCar = new ChooseACar(driver);
	    chooseCar.navigateToHomePage();
	}

	///////////////////////////////////////////////////////////////////////////
	/////// WHENS /////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	
	@When("^I choose a make$")
	public void i_choose_a_make() throws Throwable {
	    chooseCar.selectMake();
	}

	@When("^I choose a model$")
	public void i_choose_a_model() throws Throwable {
	    chooseCar.selectModel();
	}

	@When("^I select a trim$")
	public void i_select_a_trim() throws Throwable {
	    chooseCar.selectTrim();
	}

	@When("^I click select loan$")
	public void i_click_select_loan() throws Throwable {
	    chooseCar.clickSelectLoan();
	}

	@When("^I enter in city$")
	public void i_enter_in_city() throws Throwable {
	    findDealer.enterLocation();
	}

	@When("^I select dealer from list$")
	public void i_select_dealer_from_list() throws Throwable {
	    findDealer.selectDealerFromList();
	    findDealer.confirmDealer();
	}

	@When("^I start financing$")
	public void i_start_financing() throws Throwable {
	    searchFinance.clickStartFinancing();
	}

	@When("^I enter in personal information$")
	public void i_enter_in_personal_information() throws Throwable {
	    searchFinance.fillOutFinancing();
	    searchFinance.fillOutResidence();
	    searchFinance.fillOutEmployment();
	}
	
	///////////////////////////////////////////////////////////////////////////
	/////// THENS ////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	
	@Then("^Close the Browser$")
	public void close_the_Browser() throws Throwable {
	    driver.close();
	}
	
	@Then("^I should be on find a dealership$")
	public void i_should_be_on_find_a_dealership() throws Throwable {
		findDealer = new FindDealership(driver);
	}

	@Then("^I should be on search for financing$")
	public void i_should_be_on_search_for_financing() throws Throwable {
		searchFinance = new SearchForFinancing(driver);
	}
}
