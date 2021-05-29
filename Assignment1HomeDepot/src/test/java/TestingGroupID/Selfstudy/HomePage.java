package TestingGroupID.Selfstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class HomePage {
	WebDriver driver;
	@FindBy(xpath= "//*[@id=\'headerMyAccountTitle\']") 
	WebElement CreateAnAccount;
	
	public void CreateAnAccount()	{
	Actions ob= new Actions(driver);
	ob.moveToElement(CreateAnAccount).click().build().perform();
	}
	
	@FindBy(xpath="//*[@id='SPSORegister']")
	WebElement RegisterButton;
	
	public void RegisterButton()	{
	Actions ob= new Actions(driver);
	ob.moveToElement(RegisterButton).click().build().perform();
	}
		
	
	
	@FindBy(xpath="//*[@id=\"single-signin__body\"]/div/div[2]/div/div[2]/div[1]/div/div/div/div[4]/button/span")
	WebElement PersonalAccount;
	
public void PersonalAccount() {
		Actions ob= new Actions (driver);
		ob.moveToElement(PersonalAccount).click().build().perform();
		softAssert.assertEquals("I'm shopping for myself", "I'm shopping for myself");
		softAssert.assertEquals("Enjoy faster checkout", "Enjoy faster checkout");
		softAssert.assertEquals("Save more with exclusive offers", "Save more with exclusive offers");
		softAssert.assertEquals("Favorite product and save lists", "Favorite product and save lists");
		softAssert.assertAll();
	}
	
	@FindBy(name="email")
	WebElement Email;
	
	public void Email()	{
	Actions ob= new Actions(driver);
	ob.moveToElement(Email).click().sendKeys("hassan001@yahoo.com").build().perform();;
	}
	
	@FindBy(id="password-input-field")
	WebElement Password;
	public void Password()	{
		Actions ob= new Actions(driver);
		ob.moveToElement(Password).click().sendKeys("TestQA01&").build().perform();
		}
	
	
	@FindBy(xpath="//*[@id='showPasswordCheck']")
	WebElement CheckPassword;
	
	public void CheckPassword()	{
	Actions ob= new Actions(driver);
	ob.moveToElement(CheckPassword).click().build().perform();
	}
	
		
	@FindBy(id="zipCode")
	WebElement ZipCode;
	
	public void ZipCode() {
	Actions ob= new Actions(driver);
	ob.moveToElement(ZipCode).click().sendKeys("22304").build().perform();
	}
	
	@FindBy(name="phone")
	WebElement PhoneNumber;
	public void PhoneNumber() {
	Actions ob= new Actions(driver);
	ob.moveToElement(PhoneNumber).click().sendKeys("5711119999").build().perform();
	
	}
	
	@FindBy(xpath= "//*[@id='kmsi-checkbox']")
	WebElement CheckBox1;
	public void CheckBox1() {
		Actions ob= new Actions(driver);
		ob.moveToElement(CheckBox1).click().build().perform();
	}
	
	@FindBy(xpath="//*[@id='verify-phone-checkbox']")
	WebElement CheckBox2;
	
	public void Checkbox2() {
		Actions ob= new Actions(driver);
		ob.moveToElement(CheckBox2).click().build().perform();
	}
		
	
	public HomePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

	SoftAssert softAssert= new SoftAssert();
	
	}
	



