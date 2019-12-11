package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import factory.FactoryModule;

public class PageObjectValidacao {
	
	FactoryModule modulo = new FactoryModule(); 
	
	WebDriver driver;
	
	public PageObjectValidacao(WebDriver driver) {				
		this.driver = driver;
	}
	
	public void host(String url) throws InterruptedException {			
		url = "https://www.google.com.br/";
		System.out.println("Acessando URL : " + url);
		driver.get(url);
		
	}
	
	public void pessoa() {
		//String elementStr = "//*[@id=\"resource_Pessoa\"]/div/h2/a";
		String elementStr = "//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input";
		modulo.waitingElemnt(driver, elementStr);
		WebElement element = driver.findElement(By.xpath(elementStr));
		modulo.highLight(element, driver);	
		element.click();
		
	}
	
	public void idade() throws InterruptedException {
		//String elementStr = "//*[@id=\\\"tsf\\\"]/div[2]/div[1]/div[1]/div/div[2]/input";
		//modulo.waitingElemnt(driver, elementStr);
		//WebElement element = driver.findElement(By.xpath(elementStr));
		//modulo.highLight(element, driver);
		//element.click();
				
		String elementStr = "//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input";
		modulo.waitingElemnt(driver, elementStr);
		WebElement element = driver.findElement(By.xpath(elementStr));
		modulo.highLight(element, driver);
		element.sendKeys("Bots de teste QA");
		
		String elementStr3 = "//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]";
		modulo.waitingElemnt(driver, elementStr3);
		WebElement element3 = driver.findElement(By.xpath(elementStr3));
		modulo.highLight(element3, driver);	
		element3.click();
		
		String elementStr2 = "//*[@id=\"rso\"]/div/div/div[1]/div/div/div[1]/a/h3/span";
		modulo.waitingElemnt(driver, elementStr2);
		WebElement element2 = driver.findElement(By.xpath(elementStr2));
		modulo.highLight(element2, driver);	
		element2.click();
	}
	
	public void cpf(String cpf) throws InterruptedException {
		/***System.out.println("incerindo cpf : " + cpf);
		String value = null;
		
		String elementStr = "//*[@id='Pessoa_Pessoa_ValidarMenor16Anos_content']//textarea";
		modulo.waitingElemnt(driver, elementStr);
		WebElement element = driver.findElement(By.xpath(elementStr));
		modulo.highLight(element, driver);
		element.sendKeys(value);***/
	}
	
	public void date(String data, String cpf) throws InterruptedException {
		/***System.out.println("incerindo data : " + data);
		String value = null;
		String vant1 = "{\r\n" + 
				"  \"Login\": {\r\n" + 
				"    \"Usuario\": \"\",\r\n" + 
				"    \"Senha\": \"\"\r\n" + 
				"  },\r\n" + 
				"\"cpf\": \"";
		String vant2 = "\",\"dta_anv\": \"";
		String vant3 = "\r\n" + 
				"\"}";
		
		String cp = cpf;
		String dat = data;

		if (data.equals("2003-10-29T18:40:11.619Z") && cpf.equals("")) {
			value = vant1 + cp + vant2 + dat + vant3;
		}

		if (data.equals("2001-10-29T18:40:11.619Z") && cpf.equals("")) {
			value = vant1 + cp + vant2 + dat + vant3;
		}

		if (cpf.equals("46125050009") && data.equals("")) {
			value = vant1 + cp + vant2 + dat + vant3;
		}

		if (cpf.equals("16755397075") && data.equals("")) {
			value = vant1 + cp + vant2 + dat + vant3;
		}

		if (cpf.equals("46125050009") && data.equals("2003-10-29T18:40:11.619Z")) {
			value = vant1 + cp + vant2 + dat + vant3;
		}

		if (cpf.equals("16755397075") && data.equals("2001-10-29T18:40:11.619Z")) {
			value = vant1 + cp + vant2 + dat + vant3;
		}

		String elementStr = "//*[@id='Pessoa_Pessoa_ValidarMenor16Anos_content']//textarea";
		modulo.waitingElemnt(driver, elementStr);
		WebElement element = driver.findElement(By.xpath(elementStr));
		modulo.highLight(element, driver);
		element.sendKeys(value);***/
	}
	
	public void tryOut() throws InterruptedException {
		/***String elementStr = "//*[@id=\"Pessoa_Pessoa_ValidarMenor16Anos_content\"]/form/div[2]/input";
		modulo.waitingElemnt(driver, elementStr);
		WebElement element = driver.findElement(By.xpath(elementStr));
		modulo.highLight(element, driver);
		element.click();***/
	}
	
	public void result(String result, String data) throws InterruptedException {
		/***String elementStr = "//*[@id=\"Pessoa_Pessoa_ValidarMenor16Anos_content\"]/div[2]/div[3]/pre/code/span[2]";
		modulo.waitingElemnt(driver, elementStr);
		
		String textoElement = driver.findElement(By.xpath(elementStr)).getText();
		String temp = textoElement.toString();
		System.out.println("Obtendo resultado do ano de nascimento : " + data);
		System.out.println(temp);

		if (temp.equals("2001")) {
			assertEquals("200", temp);
			System.out.println("Response Code : " + temp);
			System.out.println(result);
		}

		if (temp.equals("2003")) {
			assertEquals("400", temp);
			System.out.println("Response Code : " + temp);
			System.out.println(result);
			
		}***/
	}

}
