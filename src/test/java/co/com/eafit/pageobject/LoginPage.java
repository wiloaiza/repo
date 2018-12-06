package co.com.eafit.pageobject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
//import net.thucydides.core.Thucydides;
import net.thucydides.core.annotations.DefaultUrl;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;

@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class LoginPage extends PageObject{

	@FindBy(xpath="//*[@id=\"login\"]/form/input[1]")
	public WebElementFacade txtUser;
	
	@FindBy(xpath="//*[@id=\"login\"]/form/input[2]")
	public WebElementFacade txtPwd;
	
	@FindBy(xpath="//*[@id=\"login\"]/form/button")
	public WebElementFacade btnSingIn;	
	
	@FindBy(id = "bootstrap-admin-template")
	public WebElementFacade lblTitle;		
	
	
	public void realizarLogin(String user, String pwd) {
		txtUser.sendKeys(user);
		txtPwd.sendKeys(pwd);		
		btnSingIn.click();
		
	}
	
	public void accesoExitoso(String tituloPagina) {
		String strMensaje = lblTitle.getText();
		assertThat(strMensaje, containsString(tituloPagina));
	}
	
}
