package First_test_script;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenshot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		
		WebDriver webdriver = new ChromeDriver(options);
		
		webdriver.manage().window().maximize();
		
		webdriver.get("https://www.instagram.com/");
		
		Thread.sleep(5000);
		
//		Capture full page Screenshot :
		
//		Convert web driver object into the TakeScreenshot interface
		
		TakesScreenshot screenshot = (TakesScreenshot)webdriver;
		
//		Call getScreenshotAs method to create a image file : 
		
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\HP\\eclipse-workspace\\selenium_maven_project\\screenshots\\fullpage1.png");
		
//		Copy image file to the destination : 
		
		FileUtils.copyFile(src, dest);
		
		Thread.sleep(3000);
		
//		Capture some section of web page Screenshot :
			
//			Convert web driver object into the TakeScreenshot interface
			
//			TakesScreenshot screenshot = (TakesScreenshot)webdriver;.
//		
		WebElement section =  webdriver.findElement(By.id("loginForm"));
////			
//			Call getScreenshotAs method to create a image file : 
////			
			File src2 = section.getScreenshotAs(OutputType.FILE);
////			
			File dest2 = new File("C:\\Users\\HP\\eclipse-workspace\\selenium_maven_project\\screenshots\\fullpage2.png");
////			
//////			Copy image file to the destination : 
////			
			FileUtils.copyFile(src2, dest2);
////			
			Thread.sleep(3000);
			
			
			
			WebElement section2 =  webdriver.findElement(By.name("username"));
			
//			Call getScreenshotAs method to create a image file : 
			
			File src3 = section2.getScreenshotAs(OutputType.FILE);
			
			File dest3 = new File("C:\\Users\\HP\\eclipse-workspace\\selenium_maven_project\\screenshots\\fullpage3.png");
			
//			Copy image file to the destination : 
			
			FileUtils.copyFile(src3, dest3);
			
			Thread.sleep(3000);
		
		
		webdriver.close();
		
		
		

	}

}
