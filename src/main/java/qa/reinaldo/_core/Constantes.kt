package _core

interface Constantes {

    companion object {
        val path = System.getProperty("user.dir")

        //Capabilities Android
        val platformName_value = "Android"
        val deviceName_value = "emulator-5554"
        val automationName_value = "uiautomator2"
        val appPackage_value = "br.com.alura.aluraesporte"
        val appActivity_value = "br.com.alura.aluraesporte.ui.activity.MainActivity"
        val newCommandTimeout = 30000
        var APP_value =
            "$path\\src\\main\\resources\\alura_esporte.apk"

        //id do usuario
        val idDoUsuario = "gabriel"
        val senha = "123Mud@r"

        //Produtos
        val bolaFutebol = "Bola de futebol"
        val camisa = "Camisa"
        val chuteira = "Chuteira"
        val bermuda = "Bermuda"

        //Dados Cartao
        val numeroCartao = "5381579886310193"
        val dataValidade = "03/23"
        val cvc = "235"
    }
}