package co.com.eafit.steps.eafit;

import co.com.eafit.pageobject.eafit.ContactenosEafitPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;

public class ContactenosEafitSteps {

	ContactenosEafitPage contactenosEafitPage;

	@Step
	public void abrirPaginaEAFIT() {
		contactenosEafitPage.open();
	}

	@Step
	public void escribirComentario(DataTable dtDatos) {
		contactenosEafitPage.escribirNuevoComentario(dtDatos);
	}

	@Step
	public void mensajeComentarioExitoso(String strMensaje) {
		contactenosEafitPage.comentarioExitoso(strMensaje);
	}
	
}
