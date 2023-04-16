package First_test_script;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		
		WebDriver webdriver = new ChromeDriver(options);
		
		webdriver.get("https://formstone.it/components/dropdown/demo/");
		
		WebElement element1 =  webdriver.findElement(By.id("demo_native"));
		
		Select dropdown1 = new Select(element1);
		
		dropdown1.selectByVisibleText("Two");   // select Two
		
		Thread.sleep(2000);
		
		WebElement element2 = webdriver.findElement(By.id("demo_basic_2"));
		
		Select dropdown2 = new Select(element2);
		
		dropdown2.selectByValue("AZ");         // Select Arizona
		
		Thread.sleep(5000);
		
//		webdriver.close();
		
//		WebElement element3 = webdriver.findElement(By.id("demo_external"));
//		
//		Select dropdown3 = new Select(element3);   // Select CNN
//		
//		dropdown3.selectByIndex(3);
//		
//		Thread.sleep(3000);
		
//		webdriver.close();
		
		WebElement element4 = webdriver.findElement(By.id("demo_basic_2"));
		
		Select dropdown4 = new Select(element4);   // Select Arizona
		
		dropdown4.selectByIndex(4);
		
		Thread.sleep(2000);
		
//		webdriver.close();
		
		WebElement element5 = webdriver.findElement(By.id("demo_custom_2"));
		
		Select dropdown5 = new Select(element5);
		
		dropdown5.selectByValue("4");        // Select Four
		
		Thread.sleep(3000);
		
		WebElement element6 = webdriver.findElement(By.id("demo_custom_2"));
		
		Select dropdown6 = new Select(element6);   
		
		dropdown6.selectByIndex(4);            // Select Five
		
		Thread.sleep(2000);
		
//		webdriver.close();
		
		WebElement element7 = webdriver.findElement(By.id("demo_custom_2"));
		
		Select dropdown7 = new Select(element7);
		
		if(dropdown7.isMultiple())
		{
			System.out.println("Dropdown is multiple");
		}
		else
		{
			System.out.println("Dropdown is not multiple");
		}
		
//		webdriver.close();
		
		List <WebElement> optiondata = dropdown7.getOptions(); // getOption() gives list of webElements
		for (WebElement webElement : optiondata) {
			System.out.println(webElement.getText());
		}
		webdriver.close();
	}

}
