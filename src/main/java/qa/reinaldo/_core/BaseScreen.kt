package _core

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import org.openqa.selenium.By
import org.openqa.selenium.support.PageFactory
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import java.time.Duration

open class BaseScreen : Capabilities() {

    private val driver: AppiumDriver<MobileElement>? = Capabilities.Companion.inicializarAppiumDriver()
    open var wait = WebDriverWait(driver, 30)

    fun click(element: MobileElement?) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element)).click()
        } catch (e: Exception) {
            wait.until(ExpectedConditions.visibilityOf(element)).click()
        }
    }

    fun click(element: By) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element)).click()
        } catch (e: Exception) {
            wait.until(ExpectedConditions.presenceOfElementLocated(element)).click()
        }
    }

    fun sendKeys(element: MobileElement?, text: String?) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(text)
        } catch (e: Exception) {
            wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text)
        }
    }

    init {
        PageFactory.initElements(AppiumFieldDecorator(driver, Duration.ofSeconds(30)), this)
    }
}