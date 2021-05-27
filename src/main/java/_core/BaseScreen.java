package _core;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BaseScreen extends Capabilities {
	
	private AppiumDriver<MobileElement> driver = inicializarAppiumDriver();

	public BaseScreen () {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(20)), this);
	}

	WebDriverWait wait = new WebDriverWait(driver, 5);
	
	public void click (MobileElement element) {
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element)).click();			
		} catch (Exception e) {
			wait.until(ExpectedConditions.visibilityOf(element)).click();
		}
	}
	
	public void sendKeys (MobileElement element, String text) {
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(text);			
		} catch (Exception e) {
			wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
		}
	}

}
