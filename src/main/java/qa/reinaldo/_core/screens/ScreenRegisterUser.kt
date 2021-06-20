package qa.reinaldo._core.screens

import _core.BaseScreen
import io.appium.java_client.MobileElement
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.iOSXCUITFindBy
import org.junit.Test

class ScreenRegisterUser : BaseScreen() {

    @iOSXCUITFindBy(id = "")
    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/login_botao_cadastrar_usuario")
    private lateinit var cadastrarUsuario: MobileElement

    @iOSXCUITFindBy(id = "")
    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/input_nome")
    private lateinit var nome: MobileElement

    @iOSXCUITFindBy(id = "")
    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/input_senha")
    private lateinit var senha: MobileElement

    @iOSXCUITFindBy(id = "")
    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/input_confirmar_senha")
    private lateinit var confirmarSenha: MobileElement

    @iOSXCUITFindBy(id = "")
    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/cadastro_usuario_botao_cadastrar")
    private lateinit var cadastrar: MobileElement

    @Test
    fun cadastrarUsuario() {
        cadastrarUsuario.click()
    }

    @Test
    fun cadastrarUsuario2() {
        cadastrarUsuario.click()
    }

    fun nome(text: String?) {
        nome.sendKeys(text)
    }

    fun senha(text: String?) {
        senha.sendKeys(text)
    }

    fun confirmarSenha(text: String?) {
        confirmarSenha.sendKeys(text)
    }

    fun cadastrar() {
        cadastrar.click()
    }
}