package login;

import org.junit.Test;

import _Core.constantes;

public class login implements constantes {
	
	screenLogin step = new screenLogin();
	
	@Test
	public void testeLogin () {
		
		step.idDoUsuario(idDoUsuario);
		step.senha(senha);
		step.logar();
	}

}
