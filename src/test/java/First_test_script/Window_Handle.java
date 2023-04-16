package First_test_script;

import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_Handle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		
		WebDriver webdriver = new ChromeDriver(options);
		
//		webdriver.get("https://www.google.com");
//		
//		System.out.println("Title of Google Page = "+webdriver.getTitle());
//		
//		webdriver.switchTo().newWindow(WindowType.TAB);
//		
//		webdriver.get("https://www.facebook.com");
//		
//		System.out.println("Title of Facebook Page = "+webdriver.getTitle());
//		
////		getWindowHandles() method always return Set ( wo bi string type mai Set)
//		
//		Set <String> window_handles =  webdriver.getWindowHandles();
//		
//		List <String> handles = new ArrayList<String>();
//		
//		handles.addAll(window_handles);
//		
//		webdriver.close();
//		
//		webdriver.switchTo().window(handles.get(0));
//		
//		System.out.println("Title of the google page once agin = "+webdriver.getTitle());
//		
//		webdriver.close();
		
		webdriver.get("https://www.google.com");
		
		System.out.println("Title of google page = "+webdriver.getTitle());
		
		webdriver.switchTo().newWindow(WindowType.TAB);
		
		webdriver.get("https://www.facebook.com");
		
		String facebook_title = webdriver.getTitle();
		
		System.out.println("Title of facebook page = "+facebook_title);
		
		Set <String> window_handle = webdriver.getWindowHandles();
		
		List <String> handles = new ArrayList<String>();
		
		handles.addAll(window_handle);
		
		webdriver.close();
		
		webdriver.switchTo().window(handles.get(0));
		
		System.out.println("Title of the google page = "+webdriver.getTitle());
		
		webdriver.close();

	}

}
