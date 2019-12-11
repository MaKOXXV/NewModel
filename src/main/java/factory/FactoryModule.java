package factory;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;

public class FactoryModule {

	static String browser = "Google";

	WebDriver driver;
	Scenario scenario;

	@SuppressWarnings("deprecation")
	public WebDriver iniciacao() {

		switch (browser) {
		case "Google":
			System.out.println("|---------> Instanciando Driver : ChromeDriver <------------|");
			System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "FireFox":
			System.out.println("|---------> Instanciando Driver : FireFox <------------|");
			 System.setProperty("webdriver.gecko.driver","src/test/resources/geckodriver.exe");
			 DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			 capabilities.setCapability("marionette",true);
			 driver= new FirefoxDriver(capabilities);
			 break;
		case "IExplore":
			System.out.println("|---------> Instanciando Driver : Internet Explore <------------|");
			System.setProperty("webdriver.ie.driver", "src/test/resources/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
		default:
			System.out.println("Este Browser nao e valido");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

	public void highLight(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Objeto que permite alteracao de cor entre labels na estrutura selecionada
		js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid green;');", element);
		
		
	}
	
	public void screenShot(Scenario scenario) {
		byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshotBytes, "image/png");
	}
	

	public void waitingElemnt(WebDriver driver, String findex) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(presenceOfElementLocated(By.xpath(findex)));

		} catch (NullPointerException ex) {
			System.out.println("FALHA AO BUSCA ELEMENTO");
		}
	}

	public void failScreenshot(Scenario scenario) {
		if (scenario.isFailed()) {
			byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshotBytes, "image/png");
		}

		if (driver != null) {
			driver.quit();
		}
	}
}
