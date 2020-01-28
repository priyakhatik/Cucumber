package stepDefinition;


import java.util.List;
//import cucumber.api.java.en.Then;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition.PageObjects;


//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.When;

public class Logintest {

	public static WebDriver driver;
	PageObjects po;
	@Given("^Navigate to home page$")
public void HomePage() {
		System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		po=new PageObjects(driver);
		driver.get("http://10.232.237.143:443/TestMeApp");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
	@When("^users enter username or password$")
	public void password() {
		po.signin.click();
		po.username.sendKeys("lalitha");
		po.password.sendKeys("Password123");
		po.logins.click();
		}
	@Then("^user logged in successfully$")
	public void LoginSucessfully( ) {
			System.out.println("User login sucessfully");
	}
	@When ("Larry searches below products in the search box")
	public void larry_searches_below_products_in_the_search_box (DataTable dt) {
		List<String> product=dt.asList(String.class);
		
		for(String s : product) {
			driver.findElement(By.name("products")).sendKeys(s);
			driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
			
		}
		
		//throw new cucumber.api.PendingException();
		}
	
	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	 public void entersunamepwd(String username, String password) {
	 
	po.signin.click();
	po.username.sendKeys(username);
	po.password.sendKeys(password);
	po.logins.click();


	}

	
		@Then ("product should be added in the cart if available")	
		public void addcart( ) {
			System.out.println("products added");	
			
		
	
		}
		
	}

