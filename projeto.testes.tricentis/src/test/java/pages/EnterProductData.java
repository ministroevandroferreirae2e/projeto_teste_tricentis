package pages;

import org.openqa.selenium.By;

import metodos.Metodos;

public class EnterProductData {
	Metodos metodos = new Metodos();

	private By startDate = By.id("startdate");
	private By insuranceSum = By.xpath("//option[text()=' 3.000.000,00']");
	private By meritRating = By.xpath("//option[text()='Super Bonus']");
	private By damageInsurance = By.xpath("//option[text()='Full Coverage']");
	private By optionalProducts = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span");
	private By courtesyCar = By.xpath("//option[text()=' Yes']");
	private By btnNextSelectPriceOption = By.id("nextselectpriceoption");

	public By getStartDate() {
		return startDate;
	}

	public By getInsuranceSum() {
		return insuranceSum;
	}

	public By getMeritRating() {
		return meritRating;
	}

	public By getDamageInsurance() {
		return damageInsurance;
	}

	public By getOptionalProducts() {
		return optionalProducts;
	}

	public By getCourtesyCar() {
		return courtesyCar;
	}

	public By getBtnNextSelectPriceOption() {
		return btnNextSelectPriceOption;
	}

	public void preencherAbaEnterProductData() {
		metodos.digitar(getStartDate(), "12/12/2022");
		metodos.clicar(getInsuranceSum());
		metodos.clicar(getMeritRating());
		metodos.clicar(getDamageInsurance());
		metodos.clicar(getOptionalProducts());
		metodos.clicar(getCourtesyCar());
		metodos.clicar(getBtnNextSelectPriceOption());

	}

}
