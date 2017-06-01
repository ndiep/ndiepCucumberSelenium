package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindDealership {

	WebDriver driver;

	By enterLocationBox = By.cssSelector(".form-control");
	By dealerListItems = By.cssSelector(".list-group-item");
	By selectDealerButton = By.cssSelector(".btn.btn-primary");
	
	public FindDealership(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterLocation() {
		driver.findElement(enterLocationBox).sendKeys("Irvine, CA" + Keys.RETURN);
	}
	
	public void selectDealerFromList() {
		WebDriverWait generalWait = new WebDriverWait(driver, 15);
		generalWait.until(ExpectedConditions.visibilityOfElementLocated(dealerListItems));
		generalWait.until(ExpectedConditions.elementToBeClickable(dealerListItems));
		driver.findElement(dealerListItems).click();
	}
	
	public void confirmDealer() {
		WebDriverWait generalWait = new WebDriverWait(driver, 15);
		generalWait.until(ExpectedConditions.visibilityOfElementLocated(selectDealerButton));
		generalWait.until(ExpectedConditions.elementToBeClickable(selectDealerButton));
		driver.findElement(selectDealerButton).click();
	}
}
