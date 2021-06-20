package qa.reinaldo._core.screens

import _core.BaseScreen
import io.appium.java_client.MobileBy
import io.appium.java_client.MobileElement
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.iOSXCUITFindBy
import org.openqa.selenium.support.ui.ExpectedConditions


class ScreenShopping : BaseScreen() {

    @iOSXCUITFindBy(id = "")
    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/detalhes_produto_botao_comprar")
    private lateinit var comprar: MobileElement

    @iOSXCUITFindBy(id = "")
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").textContains(\"mero cart\")")
    private lateinit var numeroCartao: MobileElement

    @iOSXCUITFindBy(id = "")
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").text(\"Data de validade\")")
    private lateinit var dataValidade: MobileElement

    @iOSXCUITFindBy(id = "")
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").text(\"CVC\")")
    private lateinit var cvc: MobileElement

    @iOSXCUITFindBy(id = "")
    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/pagamento_botao_confirma_pagamento")
    private lateinit var confirmarPagamento: MobileElement

    fun produto(text: String) {
        val MobileElement =
            "new UiSelector().resourceId(\"br.com.alura.aluraesporte:id/item_produto_nome\").textContains(\"$text\")"
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AndroidUIAutomator(MobileElement))).click()
    }

    fun comprar() {
        click(comprar)
    }

    fun preencherNumeroCartao(text: String?) {
        sendKeys(numeroCartao, text)
    }

    fun preencherDataValidade(text: String?) {
        sendKeys(dataValidade, text)
    }

    fun preencherCvc(text: String?) {
        sendKeys(cvc, text)
    }

    fun confirmarPagamento() {
        click(confirmarPagamento)
    }

}