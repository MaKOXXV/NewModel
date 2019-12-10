package factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FactoryFramesToFrame {
	
	WebDriver driver;
	String masterSubMenu = "iframeaspsubmenu";
	
	public void inputBuscaInclusaoPedidoDadosCadastrais(WebDriver driver) {
		WebElement iframe1 = driver.findElement(By.xpath(masterSubMenu));
		driver.switchTo().frame(iframe1);
		WebElement iframe2 = driver.findElement(By.xpath("I1"));
		driver.switchTo().frame(iframe2);
		
	}
	
	public void inputBuscaInclusaoPedidoDadosEndereco(WebDriver driver) {
		WebElement iframe1 = driver.findElement(By.xpath(masterSubMenu));
		driver.switchTo().frame(iframe1);
		WebElement iframe2 = driver.findElement(By.xpath("submenu"));
		driver.switchTo().frame(iframe2);
		
	}
	
	public void inputBuscaInclusaoPedidoDadosEnderecoCadastro(WebDriver driver) {
		WebElement iframe1 = driver.findElement(By.xpath(masterSubMenu));
		driver.switchTo().frame(iframe1);
		WebElement iframe2 = driver.findElement(By.xpath("I2"));
		driver.switchTo().frame(iframe2);
		
	}
	
	public void inputBuscaInclusaoIncluirExcluir(WebDriver driver) {
		WebElement iframe1 = driver.findElement(By.xpath(masterSubMenu));
		driver.switchTo().frame(iframe1);
		WebElement iframe2 = driver.findElement(By.xpath("toolbarsubmenu"));
		driver.switchTo().frame(iframe2);
		
	}

}
