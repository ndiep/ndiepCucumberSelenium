package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

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
		driver.findElement(dealerListItems).click();
	}
	
	public void confirmDealer() {
		driver.findElement(selectDealerButton).click();
	}
}
