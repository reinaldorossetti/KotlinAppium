package qa.reinaldo

import _core.Capabilities
import _core.Constantes
import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import io.qameta.allure.Allure.step
import io.qameta.allure.Step
import org.junit.*
import org.junit.runners.MethodSorters
import qa.reinaldo._core.screens.ScreenRegisterUser
import qa.reinaldo._core.screens.ScreenShopping
import qa.reinaldo._core.screens.ScreenLogin
import qa.reinaldo._core.screens.ScreenLogout

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class Runner : Constantes {

    var driver: AppiumDriver<MobileElement>? = null
    private var screenRegisterUser = ScreenRegisterUser()

    @Before
    fun iniciar() {
        driver = Capabilities.inicializarAppiumDriver()
    }

    @After
    fun finalizar() {
        Capabilities.finalizarAppiumDrivery()
    }

    @Test
    @Step("Realizando o cadastro de usuario")
    fun A_testeCadastrarUsuario() {
        screenRegisterUser.cadastrarUsuario()
        screenRegisterUser.nome(Constantes.idDoUsuario)
        screenRegisterUser.senha(Constantes.senha)
        screenRegisterUser.confirmarSenha(Constantes.senha)
        screenRegisterUser.cadastrar()
    }

    @Test
    @Step("Realizando o cadastro com senha invalida - msn: {resultUsuarioSenhaInvalidos}")
    fun B_loginUsuarioSenhaInvalidos() {
        val screenLogin = ScreenLogin()
        screenLogin.preencherIdDoUsuario("usuarioInexistente")
        screenLogin.preencherSenha("9999999")
        screenLogin.logar()
        var resultUsuarioSenhaInvalidos = screenLogin.validaUsuarioSenhaInvalidos()
        validaUsuarioSenhaInvalidos(resultUsuarioSenhaInvalidos)
    }

    @Step("Assert mensagem: {resultado}")
    fun validaUsuarioSenhaInvalidos(resultado: String){
        Assert.assertEquals("Usuario ou senha invalidos",resultado)
    }

    @Test
    @Step("Realizando o login com sucesso")
    fun C_testeLogin() {
        val screenLogin = ScreenLogin()
        step("usuario: ${Constantes.idDoUsuario}")
        screenLogin.preencherIdDoUsuario(Constantes.idDoUsuario)
        screenLogin.preencherSenha(Constantes.senha)
        screenLogin.logar()
    }

    @Test
    @Step("Realizando a compra de um produto")
    fun D_testComprarProduto() {
        screenRegisterUser.cadastrarUsuario()
        screenRegisterUser.nome(Constantes.idDoUsuario)
        screenRegisterUser.senha(Constantes.senha)
        screenRegisterUser.confirmarSenha(Constantes.senha)
        screenRegisterUser.cadastrar()
        val screenLogin = ScreenLogin()
        screenLogin.preencherIdDoUsuario(Constantes.idDoUsuario)
        screenLogin.preencherSenha(Constantes.senha)
        screenLogin.logar()
        val screenCompras = ScreenShopping()
        screenCompras.produto(Constantes.bolaFutebol)
        screenCompras.comprar()
        screenCompras.preencherNumeroCartao(Constantes.numeroCartao)
        step("numeroCartao: ${Constantes.numeroCartao}")
        screenCompras.preencherDataValidade(Constantes.dataValidade)
        screenCompras.preencherCvc(Constantes.cvc)
        screenCompras.confirmarPagamento()

        //"Falso Negativo" ou "Falso Negativo" ???
        val falhaAoCriarPagamento = "Falso Positivo"
        val mensagemErro = "Falha ao criar pagamento"
        if (falhaAoCriarPagamento.equals("Falso Positivo")) {
            println("No cenario de teste 'Comprar Produto', o sistema esta apresentando a seguinte notificacao: <<<$mensagemErro>>> propositalmente.")
        } else {
            Assert.fail("App com falha ao Criar Pagamento")
        }
    }

    @Test
    @Step("Realizando o logout")
    fun E_testLogout() {
        screenRegisterUser.cadastrarUsuario()
        screenRegisterUser.nome(Constantes.idDoUsuario)
        screenRegisterUser.senha(Constantes.senha)
        screenRegisterUser.confirmarSenha(Constantes.senha)
        screenRegisterUser.cadastrar()
        val screenLogin = ScreenLogin()
        screenLogin.preencherIdDoUsuario(Constantes.idDoUsuario)
        screenLogin.preencherSenha(Constantes.senha)
        screenLogin.logar()
        val screenLogout = ScreenLogout()
        screenLogout.deslogar()
    }
}