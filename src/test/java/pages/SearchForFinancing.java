package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchForFinancing {
	
	WebDriver driver;

	By continueButton = By.cssSelector(".btn.btn-primary");
	
	// Personal Information
	By firstName = By.cssSelector("#firstNameTextField");
	By lastName = By.cssSelector("#lastNameTextField");
	By dateOfBirth = By.cssSelector("#dobTextField");
	By mobilePhone = By.cssSelector("#mobilePhoneTextField");
	
	By email = By.cssSelector("#emailTextField");
	By password = By.cssSelector("#passwordTextField");
	By confirmPassword = By.cssSelector("#confirmPasswordTextField");
	
	// Residence Information
	By residentStatus = By.cssSelector("#agselecthouseinfo");
	By residentStatusOwn = By.cssSelector("body > div:nth-child(13) > div > div > div > div:nth-child(2) > span > div > div > div");
	
	By address = By.cssSelector("#aginputaddress");
	By city = By.cssSelector("#aginputcity");
	
	By stateDropdown = By.cssSelector("#agselectstate");
	By stateCalifornia = By.cssSelector("body > div:nth-child(13) > div > div > div > div:nth-child(5) > span > div > div > div");
	
	By zipcode = By.cssSelector("#aginputzip");
	By moveInDate = By.cssSelector("#aginputmoveindate");
	By paymentAmount = By.cssSelector("#aginputpayment");
	
	// Employment Information
	By employmentStatus = By.cssSelector("#agselectemployment-status");
	By employmentFullTime = By.cssSelector("body > div:nth-child(13) > div > div > div > div:nth-child(1) > span > div > div > div");
	By employmentName = By.cssSelector("#employer-name");
	By employmentTitle = By.cssSelector("#employee-title");
	By employmentDate = By.cssSelector("#employee-start-date");
	By employmentPhone = By.cssSelector("#employer-phone-number");
	By grossMonthlyIncome = By.cssSelector("#gross-monthly-income");
	
	public SearchForFinancing(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickStartFinancing() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(continueButton));
		wait.until(ExpectedConditions.elementToBeClickable(continueButton));
		driver.findElement(continueButton).click();
	}
	
	public void fillOutFinancing() {
		driver.findElement(firstName).sendKeys("firstnametest");
		driver.findElement(lastName).sendKeys("lastnametest");
		driver.findElement(dateOfBirth).sendKeys("01011980");
		driver.findElement(mobilePhone).sendKeys("5555555555");
		driver.findElement(email).sendKeys("test007@test.com");
		driver.findElement(password).sendKeys("Password01");
		driver.findElement(confirmPassword).sendKeys("Password01");
		driver.findElement(continueButton).click();
	}
	
	public void fillOutResidence() throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver, 15);
		
		driver.findElement(residentStatus).click();
		driver.findElement(residentStatusOwn).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(address));
		driver.findElement(address).sendKeys("49 Discovery");
		driver.findElement(city).sendKeys("Irvine");
		
		driver.findElement(stateDropdown).click();
		
		//wait for animation for element to show
		wait.until(ExpectedConditions.visibilityOfElementLocated(stateCalifornia));
		driver.findElement(stateCalifornia).click();
		//sleep for animation to end
		Thread.sleep(2000);
		
		driver.findElement(zipcode).sendKeys("92618");
		driver.findElement(moveInDate).sendKeys("012000");
		driver.findElement(paymentAmount).sendKeys("2000");
		driver.findElement(continueButton).click();
	}
	
	public void fillOutEmployment() throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver, 15);
		
		driver.findElement(employmentStatus).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(employmentFullTime));
		wait.until(ExpectedConditions.elementToBeClickable(employmentFullTime));
		driver.findElement(employmentFullTime).click();
		//Sleep again for animation to end
		Thread.sleep(1000);
		
		driver.findElement(employmentName).sendKeys("Software Testing");
		driver.findElement(employmentTitle).sendKeys("Senior Software Engineer");
		driver.findElement(employmentDate).sendKeys("012005");
		driver.findElement(employmentPhone).sendKeys("9493928777");
		driver.findElement(grossMonthlyIncome).sendKeys("10000" + Keys.ENTER);
		
		driver.findElement(continueButton).click();
	}
}
