package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EnterInsurantData;
import pages.EnterProductData;
import pages.EnterVehicleData;
import pages.SelectPriceOption;
import pages.SendQuote;

public class PreencherFormularioTeste {

	EnterVehicleData vehicle = new EnterVehicleData();
	EnterInsurantData insurant = new EnterInsurantData();
	EnterProductData product = new EnterProductData();
	SelectPriceOption price = new SelectPriceOption();
	SendQuote quote = new SendQuote();

	@Given("que esteja no site sampleapp.tricentis")
	public void queEstejaNoSiteSampleappTricentis() {

	}

	@Given("preencha todas as abas com dados validos")
	public void preenchaTodasAsAbasComDadosValidos() {
		vehicle.preencherAbaEnterVehicleData();
		insurant.preencherAbaEnterInsurantData();
		product.preencherAbaEnterProductData();
		price.selecionarPriceOption();
		quote.preencherSendQuote();

	}

	@When("enviar o formulario")
	public void enviarOFormulario() {
		quote.enviarDadosValidos();

	}

	@Then("valido a mensagem de dados enviados com sucesso")
	public void validoAMensagemDeDadosEnviadosComSucesso() {
		quote.validarMensagemDadosEnviados();

	}

}
