package _core

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import io.appium.java_client.remote.MobileCapabilityType
import org.openqa.selenium.remote.DesiredCapabilities
import java.net.MalformedURLException
import java.net.URL

open class Capabilities : Constantes {
    companion object {
        private var driver: AppiumDriver<MobileElement>? = null
        fun inicializarAppiumDriver(): AppiumDriver<MobileElement>? {
            if (driver == null) {
                createDriver()
            }
            return driver
        }

        private fun createDriver() {
            val desiredCapabilities = DesiredCapabilities()
            desiredCapabilities.setCapability("platformName", Constantes.Companion.platformName_value)
            desiredCapabilities.setCapability("deviceName", Constantes.Companion.deviceName_value)
            desiredCapabilities.setCapability("automationName", Constantes.Companion.automationName_value)
            desiredCapabilities.setCapability("appPackage", Constantes.Companion.appPackage_value)
            desiredCapabilities.setCapability("appActivity", Constantes.Companion.appActivity_value)
            desiredCapabilities.setCapability("newCommandTimeout", Constantes.Companion.newCommandTimeout)

            desiredCapabilities.setCapability(MobileCapabilityType.APP, Constantes.Companion.APP_value)
            try {
                driver = AppiumDriver(URL("http://localhost:4723/wd/hub"), desiredCapabilities)
            } catch (e: MalformedURLException) {
                e.printStackTrace()
            }
        }

        fun finalizarAppiumDrivery() {
            if (driver != null) {
                driver!!.quit()
                driver = null
            }
        }
    }
}