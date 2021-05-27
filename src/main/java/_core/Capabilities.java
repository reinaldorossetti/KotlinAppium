package _core;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;

public class Capabilities implements Constantes {
	
	private static AppiumDriver<MobileElement> driver;

	public static AppiumDriver<MobileElement> inicializarAppiumDriver() {

		if (driver == null) {
			createDriver();
		}
		return driver;
	}
	
	private static void createDriver() {

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", platformName_value);
		desiredCapabilities.setCapability("deviceName", deviceName_value);
		desiredCapabilities.setCapability("automationName", automationName_value);
		desiredCapabilities.setCapability("appPackage", appPackage_value);
		desiredCapabilities.setCapability("appActivity", appActivity_value);
		desiredCapabilities.setCapability(MobileCapabilityType.APP, APP_value);

		try {
			driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	public static void finalizarAppiumDrivery() {

		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
	
}
