package _core;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import cadastrarUsuario.CadastrarUsuario;
import compras.ComprarProduto;
import login.Login;
import login.LoginInvalido;
import logout.Logout;

@RunWith(Suite.class)
@SuiteClasses({

	CadastrarUsuario.class,
	LoginInvalido.class,
	Login.class,
	ComprarProduto.class,
	Logout.class,
	

})

public class SuiteGeral {

	@AfterClass
	public static void finalizar() {

		Capabilities.finalizarAppiumDrivery();
		
	}

}
