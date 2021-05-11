package login;

import org.junit.Assert;
import org.junit.Test;

import _core.Constantes;


public class LoginInvalido implements Constantes {
	
	ScreenLogin step = new ScreenLogin();
	
	@Test
	public void loginUsuarioSenhaInvalidos () {
		
		step.preencherIdDoUsuario("usuarioInexistente");
		step.preencherSenha("9999999");
		step.logar();
		
		Assert.assertEquals("Usuário ou senha inválidos", step.validaUsuarioSenhaInvalidos());
		
	}

}
