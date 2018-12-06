package co.com.eafit.steps;

import co.com.eafit.pageobject.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginStep {

	LoginPage loginPage;
	
	@Step
	public void abrirPagina() {
		loginPage.open();
	}
	
	@Step
	public void ingresarCredenciales(String user, String pwd) {
		loginPage.realizarLogin(user, pwd);
	}
	
}
