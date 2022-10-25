package pages;

import org.openqa.selenium.By;

import metodos.Metodos;

public class EnterInsurantData {
Metodos metodos = new Metodos();
	
	private By firstName = By.id("firstname");
	private By lastName = By.id("lastname");
	private By dateOfBirth = By.id("birthdate");
	private By gender = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span");
	private By streetAddress = By.id("streetaddress");
	private By country = By.xpath("//option[text()='Brazil']");
	private By zipCode = By.id("zipcode");
	private By city = By.id("city");
	private By occupation = By.xpath("//option[text()='Employee']");
	private By hobbies = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[5]/span");
	private By website = By.id("website");
	private By btnNextEnterProductData = By.id("nextenterproductdata");
	public By getFirstName() {
		return firstName;
	}
	public By getLastName() {
		return lastName;
	}
	public By getDateOfBirth() {
		return dateOfBirth;
	}
	public By getGender() {
		return gender;
	}
	public By getStreetAddress() {
		return streetAddress;
	}
	public By getCountry() {
		return country;
	}
	public By getZipCode() {
		return zipCode;
	}
	public By getCity() {
		return city;
	}
	public By getOccupation() {
		return occupation;
	}
	public By getHobbies() {
		return hobbies;
	}
	public By getWebsite() {
		return website;
	}
	public By getBtnNextEnterProductData() {
		return btnNextEnterProductData;
	}
	
	
	public void preencherAbaEnterInsurantData() {
		metodos.digitar(getFirstName(), "Teste");
		metodos.digitar(getLastName(), "Testek");
		metodos.digitar(getDateOfBirth(), "01/10/1980");
		metodos.clicar(getGender());
		metodos.digitar(getStreetAddress(), "Rua dos Testes");
		metodos.clicar(getCountry());
		metodos.digitar(getZipCode(), "07077077");
		metodos.digitar(getCity(), "Oz");
		metodos.clicar(getOccupation());
		metodos.clicar(getHobbies());
		metodos.digitar(getWebsite(), "testes.com.br");
		metodos.clicar(getBtnNextEnterProductData());
		
		
	}
}
