package logout;

import _core.BaseScreen;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;


public class ScreenLogout extends BaseScreen {

	public ScreenLogout() {
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
