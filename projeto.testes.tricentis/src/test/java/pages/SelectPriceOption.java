package pages;

import org.openqa.selenium.By;

import metodos.Metodos;

public class SelectPriceOption {
	Metodos metodos = new Metodos();

	private By selectOption = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span");
	private By btnNextSendQuote = By.xpath("//button[@id='nextsendquote']");

	public By getSelectOption() {
		return selectOption;
	}

	public By getBtnNextSendQuote() {
		return btnNextSendQuote;
	}

	public void selecionarPriceOption() {
		metodos.clicar(getSelectOption());
		metodos.pausa(1000);
		metodos.clicar(getBtnNextSendQuote());
	}
}
