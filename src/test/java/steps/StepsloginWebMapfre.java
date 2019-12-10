package steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class StepsloginWebMapfre {
	
	static String driverPath = "src/test/";
	public WebDriver driver;
	
	@Given("^esteja na tela web$")
	public void esteja_na_tela_web() throws Throwable {
		/***driver.get("http://somedomain/url_that_delays_loading");
		WebElement myDynamicElement = (new WebDriverWait(driver, 10))
		  .until(ExpectedConditions.presenceOfElementLocated(By.id("txtLogin_I")));
		myDynamicElement.sendKeys("teste");***/
	}

	@And("^senha$")
	public void senha() throws Throwable {	
		
		/***String url = "www.google.com.br";
		System.out.println("*******************");
		System.out.println("launching IE browser");
		System.setProperty("webdriver.ie.driver", driverPath+"IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		
		System.out.println("|---------> Instanciando Driver : ChromeDriver <------------|");
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();***/
		
	}

	@And("^user$")
	public void user() throws Throwable {

	}

	@Then("^login$")
	public void login() throws Throwable {

	}


}
