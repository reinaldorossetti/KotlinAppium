package logout;

import org.junit.Test;

import _core.Constantes;

public class Logout implements Constantes {
	
	ScreenLogout step = new ScreenLogout();
	
	@Test
	public void testLogout () {
		
		step.deslogar();
		
	}

}
