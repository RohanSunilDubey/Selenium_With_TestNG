package First_test_script;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor_Opertions {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
//		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		
		WebDriver webdriver =  new ChromeDriver(options);
		
		webdriver.manage().window().maximize();
		
		webdriver.get("http://uitestpractice.com/Students/Index?Search_Data=");
		
//		To enter a data into textbox : Use = "document.getElementById('Search_Data').value='aaaa';"
		
		JavascriptExecutor js = (JavascriptExecutor)webdriver;
		js.executeScript("document.getElementById('Search_Data').value='aaaa';");
		 
		WebElement element = webdriver.findElement(By.xpath("//*[contains(@value,'Find')]"));
		
//		draw border around webElement :
		js.executeScript("arguments[0].style.border = '3px solid red';", element);
		
		Thread.sleep(3000);
		
//		To click any btn : Use = "arguments[0].click();", element
		js.executeScript("arguments[0].click();", element);
		
		Thread.sleep(2000);
		
//		To refresh a browser : Use = "history.go(0)"
		js.executeScript("history.go(0)");
		
		
//		To get domain of current webpage : Use = "return document.domain;").toString();
		String domain_nama = js.executeScript("return document.domain;").toString();
		
		System.out.println("Domain name of webpage = "+domain_nama);
		
//		To get title of current webpage : Use = "return document.title;").toString();
		String title_name = js.executeScript("return document.title;").toString();
		
		System.out.println("Title of webpage = "+title_name);
		
		
//		To get URL of current webpage : Use = "return document.URL;").toString();
		String url = js.executeScript("return document.URL;").toString();
		
		System.out.println("Url of webpage = "+url);
		
//		zoom 50%
//		js.executeScript("document.body.style.zoom = '50%'");
		

		System.out.println("Inner height of webpage = "+js.executeScript("return window.innerHeight;").toString());
		
		System.out.println("Inner width of webpage = "+js.executeScript("return window.innerWidth;").toString());
		
		Thread.sleep(3000);
		
//		scroll vertically till the end : 
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		Thread.sleep(2000);
			
//		js.executeScript("alert('This is my alert msG');");
		
		js.executeScript("window.location = 'https://www.google.com'");
		
		webdriver.close();

	}

}
