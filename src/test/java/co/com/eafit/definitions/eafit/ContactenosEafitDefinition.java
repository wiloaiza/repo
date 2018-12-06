package co.com.eafit.definitions.eafit;

import co.com.eafit.steps.eafit.ContactenosEafitSteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ContactenosEafitDefinition {

	@Steps
	ContactenosEafitSteps contactenosEafitSteps;
	
	@Given("^que Yeison quiere escribir un comentario a la Universidad EAFIT$")
	public void queYeisonQuiereEscribirUnComentarioALaUniversidadEAFIT() throws Exception {
		contactenosEafitSteps.abrirPaginaEAFIT();
	}


	@When("^el diligencia el comentario$")
	public void elDiligenciaElComentario(DataTable dtDatos) throws Exception {
		contactenosEafitSteps.escribirComentario(dtDatos);
	}

	@Then("^el visualiza el pantalla el mensaje (.*)$")
	public void elVisualizaElPantallaElMensajeMuchasGraciasPorSuComentario(String strMensajeExitoso) throws Exception {
		contactenosEafitSteps.mensajeComentarioExitoso(strMensajeExitoso);
	}
	
}
