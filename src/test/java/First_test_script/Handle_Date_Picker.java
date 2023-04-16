package First_test_script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Date_Picker {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String expectedDay = "22";
		String expectedMonth = "March";
		String expectedYear = "2023";
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver webdriver = new ChromeDriver(options);
		webdriver.get("https://jqueryui.com/datepicker/");
		webdriver.switchTo().frame(0);
		WebElement element = webdriver.findElement(By.id("datepicker"));
		element.click();
		
		while(true) {
		String calender_month = webdriver.findElement(By.className("ui-datepicker-month")).getText();
		String calender_year = webdriver.findElement(By.className("ui-datepicker-year")).getText();
		
		if(calender_month.equals(expectedMonth) && calender_year.equals(expectedYear))
		{
			List<WebElement> calender_row_items = webdriver.findElements(By.xpath("//table/tbody/tr/td"));
			for(WebElement e:calender_row_items)
			{
				String calender_element = e.getText();
				if(calender_element.equals(expectedDay))
				{
					e.click();
					break;
				}
			}
			break;
				
		}
		
		else {
			webdriver.findElement(By.className("ui-datepicker-next ui-corner-all")).click();
		}
		
//		Thread.sleep(2000);
		webdriver.close();
		

	}

}
}
