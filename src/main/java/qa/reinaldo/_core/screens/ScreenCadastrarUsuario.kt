package screens

import _core.BaseScreen
import io.appium.java_client.MobileElement
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.iOSXCUITFindBy
import org.junit.Test

class ScreenCadastrarUsuario : BaseScreen() {

    @iOSXCUITFindBy(id = "")
    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/login_botao_cadastrar_usuario")
    private val cadastrarUsuario: MobileElement? = null

    @iOSXCUITFindBy(id = "")
    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/input_nome")
    private val nome: MobileElement? = null

    @iOSXCUITFindBy(id = "")
    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/input_senha")
    private val senha: MobileElement? = null

    @iOSXCUITFindBy(id = "")
    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/input_confirmar_senha")
    private val confirmarSenha: MobileElement? = null

    @iOSXCUITFindBy(id = "")
    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/cadastro_usuario_botao_cadastrar")
    private val cadastrar: MobileElement? = null

    @Test
    fun cadastrarUsuario() {
        cadastrarUsuario?.click()
    }

    @Test
    fun cadastrarUsuario2() {
        cadastrarUsuario?.click()
    }

    fun nome(text: String?) {
        nome?.sendKeys(text)
    }

    fun senha(text: String?) {
        senha?.sendKeys(text)
    }

    fun confirmarSenha(text: String?) {
        confirmarSenha?.sendKeys(text)
    }

    fun cadastrar() {
        cadastrar?.click()
    }
}