package metodos;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;

import drivers.DriversFactory;

public class Metodos extends DriversFactory {
	
	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void digitar(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void submit(By elemento) {
		driver.findElement(elemento).submit();
	}

	public void pausa(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void validarTexto(By elemento, String textoEsperado) {
		String textoCapturado = driver.findElement(elemento).getText();
		assertTrue(textoCapturado.contains(textoEsperado));
	}


}
