package First_test_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nested_IFrames {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		
		WebDriver webdriver = new ChromeDriver(options);
		
		webdriver.manage().window().maximize();
		
		webdriver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		webdriver.switchTo().frame("frame1");
		
		webdriver.switchTo().frame("frame3");
		
		webdriver.findElement(By.id("a")).click();
		
		Thread.sleep(2000);
		
		webdriver.switchTo().parentFrame();
		
		webdriver.findElement(By.tagName("input")).sendKeys("Hi I Am QA Automation Engineer");
		
		Thread.sleep(2000);
		
		
				
		webdriver.switchTo().defaultContent(); // switch to frame into main page
		
		webdriver.switchTo().frame("frame2");
		
		WebElement element = webdriver.findElement(By.id("animals"));
		
		Select dropdown = new Select(element);
		
		dropdown.selectByVisibleText("Big Baby Cat");
		
		
		Thread.sleep(2000);
		
		webdriver.close();

	}

}
