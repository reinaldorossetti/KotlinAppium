package login;

import org.junit.Test;

import _core.Constantes;

public class Login implements Constantes {
	
	ScreenLogin step = new ScreenLogin();
	
	@Test
	public void testeLogin () {
		
		step.preencherIdDoUsuario(idDoUsuario);
		step.preencherSenha(senha);
		step.logar();
	}

}
