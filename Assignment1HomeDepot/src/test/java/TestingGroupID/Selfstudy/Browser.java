package TestingGroupID.Selfstudy;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Browser {
	WebDriver driver;
	// HomePage= new HomePage(driver);
  @SuppressWarnings("deprecation")
@Test(priority =1)
  public void CVS001() throws IOException { 
	 HomePage HomePage= new HomePage(driver);
	HomePage.CreateAnAccount();
	shots();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	HomePage.RegisterButton();
  }
  
  @SuppressWarnings("deprecation")
@Test (priority =2)
  public void CVS002() {
	 HomePage HomePage= new HomePage(driver);
	 HomePage.PersonalAccount();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
  

@SuppressWarnings("deprecation")
@Test(priority =3)
  public void CVS003() {
	HomePage HomePage= new HomePage(driver);
	HomePage.Email();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  }
  
  @SuppressWarnings("deprecation")
@Test(priority =4)
  public void CVS004() {
	  HomePage HomePage= new HomePage(driver);
	  HomePage.Password();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
  
  @SuppressWarnings("deprecation")
@Test (priority =5)
 public void CVS005() {
	  HomePage HomePage= new HomePage(driver);
	  HomePage.CheckPassword();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  }
  
  @SuppressWarnings("deprecation")
  @Test (priority =6)
 public void CVS006() {
	  HomePage HomePage= new HomePage(driver);
	  HomePage.ZipCode();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
 @SuppressWarnings("deprecation")
@Test(priority =7)
 public void CVS007() {
	  HomePage HomePage= new HomePage(driver);
	  HomePage.PhoneNumber();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
 
 @SuppressWarnings("deprecation")
@Test(priority =8)
 public void CVS008() {
	  HomePage HomePage= new HomePage(driver);
	  HomePage.CheckBox1();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
 
 @SuppressWarnings("deprecation")
@Test (priority =9)
 public void CVS009() {	  
	  HomePage HomePage= new HomePage(driver);
	  HomePage.Checkbox2();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

 
  
  @BeforeMethod
  public void beforeMethod() {
	 
  }

  @AfterMethod
  public void afterMethod() {
	  
  }

  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahno\\eclipse-workspace\\Cucmber\\Selfstudy\\Driver\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("https://www.homedepot.com");
	  driver.manage().window().maximize();
	  
	  
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.close();
  }

  
  public void shots() throws IOException {
	  File Capture= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(Capture, new File("C:\\Users\\mahno\\eclipse-workspace\\Cucmber\\Selfstudy\\src\\Screenshots\\Screenshot.PNG"));
  }
}


