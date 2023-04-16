package First_test_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		
		WebDriver webdriver = new ChromeDriver(options);
		
		webdriver.manage().window().maximize();
		
		webdriver.get("http://uitestpractice.com/Students/SwitchTo");
		
		webdriver.findElement(By.id("alert")).click();
		
		Thread.sleep(2000);
		
		webdriver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		webdriver.findElement(By.id("confirm")).click();
		
		Thread.sleep(2000);
		
		webdriver.switchTo().alert().dismiss();
		
		Thread.sleep(2000);
		
		webdriver.findElement(By.id("confirm")).click();
		
		Thread.sleep(2000);
		
		webdriver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		webdriver.findElement(By.id("prompt")).click();
		
		Thread.sleep(2000);
		
		webdriver.switchTo().alert().sendKeys("khji");
		
		Thread.sleep(2000);
		
		webdriver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		webdriver.close();

	}

}
