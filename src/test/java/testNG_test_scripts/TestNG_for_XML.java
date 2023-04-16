package testNG_test_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_for_XML {
	@Test
	public void TestCase_for_xml_topic() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		
		WebDriver webdriver = new ChromeDriver(options);
		
		webdriver.get("https://www.amazon.com");
		
		String Result = webdriver.getTitle();
		
		Assert.assertEquals(Result, "Amazon.com. Spend less. Smile more.");
		
		Thread.sleep(2000);
		
		webdriver.close();
		
	}

}
