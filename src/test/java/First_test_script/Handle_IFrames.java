package First_test_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_IFrames {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		
		WebDriver webdriver = new ChromeDriver(options);
		
		webdriver.manage().window().maximize();
		
		webdriver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		Thread.sleep(2000);
		
//		Switch to frame by LinkText.... LinkText = 'packageListFrame' : 
		
//		webdriver.switchTo().frame("packageListFrame");
//		
//		webdriver.findElement(By.linkText("org.openqa.selenium.bidi")).click();
		
//		webdriver.switchTo().frame(String name/id) :
		
//		Switch to frame by Index...... Index = '0' :
		
//		webdriver.switchTo().frame(0);
//		
////		webdriver.switchTo().frame("packageListFrame"); // switch to frame by name attribute
//		
//		webdriver.findElement(By.linkText("org.openqa.selenium")).click();
//		
//		Thread.sleep(2000);
		
		
//		Switch to frame by Index...... Index = '1' :
		
//		webdriver.switchTo().frame(1);
//		
////		webdriver.switchTo().frame("packageListFrame"); // switch to frame by name attribute
//		
//		webdriver.findElement(By.linkText("AbstractAnnotations")).click();
		
		
//		Switch 1 to 2nd iframe : 
		
		webdriver.switchTo().frame(0);
		
		webdriver.findElement(By.linkText("org.openqa.selenium.chrome")).click();
		
		webdriver.switchTo().defaultContent();
		
		webdriver.switchTo().frame(1);
		
		webdriver.findElement(By.linkText("AddHasCasting")).click();
		
		webdriver.switchTo().defaultContent();
		
		int count = webdriver.findElements(By.tagName("iframe")).size();
		
		System.out.println("Total count of iframe tag available on webpage = "+count);
		
//		
		Thread.sleep(2000);
		
		webdriver.close();

	}

}
