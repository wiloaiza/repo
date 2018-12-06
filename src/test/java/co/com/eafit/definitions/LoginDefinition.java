package co.com.eafit.definitions;

import co.com.eafit.steps.LoginStep;
//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginDefinition {

	@Steps
	LoginStep loginStep;
	
	@Given("^que Yeison quiere acceder a Metis$")
	public void queYeisonQuiereAccederAMetis() throws Exception {
		loginStep.abrirPagina();
	}


	@When("^en escribe el usuario (.*) y la clave (.*)$")
	public void enEscribeElUsuarioDemoYLaClaveDemo(String user, String pwd) throws Exception {
		loginStep.ingresarCredenciales(user, pwd);
	}

	@Then("^el ve el mensaje de Bootstrap-Admin-Template$")
	public void elVeElMensajeDeBootstrapAdminTemplate() throws Exception {

	}
	
}
