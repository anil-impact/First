package demo.demo_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SetUps\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver(); 	
        
		driver.get("https://www.google.com");  
	}
	
         

}
