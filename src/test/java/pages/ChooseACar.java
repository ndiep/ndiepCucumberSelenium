package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChooseACar {
	
	WebDriver driver;
	By selectMakeAudi = By.xpath("//*[starts-with(@class, 'makeName__') and contains(text(), 'Audi')]");
	By selectModelS5 = By.xpath("//*[starts-with(@class, 'label__') and contains(text(), 'S5 Coupe')]");
	By selectTrimManual = By.xpath("//*[starts-with(@class, 'col-xs-') and contains(text(), '3.0 TFSI Manual')]");
	By selectLoanButton = By.cssSelector(".btn.btn-primary");
	
	public ChooseACar(WebDriver driver) {
		this.driver = driver;
	}
	
	public void navigateToHomePage() {
		String homePageURL = "https://apply.autogravity.com ";
	    driver.get(homePageURL);
	}
	
	public void selectMake() {
		driver.findElement(selectMakeAudi).click();
	}
	
	public void selectModel() {
		driver.findElement(selectModelS5).click();
	}
	
	public void selectTrim() {
		driver.findElement(selectTrimManual).click();
	}
	
	public void clickSelectLoan() {
		driver.findElement(selectLoanButton).click();
	}
}
