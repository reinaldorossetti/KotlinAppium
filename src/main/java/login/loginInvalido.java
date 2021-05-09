package login;

import org.junit.Assert;
import org.junit.Test;

import _Core.constantes;


public class loginInvalido implements constantes {
	
	screenLogin step = new screenLogin();
	
	@Test
	public void loginUsuarioSenhaInvalidos () {
		
		step.idDoUsuario("usuarioInexistente");
		step.senha("9999999");
		step.logar();
		
		Assert.assertEquals("Usuário ou senha inválidos", step.validaUsuarioSenhaInvalidos());
		
	}

}
