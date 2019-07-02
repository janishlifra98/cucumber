package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class PageObject {
static WebDriver driver;
@FindBy(name="userName") public static WebElement un;
@FindBy(name="password") public static WebElement pwd;
@FindBy(name="login") public static WebElement ok;
/*public void login()
{
	un.sendKeys("mercury");
	pwd.sendKeys("mercury");
	ok.click();
}*/
}

