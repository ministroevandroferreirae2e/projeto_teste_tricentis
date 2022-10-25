package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import drivers.DriversFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "steps", tags = "@preencherFormulario", monochrome = true, dryRun = false, plugin = {
		"pretty", "html:target/report-testes.html" }, snippets = SnippetType.CAMELCASE)

public class Executa extends DriversFactory {

	@BeforeClass
	public static void abrirSite() {
		String url = "http://sampleapp.tricentis.com/101/app.php";
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("Teste iniciado com sucesso");
	}

	@AfterClass
	public static void finalizarTeste() {
		driver.quit();
		System.out.println("Teste Finalizado com sucesso");
	}

}
