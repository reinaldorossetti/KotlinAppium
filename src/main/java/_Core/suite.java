package _Core;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import cadastrarUsuario.cadastrarUsuario;
import compras.comprarProduto;
import login.login;
import login.loginInvalido;
import logout.logout;

@RunWith(Suite.class)
@SuiteClasses({

	cadastrarUsuario.class,
	loginInvalido.class,
	login.class,
	comprarProduto.class,
	logout.class,
	

})

public class suite {

	@AfterClass
	public static void finalizar() {

		capabilities.finalizarAppiumDrivery();
		
	}

}
