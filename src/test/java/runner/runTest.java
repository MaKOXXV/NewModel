package runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/features" }, glue = { "steps" }, monochrome = true, tags = {
		"@history11" },
		// @1036, @1038, @1037, @1063, @1263, @15234, @16093
		plugin = { "json:target/cucumber.json", "pretty", "html:target/cucumber.html"})

public class runTest {

	@SuppressWarnings("unchecked")
	@BeforeClass
	public static void setup() {
			
		//Configuracao para testes report em Extend
		/***
		 * ExtentCucumberFormatter.initiateExtentCucumberFormatter();
		 * 
		 * // Loads the extent config xml to customize on the report.
		 * ExtentCucumberFormatter.loadConfig(new
		 * File("src/main/resources/extent-config.xml"));
		 * 
		 * // User can add the system information as follows
		 * ExtentCucumberFormatter.addSystemInfo("Browser Name", "Firefox");
		 * ExtentCucumberFormatter.addSystemInfo("Browser version", "v47.0.1");
		 * ExtentCucumberFormatter.addSystemInfo("Selenium version", "v2.53.1");
		 ***/

		// Iniciacao

		/***
		 * SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy_hhmmss"); Date curDate
		 * = new Date(0); String strDate = sdf.format(curDate); String fileName =
		 * "E:\\Extent_Reports\\report" + strDate+".html"; File newFile = new
		 * File(fileName);
		 * ExtentCucumberFormatter.initiateExtentCucumberFormatter(newFile,false);
		 * 
		 * ExtentCucumberFormatter.initiateExtentCucumberFormatter(new
		 * File("ExtenReports/extentreports.html"),false); //Extend em XML
		 * ExtentCucumberFormatter.loadConfig(new
		 * File("src/main/resources/extent-config.xml"));
		 * 
		 * //Informacoes de instanciamento
		 * ExtentCucumberFormatter.addSystemInfo("Browser Name", "GoogleChrome");
		 * ExtentCucumberFormatter.addSystemInfo("Browser version", "v76.0");
		 * ExtentCucumberFormatter.addSystemInfo("Selenium version", "v2.53.0");
		 * 
		 * // Informacoes por HasMap @SuppressWarnings("rawtypes") Map systemInfo = new
		 * HashMap(); systemInfo.put("Cucumber version", "v1.2.3");
		 * systemInfo.put("Extent Cucumber Reporter version", "v1.1.0");
		 * ExtentCucumberFormatter.addSystemInfo(systemInfo);
		 ***/
	}
}
