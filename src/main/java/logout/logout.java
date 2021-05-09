package logout;

import org.junit.Test;

import _Core.constantes;

public class logout implements constantes {
	
	screenLogout step = new screenLogout();
	
	@Test
	public void testLogout () {
		
		step.deslogar();
		
	}

}
