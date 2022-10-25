package pages;

import org.openqa.selenium.By;

import metodos.Metodos;

public class SendQuote {
	Metodos metodos = new Metodos();

	private By email = By.id("email");
	private By phone = By.id("phone");
	private By username = By.id("username");
	private By password = By.id("password");
	private By confirmPassword = By.id("confirmpassword");
	private By comments = By.id("Comments");
	private By btnSedEmail = By.xpath("//button[@id='sendemail']");

	public By getEmail() {
		return email;
	}

	public By getPhone() {
		return phone;
	}

	public By getUsername() {
		return username;
	}

	public By getPassword() {
		return password;
	}

	public By getConfirmPassword() {
		return confirmPassword;
	}

	public By getComments() {
		return comments;
	}

	public By getBtnSedEmail() {
		return btnSedEmail;
	}

	public void preencherSendQuote() {
		metodos.digitar(getEmail(), "teste@testemail.com");
		metodos.digitar(getPhone(), "11970707070");
		metodos.digitar(getUsername(), "Testek");
		metodos.digitar(getPassword(), "Teste@123");
		metodos.digitar(getConfirmPassword(), "Teste@123");
		metodos.digitar(getComments(), "Amo a Tecnologia");

	}

	public void enviarDadosValidos() {
		metodos.clicar(getBtnSedEmail());

	}

	private By msgvalida = By.xpath("//h2[text()='Sending e-mail success!']");

	public By getMsgvalida() {
		return msgvalida;
	}

	public void validarMensagemDadosEnviados() {
		metodos.pausa(10000);
		metodos.validarTexto(getMsgvalida(), "Sending e-mail success!");
	}

}
