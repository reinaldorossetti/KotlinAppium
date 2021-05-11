package cadastrarUsuario;

import org.junit.Test;

import _core.Constantes;

public class CadastrarUsuario implements Constantes {

	ScreenCadastrarUsuario step = new ScreenCadastrarUsuario();
	
	@Test
	public void testeCadastrarUsuario () {
		
		step.cadastrarUsuario();
		step.nome(idDoUsuario);
		step.senha(senha);
		step.confirmarSenha(senha);
		step.cadastrar();

	}
	
}
