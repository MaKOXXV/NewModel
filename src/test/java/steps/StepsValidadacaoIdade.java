package steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import factory.FactoryModule;
import pageObject.PageObject1036Alteracao;
import pageObject.PageObjectValidacao;

public class StepsValidadacaoIdade {
	WebDriver driver;
	
	FactoryModule modulo = new FactoryModule();
	PageObjectValidacao validate = new PageObjectValidacao(null);
	PageObject1036Alteracao step1036 = new PageObject1036Alteracao(null);

	@Before
	public void setUp() {
		
	}

	@After
	public void tearDown(Scenario scenario) throws InterruptedException {
		modulo.failScreenshot(scenario);
        if (driver != null) {
            driver.quit();
        }
        
	}
	
	@Given("esteja na tela tela Swagger")
	public void esteja_na_tela_tela_Swagger() {
		System.out.println("Estagio inicial Instanciamento");
		System.out.println("------------EXECUCAO DE TESTES-----------");
		driver = modulo.iniciacao();
		validate = new PageObjectValidacao(driver);
		step1036 = new PageObject1036Alteracao(driver);
	}

	@Given("MapfreCap API {string}")
	public void mapfrecap_API(String url) throws InterruptedException {
		validate.host(url);
	}

	@When("validar que estou na pagina MapfreCap API")
	public void validar_que_estou_na_pagina_MapfreCap_API() {
		step1036.valide();
	}

	@When("clicar em pessoa")
	public void clicar_em_pessoa() {
		validate.pessoa();

	}

	@When("clicar em pessoa\\/validarIdade")
	public void clicar_em_pessoa_validarIdade() throws InterruptedException {
		validate.idade();
	}

	@When("inserir dados com a data {string} e {string}")
	public void inserir_dados_com_a_data_e(String data, String cpf) throws InterruptedException {
		validate.cpf(cpf);
		validate.date(data, cpf);

	}

	@When("clicar em Try it out")
	public void clicar_em_Try_it_out() throws InterruptedException {
		validate.tryOut();

	}

	@Then("{string} para quem nasceu em {string}")
	public void para_quem_nasceu_em(String result, String data) throws InterruptedException {
		validate.result(result, data);
	}

	
}
