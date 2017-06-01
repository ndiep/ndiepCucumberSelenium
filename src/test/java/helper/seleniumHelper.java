package helper;

import java.util.List;

import org.openqa.selenium.WebElement;

public class seleniumHelper {
	
	public static WebElement FindDisplayed(List<WebElement> elements) {
		// System.out.println("Num Elements: " + elements.size());
	    for(int i=0; i < elements.size(); i++) {
	    	// System.out.println("In Loop " + i);
	        if(elements.get(i).isDisplayed()) { // correct method: isDisplayed()
	        	// System.out.println("found displayed");
	            return elements.get(i);
	        }
	    }
	    return null;
	}
}
