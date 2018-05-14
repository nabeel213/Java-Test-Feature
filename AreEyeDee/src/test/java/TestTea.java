import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;

/*
String expectedUrl = "https://www.google.com";
WebDriver driver = new FirefoxDriver();
driver.get(expectedUrl);
try{
  Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
  System.out.println("Navigated to correct webpage");
}
catch(Throwable pageNavigationError){
  System.out.println("Didn't navigate to correct webpage");
}
*/
public class TestTea {
	
	String targetUrl = "http://www.practiceselenium.com/welcome.html";
	
	WebDriver driver2;

	@Before
	@Given("^the correct web address$")
	public void the_correct_web_address() throws Throwable {

		browser();
		
		throw new PendingException();
	}

	@When("^I navigate to the 'Menu' page$")
	public void i_navigate_to_the_Menu_page() throws Throwable {
		
		WebElement menuClick = driver2.findElement(By.xpath("//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a"));
		menuClick.click();
		
		throw new PendingException();
	}

	@Then("^I can browse a list of the available products\\.$")
	public void i_can_browse_a_list_of_the_available_products() throws Throwable {
		
		assertEquals(targetUrl, driver2.getCurrentUrl());
		
		throw new PendingException();
	}

	@When("^I click the checkout button$")
	public void i_click_the_checkout_button() throws Throwable {
		
		throw new PendingException();
	}

	@Then("^I am taken to the checkout page$")
	public void i_am_taken_to_the_checkout_page() throws Throwable {
		
		throw new PendingException();
	}

	public void browser() {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Downloads/chromedriver_win32/chromedriver.exe");
		driver2 = new ChromeDriver();
		driver2.get("http://www.practiceselenium.com/welcome.html");
		driver2.manage().window().maximize();
		
	}
}
