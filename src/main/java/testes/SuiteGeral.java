package testes;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import _core.Capabilities;

@RunWith(Suite.class)
@SuiteClasses({


})

public class SuiteGeral {

	@AfterClass
	public static void finalizar() {

		Capabilities.finalizarAppiumDrivery();
		
	}

}
