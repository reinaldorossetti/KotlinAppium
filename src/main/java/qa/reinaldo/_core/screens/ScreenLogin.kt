package qa.reinaldo._core.screens

import _core.BaseScreen
import io.appium.java_client.MobileElement
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.iOSXCUITFindBy

class ScreenLogin : BaseScreen() {

    @iOSXCUITFindBy(id = "")
    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/input_usuario")
    private lateinit var idDoUsuario: MobileElement

    @iOSXCUITFindBy(id = "")
    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/input_senha")
    private lateinit var senha: MobileElement

    @iOSXCUITFindBy(id = "")
    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/login_botao_logar")
    lateinit var logar: MobileElement

    @iOSXCUITFindBy(id = "")
    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/mensagem_erro_login")
    private lateinit var usuarioSenhaInvalidos: MobileElement

    fun preencherIdDoUsuario(text: String?) {
        sendKeys(idDoUsuario, text)
    }

    fun preencherSenha(text: String?) {
        senha.setValue(text)
    }

    fun logar() {
        logar.click()
    }

    fun validaUsuarioSenhaInvalidos(): String {
        return usuarioSenhaInvalidos.text
    }
}