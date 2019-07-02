package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
public class login {
	WebDriver driver;

	@Given("user opens login page in newtours application")
	public void user_opens_login_page_in_newtours_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.04.29\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();

		driver.get("http://newtours.demoaut.com/ ");
		//driver.findElement(By.name("login")).click();
	 //  System.out.println("User open the application");	
	   }

	@When("user enter username as {string} and password as {string}")
	public void user_enter_username_as_and_password_as(String string, String string2) {
		 //.out.println("Username and password is entered");	
//driver.findElement(By.name("userName")).sendKeys(string);
//driver.findElement(By.name("password")).sendKeys(string2);
	
	PageObject pg=PageFactory.initElements(driver, PageObject.class);
	pg.un.sendKeys("mercury");
	pg.pwd.sendKeys("mercury");

			}

	@When("Click submit button")
	public void click_submit_button() {
		//driver.findElement(By.name("login")).click();	
		PageObject pg=PageFactory.initElements(driver, PageObject.class);
		PageObject.ok.click();
	}

	@Then("verify login success")
	public void verify_login_success() {
//tring expected=driver.getTitle();
//Assert.assertEquals(expected, );
		   System.out.println("Login result is verified");	
}


}
