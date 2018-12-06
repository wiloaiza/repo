package co.com.eafit.pageobject.eafit;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

import java.util.List;

import cucumber.api.DataTable;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.eafit.edu.co/institucional/contacto/Paginas/contacto-eafit.aspx")
public class ContactenosEafitPage extends PageObject {

	@FindBy(id = "Field1")
	public WebElementFacade txtName;
	
	@FindBy(id = "Field3")
	public WebElementFacade txtEmail;
	
	@FindBy(id = "Field4")
	public WebElementFacade txtPhoneNumber;	
	
	@FindBy(id = "Field5")
	public WebElementFacade txtCiudad;		
	
	@FindBy(id = "Field6")
	public WebElementFacade txtComentario;		

	@FindBy(id = "saveForm")
	public WebElementFacade btnSave;
	
	@FindBy(xpath = "//*[@id=\"container\"]/form/h2")
	public WebElementFacade lblMensajeExito;
	
	
	public void escribirNuevoComentario(DataTable dtDatos) {
		List<List<String>> data	= dtDatos.raw();
		getDriver().switchTo().frame(0);	
		txtName.sendKeys(data.get(1).get(0));
		txtEmail.sendKeys(data.get(1).get(1));
		txtPhoneNumber.sendKeys(data.get(1).get(2));
		txtCiudad.sendKeys(data.get(1).get(3));
		txtComentario.sendKeys(data.get(1).get(4));
		
		btnSave.click();
	}


	public void comentarioExitoso(String strMensajeExito) {
		String strMensaje = lblMensajeExito.getText();
		assertThat(strMensaje, containsString(strMensajeExito));
	}

}
