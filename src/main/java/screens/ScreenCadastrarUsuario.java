package screens;

import org.junit.Test;

import _core.BaseScreen;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;


public class ScreenCadastrarUsuario extends BaseScreen {	

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
	
	@Test
	public void cadastrarUsuario () {
		
		cadastrarUsuario.click();
	}
	
	@Test
	public void cadastrarUsuario2 () {
		
		cadastrarUsuario.click();
	}
	
	public void nome (String text) {
		
		nome.sendKeys(text);
	}
	
	public void senha (String text) {
		
		senha.sendKeys(text);
	}
	
	public void confirmarSenha (String text) {
		
		confirmarSenha.sendKeys(text);
	}
	
	public void cadastrar () {
		
		cadastrar.click();
	}

}
