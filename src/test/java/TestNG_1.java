import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_1 {
	
  @BeforeTest
  public void browser() {
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver", "D:\\SetUps\\Selenium\\chromedriver_win32\\chromedriver.exe");
      driver = new ChromeDriver(); 	
      
		driver.get("https://www.google.com");  
  }
  
  
  @Test(alwaysRun=true)
  public void Test1() 
  {
	 
	 System.out.println(" test one by default");
  }
  

 @Test(priority=-1)
  public void Test12()
  {
	  
	  
	  System.out.println("test2 with priority= -1");
  }
  
 @Test(enabled=true)
 public void Test2()
 {
	 System.out.println("test 2");
 }
	
 @Test(priority=0)
  public void Test3()
  {
	  System.out.println("test3 with priority= 0");
	  
  }
 @Test(testName="hello")
 public void Test4()
 {
	 System.out.println("test4");
 }
 
 
  @BeforeMethod
  public void before()
  {
 	 
 	 System.out.println("before method");
  }
  @AfterMethod
  public void after12()
  {
 	 
 	 System.out.println("After method1");
  }
  
  
  @AfterTest
  public void after1()
  {
	  
	  System.out.println("after test");
	 
  }
  
  @BeforeSuite(description="description")
	public void suite()
	{
		
		System.out.println("before suite");
	}
  @AfterSuite
  public void after()
  {
	  System.out.println("after suite");
	  
  }
}
