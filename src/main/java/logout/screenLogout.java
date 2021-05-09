package logout;

import _Core.baseScreen;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;


public class screenLogout extends baseScreen {

	public screenLogout() {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(id = "br.com.alura.aluraesporte:id/menu_principal_deslogar")
	private MobileElement deslogar;
	
	public void deslogar () {
		
		click(deslogar);
	}
	
}
