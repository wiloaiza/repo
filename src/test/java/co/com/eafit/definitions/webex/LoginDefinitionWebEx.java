package co.com.eafit.definitions.webex;

import co.com.eafit.steps.webex.LoginStepWebEx;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;



public class LoginDefinitionWebEx {

	@Steps
	LoginStepWebEx loginWebEx;
	
	@Given("^Se requiere acceder a WebEx$")
	public void se_requiere_acceder_a_WebEx() throws Exception {
		loginWebEx.abrirURLebEx();
	}

	@When("^Se digita usuario (.*) y clave (.*)$")
	public void se_digita_usuario_y_clave(String user, String pwd) throws Exception {
		loginWebEx.webExLogin(user, pwd);
	}

	@Then("^Valida acceso exitoso$")
	public void valida_acceso_exitoso() throws Exception {

	}
	
}
