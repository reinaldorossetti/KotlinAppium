package qa.reinaldo._core.screens

import _core.BaseScreen
import io.appium.java_client.MobileElement
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.iOSXCUITFindBy

class ScreenLogout : BaseScreen() {

    @iOSXCUITFindBy(id = "")
    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/menu_principal_deslogar")
    private lateinit var deslogar: MobileElement

    fun deslogar() {
        deslogar.click()
    }
}