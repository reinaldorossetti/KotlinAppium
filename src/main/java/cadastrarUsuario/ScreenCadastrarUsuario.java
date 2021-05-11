package cadastrarUsuario;

import _core.BaseScreen;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;


public class ScreenCadastrarUsuario extends BaseScreen {

	public ScreenCadastrarUsuario() {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(id = "br.com.alura.aluraesporte:id/login_botao_cadastrar_usuario")
	private MobileElement cadastrarUsuario;
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(id = "br.com.alura.aluraesporte:id/input_nome")
	private MobileElement nome;
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(id = "br.com.alura.aluraesporte:id/input_senha")
	private MobileElement senha;
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(id = "br.com.alura.aluraesporte:id/input_confirmar_senha")
	private MobileElement confirmarSenha;
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(id = "br.com.alura.aluraesporte:id/cadastro_usuario_botao_cadastrar")
	private MobileElement cadastrar;
	
	
	public void cadastrarUsuario () {
		
		click(cadastrarUsuario);
	}
	
	public void nome (String text) {
		
		sendKeys(nome, text);
	}
	
	public void senha (String text) {
		
		sendKeys(senha, text);
	}
	
	public void confirmarSenha (String text) {
		
		sendKeys(confirmarSenha, text);
	}
	
	public void cadastrar () {
		
		click(cadastrar);
	}
	

}
