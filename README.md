# Exemplo usando Kotlin com Appium, junit e Allure report. Gerenciador de dependencias o maven.

### Cenários de testes identificados na APK alura_esporte

##### * Cadastrar Usuário
##### * Login com os dados de autenticação inválido
##### * Login
##### * Comprar produto
##### * Logout

### Para criação do setup do ambiente baixe e instale os seguintes programas: 

  * [Java Version 8](https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR)
  * [Eclipse IDE](https://www.eclipse.org/downloads/)
  * [Android Studio](https://developer.android.com/studio)
  * [Appium 1.20.2](https://github.com/appium/appium-desktop/releases)

Pré-requisito:
1. Inicie o Appium server;
2. Abra o emulador ou conecte o device.

Para rodar os testes via terminal:
``
mvn clean -Dtest=Runner test
``

### Configure as seguintes variáveis de ambiente no SO Windows:

  * Variável: JAVA_HOME | Caminho: Padrão da instalação do Java: C:\Program Files\Java
  * Variável: ANDROID_HOME | Caminho: Padrão da instalação do Android Studio: C:\Users\Administrador\AppData\Local\Android\Sdk

#### Configurar no Path as variávels: 
  
  * %JAVA_HOME%\bin
  * %ANDROID_HOME%\emulator
  * %ANDROID_HOME%\platform-tools
  * %ANDROID_HOME%\tools\bin

### Executando o Projeto:

##### Após inicializar o Appium com um device configurado ( físico ou emulador ) clone o projeto para a sua maquina, importe o mesmo para a IDE Eclipse ou alguma outra de preferência. 
##### Abra o pacote _Core, em seguida a classe: suite.java, clique com o botão direito do mouse, em seguida: Run As, JUnit Test.


### Exemplo usando UiSelector nativo do Android, ao invés do XPATH. Para isso usando a anotação @AndroidFindBy.

// verifica se contains o parte do texto no elemento className.
```
"new UiSelector().className(\"android.widget.EditText\").textContains(\"mero cart\")"

```
// verifica se contains o exato texto no elemento className.

```
"new UiSelector().className(\"android.widget.EditText\").text(\"Data de validade\")"

```
// verifica se contains o exato texto no elemento resourceId.

```
"new UiSelector().resourceId("br.com.alura.aluraesporte:id/item_produto_nome").textContains("Bola de futebol")"

```

// Exemplo usando elemento pai e elemento filho.

```
"UiSelector().resourceId("XXXX:id/TEST_ID").childSelector(new UiSelector().className("android.widget.LinearLayout"))"

```

// para usar uma lista use o ArrayList<MobileElement>  
```
@AndroidFindBy(accessibility = "A")  
@iOSXCUITFindBy(accessibility = "B")  
private lateinit var btnArrival0to6: ArrayList<MobileElement>  
```

References:  
solve problem in intellij:  
https://stackoverflow.com/questions/31712046/kotlin-unresolved-reference-in-intellij  
appium client:  
https://github.com/appium/java-client/wiki  
page object:  
https://github.com/appium/java-client/blob/master/docs/Page-objects.md  
