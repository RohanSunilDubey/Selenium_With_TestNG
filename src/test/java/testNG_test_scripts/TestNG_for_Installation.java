package testNG_test_scripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_for_Installation {
	
	@Test
	public void Page() {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		
		WebDriver webdriver = new ChromeDriver(options);
		
		webdriver.get("https://www.google.com");
		
		String actual_result = webdriver.getTitle();
		
		String expected_result = "Google";
		
		Assert.assertEquals(actual_result, expected_result);
		
		webdriver.close();
		
	}

}
