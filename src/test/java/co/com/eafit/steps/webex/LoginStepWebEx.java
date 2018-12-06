package co.com.eafit.steps.webex;

import co.com.eafit.pageobject.webex.LoginPageWebEx;

public class LoginStepWebEx {

	
	LoginPageWebEx loginPageWebEx;
	
	public void abrirURLebEx() {
		loginPageWebEx.open();
	}

	public void webExLogin(String user, String pwd) {
		loginPageWebEx.webExLogin(user, pwd);
	}

}
