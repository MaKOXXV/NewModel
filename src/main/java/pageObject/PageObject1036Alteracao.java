package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import factory.FactoryModule;

public class PageObject1036Alteracao {
	FactoryModule modulo = new FactoryModule(); 
	
	WebDriver driver;
	
	public PageObject1036Alteracao(WebDriver driver) {				
		this.driver = driver;
	}
	
	public void valide() {
		//String element = "//*[@id=\"logo\"]/span";
		String element = "//*[@id=\"hplogo\"]";
		modulo.waitingElemnt(driver, element);
		WebElement textoElement;
		textoElement = driver.findElement(By.xpath(element));
		textoElement.getText();
		modulo.highLight(textoElement, driver);	
	}

}
