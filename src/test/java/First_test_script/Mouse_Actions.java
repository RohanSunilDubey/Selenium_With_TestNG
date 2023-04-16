package First_test_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_Actions {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver webdriver = new ChromeDriver(options);
		webdriver.manage().window().maximize();
		webdriver.get("https://demoqa.com/buttons");
		WebElement element = webdriver.findElement(By.id("rightClickBtn"));
//		For Right Click Action
		Actions act = new Actions(webdriver);
		act.contextClick(element).perform();
		Thread.sleep(3000);
		
		webdriver.get("https://demoqa.com/buttons");
		WebElement element2 = webdriver.findElement(By.id("doubleClickBtn"));
//		For Double Click Action
		Actions act2 = new Actions(webdriver);
		act2.doubleClick(element2).perform();
		Thread.sleep(3000);
//		webdriver.close();
		
		webdriver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement source =  webdriver.findElement(By.id("box4"));
		WebElement dest = webdriver.findElement(By.id("box107"));
//		For DragNDrop Action
		Actions act3 = new Actions(webdriver);
		act3.dragAndDrop(source, dest).perform();
		
		webdriver.get("https://www.ebay.com");
		WebElement element3 = webdriver.findElement(By.xpath("//*[contains(@href,'Health-Beauty')]"));
		Actions act4 = new Actions(webdriver);
		act4.moveToElement(element3).perform();
		Thread.sleep(5000);
		webdriver.close();

	}

}
