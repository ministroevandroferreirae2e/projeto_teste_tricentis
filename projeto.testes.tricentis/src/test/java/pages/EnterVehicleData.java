package pages;

import org.openqa.selenium.By;

import metodos.Metodos;

public class EnterVehicleData {
	Metodos metodos = new Metodos();

	private By make = By.xpath("//option[text()='BMW']");
	private By model = By.xpath("//option[text()='Scooter']");
	private By cylinderCapacity = By.id("cylindercapacity");
	private By enginePerformance = By.id("engineperformance");
	private By dateofManufacture = By.id("dateofmanufacture");
	private By numberOfSeats = By.xpath("//option[text()='4']");
	private By rightHandDrive = By.xpath("//*[text()='Yes']");
	private By numberOfSeats2 = By.xpath("//*[@id=\"numberofseatsmotorcycle\"]/option[3]");
	private By fuelType = By.xpath("//option[text()='Gas']");
	private By payload = By.id("payload");
	private By totalWeight = By.id("totalweight");
	private By listPrice = By.id("listprice");
	private By licensePlateNumber = By.id("licenseplatenumber");
	private By annualMileage = By.id("annualmileage");
	private By btnNextEnterInsurantData = By.id("nextenterinsurantdata");

	public By getMake() {
		return make;
	}

	public By getModel() {
		return model;
	}

	public By getCylinderCapacity() {
		return cylinderCapacity;
	}

	public By getEnginePerformance() {
		return enginePerformance;
	}

	public By getDateofManufacture() {
		return dateofManufacture;
	}

	public By getNumberOfSeats() {
		return numberOfSeats;
	}

	public By getRightHandDrive() {
		return rightHandDrive;
	}

	public By getNumberOfSeats2() {
		return numberOfSeats2;
	}

	public By getFuelType() {
		return fuelType;
	}

	public By getPayload() {
		return payload;
	}

	public By getTotalWeight() {
		return totalWeight;
	}

	public By getListPrice() {
		return listPrice;
	}

	public By getLicensePlateNumber() {
		return licensePlateNumber;
	}

	public By getAnnualMileage() {
		return annualMileage;
	}

	public By getBtnNextEnterInsurantData() {
		return btnNextEnterInsurantData;
	}

	public void preencherAbaEnterVehicleData() {
		metodos.clicar(getMake());
		metodos.clicar(getModel());
		metodos.digitar(getCylinderCapacity(), "2000");
		metodos.digitar(getEnginePerformance(), "2000");
		metodos.digitar(getDateofManufacture(), "10/10/2010");
		metodos.clicar(getNumberOfSeats());
		metodos.clicar(getRightHandDrive());
		metodos.clicar(getNumberOfSeats2());
		metodos.clicar(getFuelType());
		metodos.digitar(getPayload(), "1000");
		metodos.digitar(getTotalWeight(), "2000");
		metodos.digitar(getListPrice(), "50000");
		metodos.digitar(getLicensePlateNumber(), "TESTE12345");
		metodos.digitar(getAnnualMileage(), "20000");
		metodos.clicar(getBtnNextEnterInsurantData());
	}

}
