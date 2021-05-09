package cadastrarUsuario;

import org.junit.Test;

import _Core.constantes;

public class cadastrarUsuario implements constantes {

	screenCadastrarUsuario step = new screenCadastrarUsuario();
	
	@Test
	public void testeCadastrarUsuario () {
		
		step.cadastrarUsuario();
		step.nome(idDoUsuario);
		step.senha(senha);
		step.confirmarSenha(senha);
		step.cadastrar();

	}
	
}
